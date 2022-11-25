package com.teacher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.entities.Teacher;
import com.teacher.repositories.TeacherRepository;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository techRepo;
	@Override
	public void saveTeacher(Teacher tech) {
		techRepo.save(tech);
	}
}
