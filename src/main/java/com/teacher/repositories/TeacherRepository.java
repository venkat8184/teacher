package com.teacher.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teacher.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
