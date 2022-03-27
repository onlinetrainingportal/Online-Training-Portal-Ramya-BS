package com.project;


import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.Model.Answerd;
import com.project.Model.Questiond;
import com.project.Repository.QuestiondRepository;
import com.project.Service.QuestiondService;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestiondTest {

	
	@Autowired
	QuestiondService service;

	@MockBean
	private QuestiondRepository repository;
	
	//fetchBySubjectName
	
	@Test
	public void getQuestionsBySubject() {
		String subjectName="SQL";
		when(repository.findBySubjectName(subjectName)).thenReturn(
				Stream.of(new Questiond("What is the full form of SQL ?","SQL"," Multiple Choice"))
		.collect(Collectors.toList()));
		
		assertEquals(1,service.findBySubjectName(subjectName).size());
		
	}
	
	//Adding
	
	@Test
	public void saveQuestions() {
		Questiond question=new Questiond("What is the full form of SQL ?","SQL"," Multiple Choice");
		Answerd answer = new Answerd("Q-SQL-1","\"A. Structured Query List B. Structure Query Language C. Sample Query Language D. None of these");
		when(repository.save(question)).thenReturn(question);
				
	
		assertEquals(question,service.addQuestionDetails(question));
		
	}


}
