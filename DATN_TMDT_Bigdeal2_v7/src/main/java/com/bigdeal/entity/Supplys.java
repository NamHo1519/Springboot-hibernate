package com.bigdeal.entity;
// Generated Sep 19, 2020 3:34:09 PM by Hibernate Tools 5.4.18.Final

import java.util.Date;

/**
 * Supplys generated by hbm2java
 */
public class Supplys implements java.io.Serializable {

	private Long id;
	private String supplyName;
	private String email;
	private String phoneNumber;
	private String facebookUrl;
	private String address;
	private String description;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;

	public Supplys() {
	}

	public Supplys(String supplyName) {
		this.supplyName = supplyName;
	}

	public Supplys(String supplyName, String email, String phoneNumber, String facebookUrl, String address,
			String description, Date createdAt, Date updatedAt, Date deletedAt) {
		this.supplyName = supplyName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.facebookUrl = facebookUrl;
		this.address = address;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSupplyName() {
		return this.supplyName;
	}

	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFacebookUrl() {
		return this.facebookUrl;
	}

	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

}
