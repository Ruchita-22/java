package com.demo.many2many;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Employee implements Serializable{
	private static final long serialVersionUID = 4232561769576446228L;
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long empId;
		private String empName;
		@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
		private Collection<Project> projects = new ArrayList<Project>();
		public Long getEmpId() {
			return empId;
		}
		public void setEmpId(Long empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public Collection<Project> getProjects() {
			return projects;
		}
		public void setProjects(Collection<Project> projects) {
			this.projects = projects;
		}
		public Employee() {}
		
		

}