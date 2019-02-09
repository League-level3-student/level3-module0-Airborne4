package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	Random ran = new Random();
	int num = ran.nextInt(4);
	public static void main(String[] args) {
		String[] strings= {"This" , "is" , "a" , "String" , "array"};
		printString(strings);
		revString(strings);
		modString(strings);
		ranString(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	static void printString (String[] strArray){
	for (int i = 0; i < strArray.length; i++) {
		System.out.println((strArray[i]));
	}	
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	static void revString (String[] strArray2) {
		for (int i = 4; i >= 0; i--) {
			System.out.println(strArray2[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void modString (String[] strArray3) {
		for (int i = 0; i < strArray3.length; i++) {
			if (i%2 == 0) {
				System.out.println(strArray3[i]);	
			}
			
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void ranString (String[] strArray4){
	for (int num = 0; num < strArray4.length; num=+ran) {
		System.out.println(strArray4[num]);
	}	
	}
	
}
