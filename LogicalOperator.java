package oprators;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {

//		The truth table of a two-input OR basic gate is given as
//
//		A	B  A||B
//		0	0	0
//		0	1	1
//		1	0	1
//		1	1	1

		
//		The truth table of a two-input AND basic gate is given as
//
//		A	B  A&&B
//		0	0	0
//		0	1	0
//		1	0	0
//		1	1	1
		
		

		System.out.println("Enter a First Num :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter a Second Num :");
		Scanner scc = new Scanner(System.in);
		int b = scc.nextInt();
		System.out.println("Enter a Third Num :");
		Scanner sccc = new Scanner(System.in);
		int c = sccc.nextInt();
		
		System.out.println("Given 1st logic is : " +(a>b && b>c || c>a ));
		System.out.println("Given 2nd logic is : " +(a>b && b>c || a>c ));
		System.out.println("Given 3rd logic is : " +(a>b && b<c || a<c ));
		
		
	}

}
