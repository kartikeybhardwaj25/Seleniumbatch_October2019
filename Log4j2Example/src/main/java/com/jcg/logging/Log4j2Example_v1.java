package com.jcg.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Example_v1 {

	private static final Logger LOG = LogManager.getLogger(Log4j2Example_v1.class);

	public static void main(String[] args) {
		
		LOG.debug("This is going to be printed on Debug");
		LOG.info("This will be printed on info");
		LOG.warn("This will be printed on warning");
		LOG.error("This will be printed on error");
		LOG.fatal("This will be printed on info");
		LOG.info("Appending String: {}." ,"Hello World");
	
		
		

	}

}
