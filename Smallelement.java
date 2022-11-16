package com.bridgelabz.day3project;

public class Smallelement {
	public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9 };
        int minimum= a[0];
        for (int i=0;i<a.length;i++) {
        	if (a[i]<minimum)
        		minimum=a[i];
        }
        		
        		
        	
            System.out.println("Smallest element present in given array:" +minimum);
}
}
