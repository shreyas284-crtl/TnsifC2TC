package com.dsatmins;

import java.util.Scanner;

public class Demo7 {
	 public static void main(String[] args) 
	    {
	        float c,f;
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter Fahrenhiet=");
	        
	        f=sc.nextFloat();
	        c=((f-32)*5)/9;
	        System.out.println("Celcius="+c);
	    }
	}

