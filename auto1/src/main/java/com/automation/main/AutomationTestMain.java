package com.automation.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.TestNG;

//@SpringBootApplication
public class AutomationTestMain {

	public static void main(String[] args) {
		//SpringApplication.run(Auto1Application.class, args);
		TestNG runner = new TestNG();
		List<String> suitefiles = new ArrayList<String>();
		suitefiles.add("testng.xml");
		runner.setTestSuites(suitefiles);
		runner.run();
	}

}
