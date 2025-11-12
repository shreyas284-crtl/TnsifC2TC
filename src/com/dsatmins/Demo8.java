package com.dsatmins;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) 
	{
		int l,b,area;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        l=sc.nextInt();
        System.out.print("Enter bredth=");
        b=sc.nextInt();
        
        area=l*b;        
        System.out.println("Area of Rectangle="+area);
    }
}

