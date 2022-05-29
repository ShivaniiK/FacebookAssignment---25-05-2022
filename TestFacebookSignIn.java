package com.FacebookAssignment;

public class TestFacebookSignIn {

	public static void main(String[] args) {
		Utility objUtility = new Utility();
		objUtility.getURL("https://www.facebook.com/");
		System.out.println("===================");
		objUtility.showFName();
		objUtility.showLName();
		objUtility.genderPick();
		objUtility.setPassword();
		Utility.mobileNumber();
		System.out.println(" ");
        objUtility.dateOfBirth();
        System.out.println("===================");
        objUtility.timeZone();
        System.out.println(" ");
        System.out.println("===================");
        objUtility.dayWeek();
        System.out.println("===================");
        objUtility.hourMinuteSeconds();
        System.out.println("===================");
		objUtility.closeBrowser();
		System.out.println("===================");
		}
		
	}

