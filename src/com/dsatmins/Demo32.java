package com.dsatmins;

import java.util.Scanner;

public class Demo32 {
	 public static void main(String[] args)
	    {
	        String st,revSt="";
	        int l;
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.print("Enter String:");
	        st=sc.nextLine();
	        l=st.length();
	        for (int i = l-1; i >= 0; i--)
	        {
	            char ch;
	            ch=st.charAt(i);
	            revSt=revSt+ch;
	        }
	        System.out.println("Reverce String:"+revSt);
	    }
	}

