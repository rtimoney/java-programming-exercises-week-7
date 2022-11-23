package programmingWeek7Lecture2Part2;

public class Lecture2Part2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleCalc calculator = new SimpleCalc();
		try {
		calculator.add(25, 25);
		calculator.subtract(50, 25);
		calculator.multiply(10, 50);
		calculator.divide(500, 0);
		} catch (Exception e) {
			System.out.println("Did you try to divide by zero?");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("End ");
		
	}

}
