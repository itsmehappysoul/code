package com.smartclean.test.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "services_entry")
public class Operations  {

	@Id
	@Column(name="Sl No")
	private int Sl;
	@Column(name="UniqueID")
	private int UniqueID;
	@Column(name="Time_Stamp")
	private String time_stamp;

	public Operations() {
		super();
	}

	public Operations(int sl,int uniqueID, String time_stamp) {
		super();
		this.Sl = sl;
		UniqueID = uniqueID;
		this.time_stamp = time_stamp;
	}
	
	public int getSl() {
		return Sl;
	}

	public void setSl(int sl) {
		this.Sl = sl;
	}

	public int getUniqueID() {
		return UniqueID;
	}

	public void setUniqueID(int uniqueID) {
		UniqueID = uniqueID;
	}

	public String getCreatedTime() {
		return time_stamp;
	}

	public void setCreatedTime(String time_stamp) {
		this.time_stamp = time_stamp;
	}
}
