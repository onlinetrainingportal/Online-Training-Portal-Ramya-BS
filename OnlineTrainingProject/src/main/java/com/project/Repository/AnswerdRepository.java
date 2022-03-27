package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Answerd;

@Repository
public interface AnswerdRepository extends JpaRepository<Answerd, String>{

	
	
}
