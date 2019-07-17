package com.logesh.JPATest.student.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logesh.JPATest.student.model.Student;
import com.logesh.JPATest.student.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	
	public List<Student> students = new ArrayList<>(Arrays.asList(new Student(1, "Logesh"), new Student(2, "Mukesh")));

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Optional<Student> student = repository.findById(id);
		System.out.println("Found student: "+student);
		return repository.findById(id).orElse(null);
	}

	public List<Student> getAll() {
		System.out.println("Here at all call");
		List<Student> stds = new ArrayList<Student>();
		repository.findAll().forEach(stds::add);
		return null;
	}

}
