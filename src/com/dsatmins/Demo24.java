package com.dsatmins;

import java.util.Scanner;

public class Demo24 {
	 public static void main(String[] args)
	    {
	        // TODO code application logic here
	        int n,
	        fact = 1;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of series=");
	        n = sc.nextInt();
	        for (int i = 1; i <= n; i++)
	        {
	            fact = fact * i;
	        }
	        System.out.println("Factorial=" + fact);
	    }

}
