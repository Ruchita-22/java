package com.ibm;
import java.util.Date;

public class StaticDataWeatherDaoImpl implements WeatherDao {

	@SuppressWarnings("deprecation")
	public WeatherData find(Date date) {

		WeatherData wd= new WeatherData();
		wd.setDate((Date) date.clone());
		wd.setLow(date.getMonth() +5);
		wd.setHigh(date.getMonth() + 20);
		return wd;
	}

	public WeatherData save(Date date) {
		throw new UnsupportedOperationException("this class uses static data only");

	}

	public WeatherData update(Date date) {
		throw new UnsupportedOperationException("this class uses static data only");
	}

}