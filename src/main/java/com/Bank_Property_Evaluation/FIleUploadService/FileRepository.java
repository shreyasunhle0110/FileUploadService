package com.Bank_Property_Evaluation.FIleUploadService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
    // Add custom query methods if needed
}

