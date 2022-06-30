package com.ibm;

import java.util.Date;

public class WeatherData {

	Date date;
	double low;
	double high;
	
	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date2) {
	
		this.date=date2;
		}
	public double getLow()
	{
		return low;

	}
	public double getHigh()
	{
		return high;
	
	}
	public void setLow(double low) {
		this.low = low;
	}
	public void setHigh(double high)
	{
		this.high =high;
	}
} 