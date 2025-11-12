package com.dsatmins;

import java.util.Scanner;

public class Demo25 {
	public static void main(String[] args)
    {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of series=");
        n = sc.nextInt();
        int a = 0,
        b = 1, c;
        for (int i = 1; i <= n; i++)
        {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}

