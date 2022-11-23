package programmingWeek7;

import java.util.Random;
import java.util.Scanner;

public class Lecture2Part1MainForBankAccount {

	public static void main(String[] args) {
		
		int num1, num2;
		num1 = 5;
		num2 = 7;
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		// create 3 bank accounts 
		Lecture2Part1OOPackageBankAccount acc1;
		acc1 = new Lecture2Part1OOPackageBankAccount();
		Lecture2Part1OOPackageBankAccount acc2 = new Lecture2Part1OOPackageBankAccount();
		Lecture2Part1OOPackageBankAccount acc3 = new Lecture2Part1OOPackageBankAccount();
		
		
		// setName is one of our methods created in the other class
		acc1.setName("Matthew");
		acc2.setName("Neil");
		acc2.setName("Thomas");
		
//		acc1.printDetails();
//		acc2.printDetails();
//		acc3.printDetails();
//		
//		System.out.println("\n\n\n\n");
//		
//		acc1.deposit(150.99);
//		acc1.printDetails();
//		
//		acc1.withdraw(25);
//		acc1.printDetails();
//		
//		double amount = acc1.withdraw(35);
//		System.out.println("Withdrew : "+amount);
//		acc1.printDetails();
//		
//		amount = acc1.withdraw(500.99);
//		System.out.println("Withdrew : "+amount);
//		acc1.printDetails();
		
		acc2.deposit(100);
		
		acc1.printDetails();
		acc2.printDetails();
		
		acc1.transfer(6000, acc2);
		
		acc1.printDetails();
		acc2.printDetails();
		
		System.out.println("Program ends");
	}

}
