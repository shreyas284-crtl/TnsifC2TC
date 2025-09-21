package com.dsatmins;

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
        int     n1, n2, n3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1 number=");
        n1 = sc.nextInt();
        System.out.print("Enter n2 number=");
        n2 = sc.nextInt();
        System.out.print("Enter n3 number=");
        n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("n1 is greatest.");
            } else {
                System.out.println("n3 is greatest.");
            }
        } else {
            if (n2 > n3) {
                System.out.println("n2 is greatest.");
            } else {
                System.out.println("n3 is greatest.");
            }
        }
    }
}

