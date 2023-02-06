package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.jsp.dto.Teacher;
import com.jsp.helper.HelperClass;

public class TeacherDao {
	HelperClass hc = new HelperClass();

	public Teacher saveTeacher(Teacher t) {
		Connection c = hc.getConnection();

		String sql = "insert into Teacher values(?,?,?,?)";

		try {
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, t.getId());
			ps.setString(2, t.getName());
			ps.setString(3, t.getEmail());
			ps.setLong(4, t.getCno());

			ps.execute();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;

	}

	public Teacher deleteTeacher(Teacher t) {
		Connection c = hc.getConnection();
		String sql = "DELETE  FROM Teacher WHERE id=?";
		try {
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, t.getId());
			ps.executeUpdate();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return t;

	}

	public Teacher updateTeacher(Teacher t) {
		Connection c = hc.getConnection();
		String sql = "update teacher set name ='gogo' where id= ? ";
		try {
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, t.getId());
			ps.executeUpdate();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return t;

	}

	public List<Teacher> addMultipleTeacher(List<Teacher> t) {
		Connection c = hc.getConnection();

		String sql = "insert into Teacher values(?,?,?,?)";
		try {
			PreparedStatement ps = c.prepareStatement(sql);

			for (Teacher teacher : t) {
				ps.setInt(1, teacher.getId());
				ps.setString(2, teacher.getName());
				ps.setString(3, teacher.getEmail());
				ps.setLong(4, teacher.getCno());
				ps.addBatch();

			}
			ps.executeBatch();
			System.out.println("all good");
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

}
