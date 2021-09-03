package com.bridgeLabs.dataStructure;

import com.bridgeLabz.linkedList.INode;
import com.bridgeLabz.linkedList.MyNode;
import com.bridgeLabz.queue.MyQueue;

public class QueueAnagram extends Palindrome {

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

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j < 100; j++) {
				if (prime(incrementor + j)) {
					array[i][col++] = incrementor + j;
				}
			}
			col = 0;
			incrementor += 100;
		}

		MyQueue<Integer> queue = new MyQueue<>();

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j < 100; j++) {
				for (int k = j; k < 100; k++) {
					if (array[i][k] != 0 && array[i][k] != 0 && isAnagram("" + array[i][k], "" + array[i][j])
							&& isPalindrome("" + array[i][j])) {
						queue.add(new MyNode<>(array[i][j]));
					}
				}

			}
		}

		queue.printQueue();

	}

}
