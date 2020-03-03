package com.yadav.main;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yadav.repositories.DepartmentLoginRepository;
import com.yadav.repositories.DepartmentsRepository;
import com.yadav.entities.DepartmentLoginEntity;


public class DepartmentLoginMain {
	public static void main(String[] args) {
		
	
	
	DepartmentLoginEntity dLogin= new DepartmentLoginEntity();
	dLogin.setUserName("Rammy");
	dLogin.setPassword("xxxxxxxxgg");
	
	

	ApplicationContext ctx = new ClassPathXmlApplicationContext("hospital-context.xml");
	DepartmentLoginRepository departmentLoginRepository = (DepartmentLoginRepository) ctx.getBean("departmentLoginRepository");
	departmentLoginRepository.save(dLogin);
	
	
//	DepartmentLoginRepository departmentLoginRepository1 = (DepartmentLoginRepository) ctx.getBean("departmentLoginRepository");
//	departmentLoginRepository1.save(dLogin);

	
		/*
		 * DepartmentLoginEntity dLogin1 =
		 * departmentLoginRepository.getByUsername("abcde");
		 * System.out.println("*************login get by username **********");
		 * System.out.println(dLogin1.toString());
		 * 
		 * String password = DigestUtils.sha256Hex("08234721");
		 * dLogin.setPassword(password);
		 */
	//dLogin.setUpdatedAt(new Date());
	
	//departmentLoginRepository.update(dLogin1);
	
	
	
	}

}