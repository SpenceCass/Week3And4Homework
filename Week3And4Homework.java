package com.spencecass;

public class Week3And4Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. a. , b., & c.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		System.out.println(ages[0] - ages[ages.length - 1]);
		
		double sum = 0;
		
		for (int age : ages) {
			sum += age;
		}
		
		double average = sum / ages.length;
		
		System.out.println(average);
		
		
		// 2. a. , b., & c.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double sumLetters = 0;
		
		for (int i = 0; i < names.length; i++) {
			sumLetters += names[i].length();
		}
		
		double averageLetters = sumLetters / names.length;
		
		System.out.println(averageLetters);
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		
		
		// Answers to number 3 and 4 are above
		
		// 5.
		int[] nameLengths = new int[6];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		// 6.
		int sumLengths = 0;
		
		for (int num : nameLengths) {
			sumLengths += num;
		}
		System.out.println(" "); // unsure how else to move onto the next line
		System.out.println(sumLengths);
		
		
		// 7.
		String method7 = "Italy";
		int repeatNumber = 4;
		concatString(method7, repeatNumber);
		
		System.out.println(" ");
		
		// 8.
		String firstName = "Larry";
		String lastName = "Bird";
		System.out.println(concatFullName(firstName, lastName));
		
		
		// 9.
		int[] baseBalls = {34, 52, 13, 45};
		System.out.println(checkSum(baseBalls));
		
		
		// 10.
		double[] drPepper = {67.96, 48.64, 21.985, 55.55};
		System.out.println(averageNums(drPepper));
		
		
		// 11.
		double[] touchDowns = {45.8, 90.86, 21.457};
		double[] interceptions = {19.8, 32.45, 45.56};
		System.out.println(averagesCheck(interceptions, touchDowns));
		
		
		// 12.
		boolean isHotOutside = true;
		double moneyInPocket = 10.51;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		
		// 13.
		String[] attendance = {"Holly", "Jim", "Billy", "Ashley", "Fred"};
		int totalMembers = 7;
		System.out.println(checkQuorum(attendance, totalMembers));
		
				
	}
		//Method 7:
		public static String concatString (String word, int num) {
			for (int i = 0; i < num; i++) {
				System.out.print(word);
			}
			return word;
		}
	
		//Method 8:
		public static String concatFullName (String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;
		}
		
		//Method 9:
		public static boolean checkSum (int[] arr) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			if (sum > 100) {
				return true;
			} else {
				return false;
			}
		}
		
		//Method 10:
		public static double averageNums(double[] trouble) {
			double sum = 0;
			for (int i = 0; i < trouble.length; i++) {
				sum += trouble[i];
			}
			double avg = sum / trouble.length;
			return avg;
		}
		
		//Method 11:
		public static boolean averagesCheck (double[] arr1, double[] arr2) {
			double sum1 = 0;
			double sum2 = 0;
			for (int i = 0; i < arr1.length; i++) {
				sum1 += arr1[i];
			}
			for (int i = 0; i < arr1.length; i++) {
				sum2 += arr2[i];
			}
			double avg1 = sum1 / arr1.length;
			double avg2 = sum2 / arr2.length;
			if(avg1 > avg2) {
				return true;
			} else {
				return false;
			}
		}
		
		//Method 12:
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			} else {
				return false;
			}
		}
		
		//Method 13:
		public static boolean checkQuorum (String[] arr, int members) {
			if (arr.length > (0.7 * members)) {
				return true;
			} else {
				return false;
			}
		}
		
		//The method I created takes the array of people in attendance at a meeting (String[]) and the number of total people who are
		//members of the organization. My method determines if the number of people in attendance is greater than %70 of the total 
		//people in the organization -- this is called quorum. If quorum is met, the method will return true and the meeting can continue.
		//If quorum is not met, the method returns false and the meeting cannot proceed.
	
	
	
}
