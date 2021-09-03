package com.bridgeLabs.dataStructure;

import com.bridgeLabz.linkedList.MyNode;
import com.bridgeLabz.stacks.MyStack;

public class SimpleBalancedParanthesis {

	public static void main(String args[]) {

		String expression = "(5+6)∗(7+8)/(4+3)(5+6)∗((7+8)/(4+3)";

		MyStack<Integer> stack = new MyStack<>();

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			if (c == '(') {
				stack.push(new MyNode<>(1));
			} else if (c == ')') {
				stack.stack.pop();
			}
		}

		if (stack.stack.size() == 0) {
			System.out.println("it is balanced");
		}
		else {
			System.out.println("It is not balanced");
		}
	}

}
