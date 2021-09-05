package com.bridgeLabs.dataStructure;

import com.bridgeLabz.linkedList.MyNode;
import com.bridgeLabz.queue.MyQueue;

public class PalindromeChecker {
	
	public static void main(String args[]) {

		String word = "reaer";
		System.out.println(isPalindrome(word));
	}
	
	static boolean isPalindrome(String word) {
		MyQueue<String> queue = new MyQueue<>();
		
		for (int i=0;i<word.length();i++) {
			queue.add(new MyNode("" + word.charAt(i)));
		}
		
		for (int i=0;i<word.length()/2;i++) {
			if (!queue.front().getKey().equals(queue.rear().getKey())) {
				return false;
			}
		}
		
		return true;

	}

}
