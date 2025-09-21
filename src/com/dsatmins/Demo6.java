package com.dsatmins;

import java.util.Scanner;

public class Demo6 {
	 public static void main(String[] args) 
		{
	        int p,r,t,si;
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a amount=");
	        p=sc.nextInt();
	        System.out.print("Enter a rate=");
	        r=sc.nextInt();
	        System.out.print("Enter a time=");
	        t=sc.nextInt();
	        
	        si=(p*r*t)/100;        
	        System.out.println("Simple interest="+si);
	    }
	}

