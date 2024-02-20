package com.empbulletin.bootcampersbulletin.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCrypt;

@Entity
@Getter
@Setter
@Table(name = "Employee")
public class Employee {

	@Id
	@Column(name = "emp_id")
	private Long emp_id;

	@Column(name = "emp_name")
	private String emp_name;

	@Column(name = "emp_mail")
	private String emp_mail;

	@Column(name = "password")
	private String password;

	@Column(name = "batchNo")
	private Integer batchNo;

	public Employee() {
	}

	public Employee(Long emp_id, String emp_name, String emp_mail, String password, Integer batchNo) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_mail = emp_mail;
		this.password = password;
		this.batchNo = batchNo;
	}

}
