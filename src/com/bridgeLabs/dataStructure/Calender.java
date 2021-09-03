package com.bridgeLabs.dataStructure;

import java.util.Scanner;

public class Calender {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		int M = s.nextInt();
		int Y = s.nextInt();

		int calender[][] = new int[6][8];
		int row = 0;
		int col = 0;

		int start = 2;
		
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ((((Y % 4 == 0) && (Y % 100 != 0)) || (Y % 400 == 0)) && M == 2)
			days[M] = 29;

		for (int i = 1; i <= days[M]; i++) {
			System.out.print(i + " ");
			calender[row][col++] = i;

			if (((i + start) % 7 == 0) || (i == days[M])) {
				row++;
				col = 0;
				System.out.println();

			}
		}



	}
}
