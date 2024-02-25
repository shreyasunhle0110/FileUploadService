package com.Bank_Property_Evaluation.FIleUploadService;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "property")  
public class Property {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private List<JointBorrower> jointBorrowers;

    private String initiatorName;
    private String businessUnit;
    private String contactNumber;
    private String facilityType;
    private String facilityCategory;
    private String facilityPurpose;
    private String facilityTerms;
    private String ccy;
    private int amount;
    private boolean isHousingLoan;
    private String fosReference;
    private String typeOfEvaluation;
    @CreationTimestamp
    private LocalDateTime createdDateTime;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<JointBorrower> getJointBorrowers() {
		return jointBorrowers;
	}
	public void setJointBorrowers(List<JointBorrower> jointBorrowers) {
		this.jointBorrowers = jointBorrowers;
	}
	public String getInitiatorName() {
		return initiatorName;
	}
	public void setInitiatorName(String initiatorName) {
		this.initiatorName = initiatorName;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public String getFacilityCategory() {
		return facilityCategory;
	}
	public void setFacilityCategory(String facilityCategory) {
		this.facilityCategory = facilityCategory;
	}
	public String getFacilityPurpose() {
		return facilityPurpose;
	}
	public void setFacilityPurpose(String facilityPurpose) {
		this.facilityPurpose = facilityPurpose;
	}
	public String getFacilityTerms() {
		return facilityTerms;
	}
	public void setFacilityTerms(String facilityTerms) {
		this.facilityTerms = facilityTerms;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public boolean isHousingLoan() {
		return isHousingLoan;
	}
	public void setHousingLoan(boolean isHousingLoan) {
		this.isHousingLoan = isHousingLoan;
	}
	public String getFosReference() {
		return fosReference;
	}
	public void setFosReference(String fosReference) {
		this.fosReference = fosReference;
	}
	public String getTypeOfEvaluation() {
		return typeOfEvaluation;
	}
	public void setTypeOfEvaluation(String typeOfEvaluation) {
		this.typeOfEvaluation = typeOfEvaluation;
	}
    
    

}
