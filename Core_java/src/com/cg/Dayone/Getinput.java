package com.cg.Dayone;

import java.util.Scanner;


public class Getinput {
	public static void main(String[]args)
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(a);
		System.out.println("Enter the number:");
		int b=sc.nextInt();
		System.out.println(b);
	}

}
