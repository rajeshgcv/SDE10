package com.career.students.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private Long basePackage;
	private boolean isContractSent = true;
	@CreationTimestamp
	private LocalDateTime createdOn = LocalDateTime.now();
	@UpdateTimestamp
	private LocalDateTime updateOn = LocalDateTime.now();
	private boolean active = true;
	private String education;
	private Date passingYear;

}
