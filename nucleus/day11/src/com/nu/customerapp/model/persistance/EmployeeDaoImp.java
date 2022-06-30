package com.nu.customerapp.model.persistance;

import java.sql.*;
import java.util.*;

import com.nu.customerapp.model.persistance.exceptions.DaoException;

//DAO=CURD + db connection object

public class EmployeeDaoImp implements EmployeeDao {
	private Connection connection;

	public EmployeeDaoImp(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from employee");
			while (rs.next()) {
				employees.add(new Employee(rs.getInt("employeeId"), rs
						.getString("employeeName"), rs
						.getDouble("employeeSalary")));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return employees;
	}

	// let we fill all these methods!
	@Override
	public void addEmployee(Employee employee)throws DaoException {
		PreparedStatement stmt;
		try {
			stmt = connection
					.prepareStatement("insert into employee(employeeId ,employeeName ,employeeSalary) values(?,?,?)");

			stmt.setInt(1, employee.getEmployeeId());
			stmt.setString(2, employee.getEmployeeName());
			stmt.setDouble(3, employee.getEmployeeSalary());

			int noOfRowsEffecteted = stmt.executeUpdate();

		} catch (SQLException e) {
			throw new DaoException("some sql hack", e);
		}

	}

	@Override
	public void deleteEmployee(int employeeId) {
		PreparedStatement stmt;
		try {
			stmt = connection
					.prepareStatement("delete from employee where employeeId=?");
			stmt.setInt(1, employeeId);
			stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateEmployee(Employee employee) {
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("update employee set employeeName=? ,employeeSalary=? where employeeId=?");
			stmt.setString(1, employee.getEmployeeName());
			stmt.setDouble(2, employee.getEmployeeSalary());
			stmt.setInt(3, employee.getEmployeeId());
			stmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return null;
	}

}
