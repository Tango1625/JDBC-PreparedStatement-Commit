package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TestBatch {

	public static void main(String[] args) {
		TeacherDao td = new TeacherDao();
		ArrayList<Teacher> al = new ArrayList<>();
		Teacher t1 = new Teacher();
		t1.setId(100);
		t1.setName("xyz");
		t1.setEmail("abc@gmail.com");
		t1.setCno(1122334455L);

		Teacher t2 = new Teacher();
		t2.setId(110);
		t2.setName("xyz");
		t2.setEmail("abc@gmail.com");
		t2.setCno(1122334455L);

		Teacher t3 = new Teacher();
		t3.setId(120);
		t3.setName("xyz");
		t3.setEmail("abc@gmail.com");
		t3.setCno(1122334455L);

		al.add(t1);
		al.add(t2);
		al.add(t3);
		td.addMultipleTeacher(al);
		System.out.println("all set to go");
	}
}
