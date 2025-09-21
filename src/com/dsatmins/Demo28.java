package com.dsatmins;

import java.util.Scanner;

public class Demo28 {
	public static void main(String[] args)
    {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms=");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            int t=i*i;
            sum=sum+t;
            if (n == i)
            {
                System.out.println(t);
            }
            else
            {
                System.out.print(t+"+");
            }
        }
        System.out.println("Sum of series="+sum);
    }
}

