package com.automation.test;

//import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;
import com.actions.LoginActions;
import com.automation.actions.Google_email_login_actions;
import com.automation.scenario.Google_email_login_scenarios;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class Google_email_login_test {
	@Autowired
	private Google_email_login_actions actions;
	
	@Autowired
	private Google_email_login_scenarios scenario;

	@Test(groups= {"LoginTest"})
	public void google_email_login_test() throws Throwable {
		try {
			LoginActions login= new LoginActions();
			login.googlelogin();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}