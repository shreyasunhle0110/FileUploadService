package com.Bank_Property_Evaluation.FIleUploadService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;

@Component
public class JobWorkers {
    private static final Logger logger = LoggerFactory.getLogger(JobWorkers.class);

    @Autowired
    ObjectMapper mapper;

    @Autowired
    FileRepository fileRepo;

    @JobWorker
    public void saveUploadedFile(final JobClient client, final ActivatedJob job) {
        try {
            logger.info("Saving uploaded file for job with key: {}", job.getKey());

            UploadFileRequest fileUploadRequest = mapper.convertValue(job.getVariable("uploadFileRequest"), UploadFileRequest.class);
            Property savedProperty = mapper.convertValue(job.getVariable("savedProperty"), Property.class);

            File file = new File();
            file.setFileName(fileUploadRequest.getFileName());
            file.setFileType(fileUploadRequest.getFileType());
            file.setProperty(savedProperty);
            fileRepo.save(file);

            logger.info("Uploaded file saved successfully");
        } catch (Exception e) {
            logger.error("Failed to save uploaded file for job with key: {}", job.getKey(), e);
        }
    }
}
