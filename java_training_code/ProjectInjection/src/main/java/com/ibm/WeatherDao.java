package com.ibm;

import java.util.Date;

public interface WeatherDao {
	
	WeatherData find(Date date);
	WeatherData save(Date date);
	WeatherData update(Date date);

}
