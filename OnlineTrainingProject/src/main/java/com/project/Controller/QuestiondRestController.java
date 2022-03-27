package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Exception.ResourceNotFoundException;
import com.project.Model.Questiond;
import com.project.Service.QuestiondService;


@RestController
@RequestMapping("/questionDetails")
public class QuestiondRestController {

	@Autowired
    QuestiondService service;
	
	
	@PostMapping("/addQuestionDetails")
	public ResponseEntity<String> addQuestionDetails(@Validated @RequestBody Questiond s){
		    
		Questiond que= service.addQuestionDetails(s);
		System.out.println(s);
		//return new ResponseEntity<Questiond>(que,HttpStatus.OK);
	    return new  ResponseEntity<String>("Record inserted successfully",HttpStatus.OK);
		}
	

	  @GetMapping ("/fetchBySubjectName")
	  public ResponseEntity<List<Questiond>> fetchBySubjectName(@RequestParam String subjectName){
		 String status=null;
		// Optional<Questiond> obj=service.findBySubjectName(que.g)
	  List<Questiond> obj = service.findBySubjectName(subjectName);
	  //System.out.println(obj); 
	 // return new ResponseEntity<List<Questiond>> (obj,HttpStatus.OK);
	   
	  if(!obj.isEmpty())
	  {
		  status="Successfull";
		  
	  }
	  else {
	  throw new ResourceNotFoundException("Given Subject is not available in the database");
	  }
	  
	  return new ResponseEntity<List<Questiond>> (obj,HttpStatus.OK);
}
		 
}
