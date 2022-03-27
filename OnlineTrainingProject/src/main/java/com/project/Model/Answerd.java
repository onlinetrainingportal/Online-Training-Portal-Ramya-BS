package com.project.Model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity 
public class Answerd {
    
	
    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="QUESTION_ID")
    @JsonBackReference
    private Questiond questiond;  
    
    @Id
    @Column(name="ANSWER_ID")
	private String ansId;  
	
	@Column(name="ANSWER")
	@NotNull(message = "Answer field cannot be empty")
	private String answer;

	
	public Answerd(String ansId,String answer) {
		
		this.ansId = ansId;
		this.answer = answer;
	}
	
	public Answerd() {
		super();
	}


	public String getAnsId() {
		return ansId;
	}

	public void setAnsId(String ansId) {
		this.ansId = ansId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
   
	@Override
	public String toString() {
		return "Answerd [ansId=" + ansId + ", answer=" + answer + "]";
	}

	
}
