package programmingWeek7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture1Part1FileExercise {

	// creating a set value that will not be changed within the code - a compile-time constant 
public static final int LIMIT = 3;	
	
	public static void main(String[] args) {
	
		
		// NOTES
		// setting up the file - link to the actual file 
		// file reader is opening the file and viewing the first element in the file 
		// buffered reader retrieves tall of the data from the file for easy access - more efficient
		// should be closed in order 
		
		// beginning of try block as there are places in the code where run-time errors could arise
		try {
		
		// creating a scanner to allow the user to feed data into the program	
		Scanner keyboard = new Scanner(System.in);
		
		// creating our array of length LIMIT - 3 elements
		int[] numbers = new int[LIMIT];
		
		
		
		// for loop which will allow the user to provide the content of the array 
		for(int i=0; i<LIMIT; i++) {
			
			// boolean created to allow our while loop to work 
			boolean done=false;
			
			// while boolean 'done' is false, we while continue to go through the while block 
			while(!done) {
			
			// beginning of try block - we ask the user to input a number but they may not 	
			try {
			
			System.out.println("Please enter your next number : ");
			
			// setting the relevant element in the array = whatever the user types - we require it to be an int
			numbers[i]= keyboard.nextInt();
	  	    // if an exception is thrown, we jump out of the try to the first catch block
			// we jump to keyboard.next() which is used to clear the enter key remaining 
			// on the scanner to prevent infinite loop
			// we then jump back to the beginning of the while loop - while is still false 
			// the user will be prompted again until a valid input is received
			
			// if we arrive here, the while loop can be closed on this particular iteration 
			// the program will jump back to the beginning of the for loop to set the next element
			done = true;
	  	    
	  	
			}
			
			catch (InputMismatchException e) {
				keyboard.next();
		}
			}
		}
		// prints the array as a nice neat String
		System.out.println(Arrays.toString(numbers));
		
		// Sorts to ascending order 
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		
		// create a reference to a file 
		File firstFile = new File("SortedNumbers.txt");
		
		// if the file does not exist, create the file 
		if (!firstFile.exists()) {
				firstFile.createNewFile();
		}
		// create a filewriter that will write to our file 
		FileWriter fw = new FileWriter(firstFile, true);
		// bufferedwriter for more efficient file writing 
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
		// now we create a for loop to write the array to our file 
		for (int i=0; i<LIMIT; i++) {
			// won't work - need to output to file as a string 
			// bw.write(numbers[i]);
			
			
			// can be done by concantinating on a "" - bit hackey
			// bw.write(numbers[i]+"");
			
			// writes the number at element i of the array to the file 
			bw.write(String.valueOf(numbers[i]));
			
			// comma separates elements in the array - a csv file 
			bw.write(",");
		}
		// have to close our writers in order, outside the loop 
		bw.close();
		fw.close();
		
		// quick for loop to reverse the order of the array 
		for (int i = numbers.length-1; i >= 0; i--) {  
           System.out.print(numbers[i] + " ");  
        
        }  
		
		
		}
		
		
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Fix your code - there is something wrong with your for loop");
			}
		catch (IOException e) {
			System.out.println("Sorry, something went wrong - IOE exception");;
			}
		
		
		
		
		
		
		
		System.out.println("The end");
		
		}
		
	}


