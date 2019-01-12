package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] array1 = { "string 1", "string 2", "string 3", "string 4", "string 5" };
		// 2. print the third element in the array
		System.out.println(array1[2]);
		// 3. set the third element to a different value
		array1[2] = "Test 1";
		// 4. print the third element again
		System.out.println(array1[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i] = "Changed array");
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE

		// 7. make an array of 50 integers
		int[] array2 = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < array2.length; i++) {
			Random ran = new Random();
			array2[i] = ran.nextInt(501);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int lowest = 500;
		int loopcheck = 0;
		for (int i = 0; i < array2.length; i++) {
			if (lowest > array2[i]) {
				lowest = array2[i];
			}
			loopcheck++;

			if (loopcheck == 50) {
				System.out.println(lowest + " is the lowest number");
			}
		}

		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		// 11. print the largest number in the array.
		int highest = 0;
		int loopcheck2 = 0;
		for (int i = 0; i < array2.length; i++) {
			if (highest < array2[i]) {
				highest = array2[i];
			}
			loopcheck2++;

			if (loopcheck2 == 50) {
				System.out.println(highest + " is the highest number");
			}
		}
		// 12. print only the last element in the array
		System.out.println(array2[49] + " is the last element of the array");
		//Number sorting shortcut
		java.util.Arrays.sort(array2);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}

		
		
		

