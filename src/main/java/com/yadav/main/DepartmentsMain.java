package com.yadav.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.yadav.entities.DepartmentsEntity;
import com.yadav.repositories.DepartmentsRepository;

public class DepartmentsMain {
	
	public static void main(String[] args) {
		
		DepartmentsEntity dept=new DepartmentsEntity();
		dept.setName("Eye");
		dept.setDeptHead("yadav");
		dept.setPhone("123456");
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("hospital-context.xml");
		DepartmentsRepository departmentsRepository = (DepartmentsRepository) ctx.getBean("departmentsRepository");
		departmentsRepository.save(dept);
	}

}
