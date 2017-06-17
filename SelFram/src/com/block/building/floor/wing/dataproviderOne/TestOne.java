package com.block.building.floor.wing.dataproviderOne;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;



public class TestOne {
public static Logger addlog = Logger.getLogger(TestOne.class);
  public void f1() {
	  Logger logger = addlog;
	  logger.info("Welcome to first logger page...");
  }
  
//get a logger instance
	public static Logger logger = Logger.getLogger(TestOne.class);

	public void testLoggerDebug() {
		logger.debug("Hello.. im in Debug method");
	}

	public void testLoggerInfo() {
		logger.info("Hello.. im in Info method");
	}

	public void testLoggerWarn() {
		logger.warn("Hello.. im in Warn method");
	}

	public void testLoggerError() {
		logger.error("Hello.. im in Error method");
	}

	public void testLoggerFatal() {
		logger.fatal("Hello.. im in Fatal method");
	}
	@Test(enabled=true,invocationCount=20)
	public void run() {
		TestOne example = new TestOne();
		example.testLoggerDebug();
		example.testLoggerInfo();
		example.testLoggerWarn();
		example.testLoggerError();
		example.testLoggerFatal();
	}

	@Test
	public void testp1(){
		logger.info("Welcome to logging page");
	}
  
	@Test
	public void testdashboard(){
		logger.info("Welcome to DashBoard page");
	}
	
	@Test
	public void testdashboard78(){
		logger.info("Welcome to DashBoard page piane");
		addlog.error("rrrrrrrrrrrr asdafsdf");
	}
	
	
	
	
	
  
}
