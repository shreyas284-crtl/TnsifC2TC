package com.dsatmins;

import java.util.*;

public class Demo31 {
	public static void main(String[] args)
    {
        int temp;
        int ar[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter the number ar[" + i + "]:");
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 9 - i; j++)
            {
                if (ar[j] > ar[j + 1])
                {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted order:");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
