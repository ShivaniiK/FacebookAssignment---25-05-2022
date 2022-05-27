package com.FacebookAssignment;

public class TestFacebookSignIn {

	public static void main(String[] args) {
		Utility objUtility = new Utility();
		objUtility.getURL("https://www.facebook.com/");
		objUtility.showFName();
		objUtility.showLName();
		objUtility.genderPick();
		objUtility.setPassword();
		Utility.mobileNumber();
		System.out.println(" ");
        objUtility.dateOfBirth();
        objUtility.timeZone();
		objUtility.closeBrowser();
		}
		
	}

