package com.github.citools;


import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class JUnitRunListener extends org.junit.runner.notification.RunListener  {
	private static final Logger logger = Logger.getLogger(JUnitRunListener.class.getName());
	
	
		
	public JUnitRunListener() {
		super();
    }
	


	/**** org.junit.runner.notification.RunListener methods ****/

	@Override
	public void testAssumptionFailure(Failure failure) {
		// TODO Auto-generated method stub
		System.out.println("*********** testAssumptionFailure");
	}

	@Override
	public void testFailure(Failure failure) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("*********** testFailure");
	}

	@Override
	public void testFinished(Description description) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("*********** testFinished");
	}

	@Override
	public void testIgnored(Description description) throws Exception {
		System.out.println("*********** testIgnored");
	}

	@Override
	public void testRunFinished(Result result) throws Exception {
		System.out.println("*********** testRunFinished");
	}

	@Override
	public void testRunStarted(Description description) throws Exception {
		if(description != null) {
			logger.info(description.toString());
		}
		System.out.println("*********** testRunStarted");
	}

	@Override
	public void testStarted(Description description) throws Exception {
		if(description != null) {
			logger.info(description.toString());
		}
		System.out.println("*********** testStarted");
	}



	@Override
	public void testSuiteFinished(Description description) throws Exception {
		if(isSuite(description)) {
			testSuiteClassFinished(description);
		} else {
			testCaseClassFinished(description);
		}
	}



	@Override
	public void testSuiteStarted(Description description) throws Exception {
		if(isSuite(description)) {
			testSuiteClassStarted(description);
		} else {
			testCaseClassStarted(description);
		}
	}
	
	public boolean isSuite(Description description) {
		return description.isSuite() && description.getChildren().get(0).isSuite();
	}
	
	public void testSuiteClassStarted(Description description) throws Exception {
		System.out.println("xxxxxxxxxxxxxxxxxxxx testSuiteStarted  : " + description.getDisplayName());
	}
	
	public void testCaseClassStarted(Description description) throws Exception {
		System.out.println("xxxxxxxxxxxxxxxxxxxx testClassStarted  : " + description.getDisplayName());
	}
	
	public void testSuiteClassFinished(Description description) throws Exception {
		System.out.println("xxxxxxxxxxxxxxxxxxxx testSuiteFinished  : " + description.getDisplayName());
	}
	
	public void testCaseClassFinished(Description description) throws Exception {
		System.out.println("xxxxxxxxxxxxxxxxxxxx testClassFinished  : " + description.getDisplayName());
	}
	
	

}
