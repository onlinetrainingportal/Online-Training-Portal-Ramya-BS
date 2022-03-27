package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Model.Questiond;
import com.project.Repository.QuestiondRepository;



@Service
public class QuestiondService {
  
	
	@Autowired
	QuestiondRepository repo;
	
	public Questiond addQuestionDetails(Questiond s) {
		Questiond questiond= repo.save(s);
		return questiond;
	}	
	
	public List<Questiond> findBySubjectName(String subjectName)  { 
		  return repo.findBySubjectName(subjectName); 
	  
	  }
	

}



