package com.greatlearning.college.fest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private long id;
	
	@Column(name = "first_name", length = 150, nullable = false)
	@NotBlank(message = "First Name is Required!")
	@Size(min = 2, max = 150, message = "First Name must be between 2 to 150 characters!")
	private String firstName;

	@Column(name = "last_name", length = 150, nullable = false)
	@NotBlank(message = "Last Name is Required!")
	@Size(min = 2, max = 150, message = "Last Name must be between 2 to 150 characters!")
	private String lastName;

	@Column(name = "course", length = 150, nullable = false)
	@NotBlank(message = "Course Name is Required!")
	@Size(min = 2, max = 150, message = "Course Name must be between 2 to 150 characters!")
	private String course;

	@Column(name = "country", length = 150, nullable = false)
	@NotBlank(message = "Country Name is Required!")
	@Size(min = 2, max = 150, message = "Country Name must be between 2 to 150 characters!")
	private String country;
	
	
	public Student(
			@NotBlank(message = "First Name is Required!") @Size(min = 2, max = 150, message = "First Name must be between 2 to 150 characters!") String firstName,
			@NotBlank(message = "First Name is Required!") @Size(min = 2, max = 150, message = "Last Name must be between 2 to 150 characters!") String lastName,
			@NotBlank(message = "Course Name is Required!") @Size(min = 2, max = 150, message = "Course Name must be between 2 to 150 characters!") String course,
			@NotBlank(message = "Country Name is Required!") @Size(min = 2, max = 150, message = "Country Name must be between 2 to 150 characters!") String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}

	public Student(long id,
			@NotBlank(message = "First Name is Required!") @Size(min = 2, max = 150, message = "First Name must be between 2 to 150 characters!") String firstName,
			@NotBlank(message = "First Name is Required!") @Size(min = 2, max = 150, message = "Last Name must be between 2 to 150 characters!") String lastName,
			@NotBlank(message = "Course Name is Required!") @Size(min = 2, max = 150, message = "Course Name must be between 2 to 150 characters!") String course,
			@NotBlank(message = "Country Name is Required!") @Size(min = 2, max = 150, message = "Country Name must be between 2 to 150 characters!") String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
