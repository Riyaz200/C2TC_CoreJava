package com.cg.day6;

public class Stack {
	
			int rollno;
			String name;
			static String clg="ifet";
			Stack(int r,String s){
				rollno=r;
				name=s;
			}
			void display() {
				System.out.println(rollno+" "+name+" "+clg);
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Stack s=new Stack(1,"loki");
				Stack s1=new Stack(1,"thor");
				s.display();
				s1.display();
				
			}
		}




