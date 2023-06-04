package oprators;
import java.util.Scanner;

public class Arithmaticsop {

	public static void main(String[] args) {
		System.out.println("Enter 1st number: ");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
		
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();

		System.out.println("Addition of two number is :"+(num1+num2));
		System.out.println("Subtraction of two number is :"+(num1-num2));
		System.out.println("Multiplicatio of two number is :"+(num1*num2));
		System.out.println("Divison of two number is :"+(num1/num2));
		System.out.println("Modulo of two number is :"+(num1%num2));
	}

}
