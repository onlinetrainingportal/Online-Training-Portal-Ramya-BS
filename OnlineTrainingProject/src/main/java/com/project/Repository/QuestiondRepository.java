package com.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Questiond;

@Repository
public interface QuestiondRepository extends JpaRepository<Questiond, String> {
     
	
	public List<Questiond> findBySubjectName(String subjectName);
   

}
