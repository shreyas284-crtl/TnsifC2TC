package com.dsatmins;

import java.util.Scanner;

public class Demo9 {
	 public static void main(String[] args) 
	    {
	        float area,pi,r;
	        pi=(float)22/7;
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter radius=");
	        r=sc.nextFloat();
	        area=(float)pi*r*r;        
	        System.out.println("Area of Circle="+area);
	    }
	}

