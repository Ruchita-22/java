package com.demo.one2one;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.BatchSize;

@Entity

public class Parking {
	@Id
	@GeneratedValue
	private int partingId;
	private String parkingLocation;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Employee employee;
	
	public Parking(String parkingLocation) {
		this.parkingLocation = parkingLocation;
	}
	public Parking() {}
	public int getPartingId() {
		return partingId;
	}
	public void setPartingId(int partingId) {
		this.partingId = partingId;
	}
	public String getParkingLocation() {
		return parkingLocation;
	}
	public void setParkingLocation(String parkingLocation) {
		this.parkingLocation = parkingLocation;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
