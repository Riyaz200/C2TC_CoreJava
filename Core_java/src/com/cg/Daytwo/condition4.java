package com.cg.Daytwo;
import java.util.Scanner;

public class condition4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num>18) {
			if(num<20) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		else {
			System.out.println("Invalid number");
		}

	}
}
