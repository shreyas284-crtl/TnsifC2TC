package com.dsatmins;

public class Demo5 {
	public static void main(String args[])
	{
		System.out.println("Example 1:-");
		/*Java Unary Operator Example: ++ and --*/
		int x = 10;
		System.out.println(x++); //10 (11)  
		System.out.println(++x); //12  
		System.out.println(x--); //12 (11)  
		System.out.println(--x); //10  
		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a); //10+12=22  
		System.out.println(b++ + b++); //10+11=21 
		System.out.println("Example 2:-");
		/*Java Unary Operator Example: ~ and !*/
		a = 10;
		b = -10;
		boolean p = true;
		boolean q = false;
		System.out.println(~a); /*-11 (minus of total positive value which starts from 0)*/
		System.out.println(~b); /*9 (positive of total minus, positive starts from 0)*/  
		System.out.println(!p); /*false (opposite of boolean value)*/
		System.out.println(!q); /*true*/  
		System.out.println("Example 3:-");
		/*Java Arithmetic Operator Example*/
		a = 10;
		b = 5;
		System.out.println(a + b); //15  
		System.out.println(a - b); //5  
		System.out.println(a * b); //50  
		System.out.println(a / b); //2  
		System.out.println(a % b); //0  
		System.out.println("Example 4:-");
		/*Java Arithmetic Operator Example: Expression*/
		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
		System.out.println("Example 5:-");
		/*Java AND Operator Example: Logical && and Bitwise &*/
		x = 10;
		int y = 5;
		int z = 20;
		System.out.println(x < y && x < z); //false && true = false  
		System.out.println(x < y & x < z); //false & true = false
		System.out.println("Example 6:-");
		/*Java OR Operator Example: Logical || and Bitwise |*/
		a = 10;
		b = 5;
		int c = 20;
		System.out.println(a > b || a < c); //true || true = true
		System.out.println("Example 7:-");
		/*Java Ternary Operator Example*/
		a = 2;
		b = 5;
		int min = (a < b) ? a : b;
		System.out.println(min);
		System.out.println("Example 8:-");
		/*Java Assignment Operator Example*/
		a = 10;
		b = 20;
		a += 4; //a=a+4 (a=10+4)  
		b -= 4; //b=b-4 (b=20-4)  
		System.out.println(a);
		System.out.println(b);
		System.out.println("Example 9:-");
		/*Java Assignment Operator Example*/
		a = 10;
		a += 3; //10+3  
		System.out.println(a);
		a -= 4; //13-4  
		System.out.println(a);
		a *= 2; //9*2  
		System.out.println(a);
		a /= 2; //18/2  
		System.out.println(a);
	}
}
