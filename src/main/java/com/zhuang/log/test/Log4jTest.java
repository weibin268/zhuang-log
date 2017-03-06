package com.zhuang.log.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jTest {

	Logger logger = LoggerFactory.getLogger(Log4jTest.class);

	
	public void test() {


		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}

}
