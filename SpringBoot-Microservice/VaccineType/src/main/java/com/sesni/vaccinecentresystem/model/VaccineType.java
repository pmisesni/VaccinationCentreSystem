package com.sesni.vaccinecentresystem.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class VaccineType {
	@Id
	private String id;
	private String name;
	private String batchNumber;
	private String dateOfVaccine;
	private String remarks;
	
	
	public VaccineType(String name, String batchNumber, String dateOfVaccine, String remarks) {
		this.name = name;
		this.batchNumber = batchNumber;
		this.dateOfVaccine = dateOfVaccine;
		this.remarks = remarks;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public String getDateOfVaccine() {
		return dateOfVaccine;
	}
	public String getRemarks() {
		return remarks;
	}

}
