package com.bridgelabz.day3project;

public class Array2large {
	public static int getSecondLargest(int[] a) {
		int x;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		return a[a.length - 2];
	}

	public static void main(String args[]) {
		int a[] = { 11, 10, 4, 15, 16, 13, 2 };
		System.out.println("Second Largest: " + getSecondLargest(a));
	}
}
