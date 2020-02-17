package tr.com.jforce.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "USERS",uniqueConstraints = {@UniqueConstraint(name="emailAddress",columnNames = { "emailAddress"})})
public class User {
	
	@Column(name = "FIRSTNAME" )
	@NotNull
	@NotEmpty
	private String firstName;
	
	
	@Column(name = "USERNAME" )
	private String username;
	
	@NotNull
	@NotEmpty
	@Column(name = "LASTNAME")
	private String lastName;
	
	@NotNull
	@NotEmpty
	@Column(name = "PHONENUMBER")
	private String phoneNumber;
	
	@Id
	@NotNull
	@NotEmpty
	@Column(name = "EMAILADDRESS")
	@Email
	private String emailAddress;
	
	@NotNull
	@NotEmpty
	@Column(name = "PASSWORD")
	@Size(min=6)
	private String password;
	
	@NotNull
	@NotEmpty
	@Column(name = "GENDER")
	private String gender;
	
	@NotNull
	@NotEmpty
	//@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDATE")
//	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private String birthDate;

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


}