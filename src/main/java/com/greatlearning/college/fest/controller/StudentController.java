package com.greatlearning.college.fest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.college.fest.entity.Student;
import com.greatlearning.college.fest.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@RequestMapping("/list")
	public String studentList(Model model) {
		model.addAttribute("students", studentService.findAll());
		return "student-list";
	}

	@GetMapping("/showFormForAdd")
	public String addStudent(Model model) {
		model.addAttribute("studentInfo", new Student());
		return "student-form";
	}

	@GetMapping("/showFormForUpdate")
	public String viewStudentDetails(@RequestParam long studentId, Model model) {
		Student student = studentService.findById(studentId);
		model.addAttribute("studentInfo", student);
		return "student-form";
	}

	@PostMapping("/save")
	public String saveStudent(@Valid @ModelAttribute("studentInfo") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "student-form";
		} else {
			studentService.save(student);
			return "redirect:/student/list";
		}
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam long studentId) {
		studentService.deleteById(studentId);
		return "redirect:/student/list";
	}
		
}
