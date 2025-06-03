package com.cts.spring.jdbc.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.cts.spring.jdbc.bean.Employee;
//XML BASED
public class EmployeeDAOImpl implements EmployeeDAO {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int save(Employee employee) {
		String query = "insert into employee values (?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setInt(3, employee.getEsalary());
			n = ps.executeUpdate();// INSERT,DELETE,UPDATE
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return n;
		}
	}

	public int delete(int eid) {
		String query = "delete from employee where eid=?";
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, eid);
			n = ps.executeUpdate();// INSERT,DELETE,UPDATE
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return n;
		}
	}
	
	
	public int update(int eid,int newSalary) {
		String query = "update employee set esalary=? where eid=?";
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, newSalary);
			ps.setInt(2, eid);
			n = ps.executeUpdate();// INSERT,DELETE,UPDATE
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
			return n;
	}
}

	
