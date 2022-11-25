package com.teacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teacher.entities.Teacher;
import com.teacher.service.TeacherService;

@Controller
public class TeacherController {
@Autowired
private TeacherService techServ;
	@RequestMapping("createViewLeadPage")
	public String createView() {
		return "create_lead";
	}
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("tech")Teacher tech) {
		techServ.saveTeacher(tech);
		return "create_lead";
	}
}
