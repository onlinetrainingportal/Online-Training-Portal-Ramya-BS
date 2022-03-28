package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.Model.Answerd;
import com.project.Repository.AnswerdRepository;


@Service
public class AnswerdService {

	@Autowired
	AnswerdRepository repo;
	
	public Answerd addAnswerDetails(Answerd a) {
		return repo.save(a);
	}	

}
