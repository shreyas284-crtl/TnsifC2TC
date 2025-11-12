package com.dsatmins;

import java.util.Scanner;

public class Demo22 {
	public static void main(String[] args)
    {
        int choice;
        double area;
        int l,b;
        int a;
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Area of Right Triangle");
        System.out.println("2- Area of Equilateral Triangle");
        System.out.println("3- Area of Square");
        System.out.println("4- Area of Rectangle");
        System.out.println("5- Area of Circle");
        System.out.println("------------------------------");
        System.out.print("Select your choice=");        
        choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.print("Enter l=");
                l=sc.nextInt();
                System.out.print("Enter b=");
                b=sc.nextInt();
                area=(l*b)/2;
                System.out.println("Area of Right Triangle="+area);
                break;
            case 2:                
                System.out.print("Enter a=");
                a=sc.nextInt();
                area=(a*a*Math.sqrt(3))/4;
                System.out.println("Area of Equilateral Triangle="+area);
                break;
            case 3:
                System.out.print("Enter a=");
                a=sc.nextInt();
                area=a*a;
                System.out.println("Area of Square="+area);
                break;
            case 4:
                System.out.print("Enter l=");
                l=sc.nextInt();
                System.out.print("Enter b=");
                b=sc.nextInt();
                area=l*b;
                System.out.println("Area of Rectangle="+area);
                break;
            case 5:
                System.out.print("Enter r=");
                r=sc.nextInt();
                area=r*r*22/7;
                System.out.println("Area of Circle="+area);
                break;
            default:
                System.out.print("Enter valid choice.");
        }
    }
}
