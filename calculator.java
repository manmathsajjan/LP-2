import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a = sc.nextInt();
		System.out.print("b=");
		int b = sc.nextInt();
		
		System.out.println("Addition is " + (a+b));
		System.out.println("Substraction is " + (a-b));
		System.out.println("Multiplication is " + (a*b));
		System.out.println("Division is " + (a/b));
		System.out.println("Modulus is " + (a%b));
		
		//System.out.println("Square of a is " + (a*a));

	}

}
