package com.FacebookAssignment;

	import java.util.Random;


	public class FacebookAutomation extends FacebookSignIn
	{

	public void showFName() {
	String strArray[] = {"Shivani","Aditi","Priya","Rina","Sangita","Aishwarya","Santosh","Sangram","Shivani"};
	System.out.println("First Name is :" +strArray[new Random().nextInt(strArray.length)]);
	}

	public void showLName() {
	String strArray[] = {"Kaingade","Ghatage","Patil","Altekar","Mane","Kadam","Powar","Ulape","Rane"};
	System.out.println("Last Name is :" +strArray[new Random().nextInt(strArray.length)]);
	}

	public void showMobileNumber() {
	Random rd=new Random();

	int intMobileNo;
	String str[]=new String [10];

	for(int intNum=0;intNum<10;intNum++) {
	intMobileNo= rd.nextInt(10);

	str[intNum]=Integer.toString(intMobileNo);
	}
	System.out.println("Mobile Number:"+str[6]+str[4]+str[8]+str[5]+str[4]+str[5]+str[6]+str[7]+str[8]+str[9]);
	}

	public void setPassword() {
	String strPassword = "xyz123";
	System.out.println("Password is :" +strPassword);
	}
}
