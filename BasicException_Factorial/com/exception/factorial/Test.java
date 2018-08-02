package com.exception.factorial;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f=new Factorial();//Instantiate factorial class
		Scanner sc=new Scanner(System.in);
		long num;
		System.out.println("Enter the number");
		
		try {
			num=sc.nextInt();
			num=f.getFactorial(num);
			System.out.println(num);
		}
		
		catch(InvalidInputException | FactorialException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
