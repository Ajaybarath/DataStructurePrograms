package com.bridgeLabs.dataStructure;

import java.util.ArrayList;

public class PrimeNumber2D {
	
	static boolean prime(int n) {
		int m = n / 2;
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String args[]) {
		
		int array[][] = new int[11][100];
		
		int col = 0;
		
		int incrementor = 0;
		
		for (int i=1;i<=10;i++) {
			for (int j=1;j<100;j++) {
				if (prime(incrementor+j)) {
					array[i][col++] = i;
					System.out.print(incrementor+j + " ");

				}
			}
			col = 0;
			incrementor += 100;
			System.out.println();
		}
		
		
	}

}
