package com.demotricentis.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logUtility
{
	public Logger log;

	public logUtility()
	{
	log = Logger.getLogger(logUtility.class);
    PropertyConfigurator.configure("log4j.properties");
	}
	
	public void loginfo(String desc)
	{
		log.info(desc);
	}
	
	public void logerror(String desc)
	{
		log.error(desc);
		
	}
	
	public void logwarning(String desc)
	{
		log.warn(desc);
	}
}
