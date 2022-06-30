package com.ibm;

import java.util.Date;


/**
 */
public class WeatherServiceImpl implements WeatherService {

  private WeatherDao weatherDao;
  
  public void setWeatherDao(WeatherDao weatherDao) {
    this.weatherDao = weatherDao;
  }

  public Double getHistoricalHigh(Date date) {
    WeatherData wd = weatherDao.find(date);
    if (wd != null)
      return new Double(wd.getHigh());
    return null;
  }
}
