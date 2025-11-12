package com.dsatmins;

import java.util.Scanner;

public class Demo23 {
	 public static void main(String[] args)
	    {
	        int binary;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter binary number=");
	        binary = sc.nextInt();
	        int decimal = 0;
	        int n = 0;

	        while (binary>0)
	        {
	            int temp = binary % 10;
	            decimal += temp * Math.pow(2, n);
	            binary = binary / 10;
	            n++;
	        }
	        System.out.println("Decimal="+decimal);
	    }
	}

