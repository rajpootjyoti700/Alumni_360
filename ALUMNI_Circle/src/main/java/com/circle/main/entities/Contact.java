package com.circle.main.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "contacts")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contact_id")
	private int cid;
	private String name;
	private String email;
	private String image;
	private String companyrole;
	  private String companyname;
	  private String linkedln;
	  private String batch;
	public String getCompanyrole() {
		return companyrole;
	}

	public void setCompanyrole(String companyrole) {
		this.companyrole = companyrole;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getLinkedln() {
		return linkedln;
	}

	public void setLinkedln(String linkedln) {
		this.linkedln = linkedln;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Column(length = 50000)
	private String description;
	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private User user;

	public Contact() {
		super();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	



	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", name=" + name + ", email=" + email + ", image=" + image + ", companyrole="
				+ companyrole + ", companyname=" + companyname + ", linkedln=" + linkedln + ", batch=" + batch
				+ ", description=" + description + ", user=" + user + "]";
	}

}
