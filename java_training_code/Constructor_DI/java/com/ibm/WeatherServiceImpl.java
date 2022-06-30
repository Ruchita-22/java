package com.ibm;

import java.util.Date;

public class WeatherServiceImpl implements WeatherService {


	private WeatherDao weatherdao;

	public WeatherServiceImpl(WeatherDao weatherDao) {
		this.weatherdao= weatherDao;

	}

     public Double getHistoricalHigh(Date date) {
    	 WeatherData wd = weatherdao.find(date);
    	 if(wd!=null)
    	 return new Double(wd.getHigh());
    	 return null;
     }


}