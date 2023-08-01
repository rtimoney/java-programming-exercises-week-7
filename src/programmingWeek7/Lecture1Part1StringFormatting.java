package programmingWeek7;

public class Lecture1Part1StringFormatting {

	public static void main(String[] args) {
		int int1 = 123;
		
	
	
		double double1 = 123.456;
		
		String string1 = String.format("The double is %.2f amd the int is %d",double1, int1);
		System.out.println(string1);
	}

}
