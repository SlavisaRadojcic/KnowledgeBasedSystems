package com.sbnz.doctor.model;
// Generated Aug 26, 2019 4:00:55 PM by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "user", catalog = "sbnz")
public class User implements java.io.Serializable {

	private Long userId;
	private String userName;
	private String userSurname;
	private String userUsername;
	private char userType;
	private String userPassword;
	private Set<Diagnosis> diagnosises = new HashSet<Diagnosis>(0);
	private Set<Therapy> therapies = new HashSet<Therapy>(0);

	public User() {
	}

	public User(String userName, String userSurname, String userUsername, char userType, String userPassword) {
		this.userName = userName;
		this.userSurname = userSurname;
		this.userUsername = userUsername;
		this.userType = userType;
		this.userPassword = userPassword;
	}

	public User(String userName, String userSurname, String userUsername, char userType, String userPassword,
			Set<Diagnosis> diagnosises, Set<Therapy> therapies) {
		this.userName = userName;
		this.userSurname = userSurname;
		this.userUsername = userUsername;
		this.userType = userType;
		this.userPassword = userPassword;
		this.diagnosises = diagnosises;
		this.therapies = therapies;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "USER_ID", unique = true, nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "USER_NAME", nullable = false, length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_SURNAME", nullable = false, length = 200)
	public String getUserSurname() {
		return this.userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	@Column(name = "USER_USERNAME", nullable = false, length = 150)
	public String getUserUsername() {
		return this.userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	@Column(name = "USER_TYPE", nullable = false, length = 1)
	public char getUserType() {
		return this.userType;
	}

	public void setUserType(char userType) {
		this.userType = userType;
	}

	@Column(name = "USER_PASSWORD", nullable = false, length = 250)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Diagnosis> getDiagnosises() {
		return this.diagnosises;
	}

	public void setDiagnosises(Set<Diagnosis> diagnosises) {
		this.diagnosises = diagnosises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Therapy> getTherapies() {
		return this.therapies;
	}

	public void setTherapies(Set<Therapy> therapies) {
		this.therapies = therapies;
	}

}
