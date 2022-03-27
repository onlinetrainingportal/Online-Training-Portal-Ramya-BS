package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Model.Answerd;
import com.project.Service.AnswerdService;

@RestController
@RequestMapping("/answerDetails")
public class AnswerdRestController {
       
	@Autowired
	AnswerdService service;
	
		@PostMapping("/addAnswerDetails")
		public ResponseEntity<String> addAnswerDetails( @RequestBody Answerd a){
			    
			Answerd ans= service.addAnswerDetails(a);
			System.out.println(a);
			
			return new  ResponseEntity<String>("Record inserted successfully",HttpStatus.OK);
			}
		
	
	
	
	
}
