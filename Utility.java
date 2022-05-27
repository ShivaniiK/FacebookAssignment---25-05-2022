package com.FacebookAssignment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;
	
	public class Utility extends FacebookSignIn
	{

	public void showFName() {
	String strArray[] = {"Shivani","Aditi","Priya","Rina","Sangita","Aishwarya","Santosh","Sangram","Shivani"};
	System.out.println("First Name is :" +strArray[new Random().nextInt(strArray.length)]);
	}

	public void showLName() {
	String strArray[] = {"Kaingade","Ghatage","Patil","Altekar","Mane","Kadam","Powar","Ulape","Rane"};
	System.out.println("Last Name is :" +strArray[new Random().nextInt(strArray.length)]);
	}
	
	
	public void genderPick() {
		String strArray[] = {"Male","Female","Custom"};
		System.out.println("Gender:" +strArray[new Random().nextInt(strArray.length)]);
		}

	
		public void dateOfBirth() {
			 LocalDate startDate = LocalDate.of(1991, 1, 1); //start date
			    long start = startDate.toEpochDay();
			   
			    LocalDate endDate = LocalDate.of(1999,1,1); //end date
			    long end = endDate.toEpochDay();

			    long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
			    System.out.println("Date of Birth is: "+LocalDate.ofEpochDay(randomEpochDay)); // random date between the range
		}
		
	
	
		public static void mobileNumber() {
			Random num = new Random();
		      int num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11;
		      num0 = 9;
		      num1 = 1;
		      num2 = 9;
		      num3 = num.nextInt(9) + 10;
		      num4 = num.nextInt(10);
		      num5 = num.nextInt(9) + 10;
		      num6 = num.nextInt(10);
		      num7 = num.nextInt(7);
		      num8 = num.nextInt(5);
		      num9 = num.nextInt(10);
		      System.out.print("Mobile Number is = ");
		      System.out.print(num0);
		      System.out.print(num1);
		      System.out.print("-" + num2);
		      System.out.print(num3);
		      System.out.print(num4);
		      System.out.print(num5);
		      System.out.print(num6);
		      System.out.print(num7);
		      System.out.print(num8);
		      System.out.print(num9);
		      
		   }
		
		
		public void timeZone() {
			 DateTimeFormatter TimeDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			   LocalDateTime now = LocalDateTime.now();  
			   System.out.println("Current Date & Time is: "+TimeDate.format(now));  

		}
			    

		public void setPassword() {
		    String strPassword = "xyz123";
		    System.out.println("Password is :" +strPassword);
		}
	
	}
		

		