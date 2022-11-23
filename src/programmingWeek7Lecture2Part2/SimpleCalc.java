package programmingWeek7Lecture2Part2;

public class SimpleCalc {
	
	public void add(int num1,int num2) {
		System.out.println("Result of add "+(num1+num2));
	}

	
	public void subtract(int num1,int num2) {
		System.out.println(num1-num2);
	}

	
	public void multiply(int num1,int num2) {
		System.out.println("Result of multiply "+(num1*num2));
		System.out.println(doMultiply(num1, num2));}
	
	private int doMultiply(int num1,int num2) {
		return (num1*num2);}
		
	public void divide(int num1,int num2) {
			System.out.println(num1/num2);
		}

	}

	
	

