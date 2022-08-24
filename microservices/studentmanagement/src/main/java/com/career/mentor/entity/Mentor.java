package com.career.mentor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mentor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mentorId;
	private String firstName;
	private String lastName;
	private Long studentId;
}
