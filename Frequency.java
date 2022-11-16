package com.bridgelabz.day3project;

public class Frequency {
	public static void main(String[] args) {

		int[] array = new int[] { 14,15,14,15,16,17,15,17,18,19,18 };
		int[] frquency = new int[array.length];
		int visited = -1;
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					frquency[j] = visited;
				}
			}
			if (frquency[i] != visited)
				frquency[i] = count;
		}
		System.out.println("frequency of each element");
		System.out.println(" Element | Frequency");

		for (int i = 0; i < frquency.length; i++) {
			if (frquency[i] != visited)
				System.out.println("    " + array[i] + "    |    " + frquency[i]);
		}

	}
}
