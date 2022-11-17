package com.bridgelabz.day3project;

public class Arrayeven {
	public static void main(String[] args) {
		int[] arr = new int[] { 11,12,33,14,15};

		for (int i = 1; i < arr.length; i = i + 2) {

			// print element to the console
			System.out.println(arr[i]);
		}
	}
}
