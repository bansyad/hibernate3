package com.yadav.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "department_login")
public class DepartmentLoginEntity {
	
	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String password;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_id", referencedColumnName = "id")
	private DepartmentsEntity departmentsEntity;

	public DepartmentsEntity getDepartmentsEntity() {
		return departmentsEntity;
	}

	public void setDepartmentsEntity(DepartmentsEntity departmentsEntity) {
		this.departmentsEntity = departmentsEntity;
	}

	@Override
	public String toString() {
		return "DepartmentLoginEntity [userName=" + userName + ", password=" + password + ", id=" + id
				+ ", departmentsEntity=" + departmentsEntity + "]";
	}

	
}
