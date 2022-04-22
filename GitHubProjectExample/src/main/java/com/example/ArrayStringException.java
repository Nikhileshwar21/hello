package com.example;

import java.util.*;

public class ArrayStringException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		String[] arr = new String[n];
		try
		{
			for(int i =0;i<n;i++)
			{
				arr[i] = sc.nextLine();
			}
		
			System.out.println("Enter the index of array");
			int index = sc.nextInt();
			System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("invalid array(Out of bound exception)");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Input(Number format exception)");
		}
		
		
	}

}
