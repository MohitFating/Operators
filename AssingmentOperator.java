package oprators;
import java.util.Scanner;

public class AssingmentOperator {

	public static void main(String[] args) {
		int a =10;
		System.out.println("a = 10 ");
		System.out.println("Enter a number to Assing");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		 a +=val;
		 System.out.println("After add assing value a is : " +a);
		 a -=val;
		 System.out.println("After sub assing value a is : " +a);
		 a *=val;
		 System.out.println("After multiplication assing value a is : " +a);
		 a /=val;
		 System.out.println("After division assing value a is : " +a);
		 a %=val;
		 System.out.println("After modulo assing value a is : " +a);
		
	}

}
