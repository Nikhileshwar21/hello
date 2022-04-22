package com.example;

import java.util.*;

public class QuotientException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two number to be divided");
		
		double a,b,c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		try
		{
			c = a/b;
			if(b==0)
				throw new ArithmeticException();
			System.out.println("The quotient of "+a+"/"+b+" = "+c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Input");
			
			
		}
		finally
		{
			System.out.println("Inside Finally block");
		}
		
		

	}

}
