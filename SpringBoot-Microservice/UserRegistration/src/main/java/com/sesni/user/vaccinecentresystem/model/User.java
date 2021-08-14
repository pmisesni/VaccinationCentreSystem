package com.sesni.user.vaccinecentresystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String id;
    private String fName;
    private String lName;
    private String address;
    private String district;
    private int mobile;
    
    
    public User(String fName, String lName, String address, String district, int mobile) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.district = district;
		this.mobile = mobile;
	}

	public String getId() {
		return id;
	}

	public String getfName() {
		return fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public int getMobile() {
		return mobile;
	}
	
}