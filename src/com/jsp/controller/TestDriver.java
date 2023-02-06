package com.jsp.controller;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TestDriver {

	public static void main(String[] args) {
     
		
	Teacher  tc = new  Teacher();
	tc.setId(199);
	tc.setName("nutan sir");
	tc.setEmail("nutan@gmail.com");
	tc.setCno(9833392974l);
	
	TeacherDao td = new TeacherDao();
	Teacher t =td.updateTeacher(tc);
	System.out.println(t.getId()+" done ");
	
	}

}
