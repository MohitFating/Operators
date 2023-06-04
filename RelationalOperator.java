package oprators;
import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) 
	{
		System.out.println("Enter a First Num :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter a Second Num :");
		Scanner scc = new Scanner(System.in);
		int b = scc.nextInt();
		System.out.println("Is given Number a Equal to b : "+(a==b));
		System.out.println("Is given Number a Not Equal b : "+(a!=b));
		System.out.println("Is given Number a less than Equal to b : "+(a<=b));
		System.out.println("Is given Number a greater than Equal to b : "+(a>=b));
		System.out.println("Is given Number a is less than b : "+(a<b));
		System.out.println("Is given Number a is greater than b : "+(a>b));
	}

}
