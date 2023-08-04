package com.marketingapp1.services;

import java.util.List;

import com.marketingapp1.entities.Student;

public interface studentServices {
	
	
	public void saveone(Student student); 
	public List<Student> listallstudents();
	public void deleteByid(long id);
	public Student updateId(long id);
		
	

}
