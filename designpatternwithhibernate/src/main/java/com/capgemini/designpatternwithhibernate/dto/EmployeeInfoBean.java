package com.capgemini.designpatternwithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="employee")
@Data
public class EmployeeInfoBean {
	 @Id
	   @Column
  private int id;
	@Column
    private String name;
	   @Column
    private String mailid;
	   @Column
    private String password;
	  
	  
}
