package com.nu.customerapp.model.persistance;

import java.util.List;

import com.nu.customerapp.model.persistance.exceptions.DaoException;

public interface EmployeeDao {
	public List<Employee>getAllEmployee();
	public void addEmployee(Employee employee)throws DaoException;
	public void deleteEmployee(int employeeId);
	public void updateEmployee(Employee employee);
	public Employee getEmployeeById(int employeeId);
}
