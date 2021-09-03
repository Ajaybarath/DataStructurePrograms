package com.bridgeLabs.dataStructure;

import com.bridgeLabz.linkedList.INode;
import com.bridgeLabz.linkedList.MyLinkedList;
import com.bridgeLabz.linkedList.MyNode;

public class UnOrderedList {
	
	public static void main(String args[]) {

		String sentence = "To be or not be";
		String words[] = sentence.toLowerCase().split(" ");
		
		MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
		
		for (String word : words) {
			
			if (myLinkedList.findNode(new MyNode<String>(word)) == false) {
				myLinkedList.append(new MyNode<String>(word));
			}
			else {
				myLinkedList.deleteNode(new MyNode<String>(word));
			}
			
		}
		
		
		myLinkedList.printNode();
		
	}

}
