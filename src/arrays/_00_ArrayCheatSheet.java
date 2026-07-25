package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		
		String[]movies = {"LordOfTheRings", "HarryPotter", "Marvel", "StarWars", "DC"};
		
		//2. print the third element in the array
		System.out.println("Marvel");
		//3. set the third element to a different value
		movies[2] = "TopGun";
		//4. print the third element again
		System.out.println("TopGun");
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<movies.length;i++) {
		     System.out.println(movies[i]);
		}
		
		//6. make an array of 50 integers
		int[]numbers = new int[50];
		Random ranum = new Random();
		//7. use a for loop to make every value of the integer array a random number
		for (int i=0;i<numbers.length;i++) {
		    numbers[i]= ranum.nextInt(500);
		    
		    	}
		int smallest = 500;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] < smallest) {
				smallest = numbers[i];
				
			}
			
		}
		System.out.println(smallest);
		//8. without printing the entire array, print only the smallest number in the array
		int largest = -1;
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
				
			}
		}
		System.out.println(largest);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		
	}
}
