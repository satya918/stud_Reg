package com.marketingapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp1.entities.Student;
import com.marketingapp1.services.studentServices;

@Controller
public class StudentController {
	@Autowired
	private studentServices studentServ;
	
	@RequestMapping("/back")
	public String startapp() {
		return"menu";
	}
	
	@RequestMapping("/open")
	public String create() {
		return "login";
	}
	@RequestMapping("/save")
	public String savedetails(@ModelAttribute("x")Student student,Model model) {
		model.addAttribute("msg", "RECORD IS SAVED");
		studentServ.saveone(student);
		return"menu";
	}

	
	@RequestMapping("/listall")
	public String listallstudent(Model model) {
		List<Student> customers = studentServ.listallstudents();
		model.addAttribute("cust", customers);
		return"list_of_students";
	}
	@RequestMapping("/delete")
	public String deleterecord(@RequestParam("id")Long id,Model model) {
		studentServ.deleteByid(id);
		List<Student> customers = studentServ.listallstudents();
		model.addAttribute("cust", customers);
		return"list_of_students";
	}
	@RequestMapping("/update")
	public String updaterecord(@RequestParam("id")long id,Model model) {
		Student custom = studentServ.updateId(id);
		model.addAttribute("del", custom);
		
		return"updates";
	}
	@RequestMapping("/updatecust")
	public String updatedetails(@ModelAttribute("x")Student custom,Model model) {
		model.addAttribute("msg", "RECORD IS SAVED");
		studentServ.saveone(custom);
		
		List<Student> customers = studentServ.listallstudents();
		model.addAttribute("cust", customers);
		return"list_of_students";
		
	
	
	}

	

}
