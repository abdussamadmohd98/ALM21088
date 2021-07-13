import java.io.Reader;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		int j=200;
		int sum=i+j;
		System.out.println("the sum of i and j is :"+sum);
		
		Scanner reader = new Scanner(System.in); 
		 System.out.print("Enter a number: ");
		 int number = reader.nextInt();
		 System.out.println("You entered: " + number);
		 System.out.println("Enter the second number :");
		 int number2 = reader.nextInt();
		 System.out.println("you entered :"+number2);
	}
}
