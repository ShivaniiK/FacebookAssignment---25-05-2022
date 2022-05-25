package com.FacebookAssignment;

public class TestFacebookSignIn {

	public static void main(String[] args) {
		FacebookAutomation objFacebookAutomation = new FacebookAutomation();
		objFacebookAutomation.getURL("https://www.facebook.com/");
		objFacebookAutomation.showFName();
		objFacebookAutomation.showLName();
		objFacebookAutomation.showMobileNumber();
		objFacebookAutomation.setPassword();
		objFacebookAutomation.closeBrowser();
		//objutility.generatePassword(1);
		}
		
	}

