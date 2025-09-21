package com.dsatmins;

public class Demo13 {
	public static void main(String[] args) 
	{
        int i=10,j=10,num=0;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        i++;
        j--;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        num=i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        num=i++ + ++i;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        num=i++ + --j;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        num=--i + j++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);
        System.out.println("---------------------------------------");
        num=++i + ++j;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("num="+num);      
        
    }
}

