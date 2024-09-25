package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo stuRepo;
	
	@PostMapping("avanthi/stu/add")
	public Student addNewStudent(@RequestBody Student stu) {
		
		return stuRepo.save(stu);
		
		
		
	}

}
