package com.dsatmins;

import java.util.Scanner;

public class Demo27 {
	public static void main(String[] args)
    {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms=");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            int t = i * 2 - 1;
            sum = sum + t;
            if (n == i)
            {
                System.out.println(t);
            }
            else
            {
                System.out.print(t + "+");
            }
        }
        System.out.println("Sum of even series=" + sum);
    }
}

