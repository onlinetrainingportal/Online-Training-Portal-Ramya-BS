package com.project.Model;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Questiond { //parent class
	
	
	@Id
	@Column(name="QuestiondId")  //primary key
 	//@GeneratedValue(strategy=GenerationType.AUTO)
   	private String queId;
	
	
	
	@Column(name="Description")
	@NotNull(message = "description field cannot be empty")
	private String description;
	
	@Column(name="SubjectName")
	@NotNull(message = "Subject Name field cannot be empty")
    private String subjectName;
	
	@Column(name="QuestionType")
	private  String queType;
	
	@Column(name="Date")
	private  LocalDate date;

	@OneToOne(mappedBy="questiond",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 @JsonManagedReference
	private Answerd answerd;  
	
public Questiond(String description,String subjectName, String queType) {
		
		this.description = description;
		this.subjectName = subjectName;
		this.queType = queType;
	
	}
	
	
	public Questiond() {
	super();
}

	public String getQueId() {
		return queId;
	}

	public void setQueId(String queId) {
		this.queId = queId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getQueType() {
		return queType;
	}

	public void setQueType(String queType) {
		this.queType = queType;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Answerd getAnswerd() {
		return answerd;
	}

	public void setAnswerd(Answerd answerd) {
		this.answerd = answerd;
	}

	@Override
	public String toString() {
		return "Questiond [queId=" + queId + ", description=" + description + ", subjectName=" + subjectName
				+ ", queType=" + queType + ", date=" + date + "]";
	}

	
	

}
