package com.bridgeLabs.dataStructure;

import java.util.ArrayList;

import com.bridgeLabz.linkedList.INode;
import com.bridgeLabz.linkedList.MyLinkedList;
import com.bridgeLabz.linkedList.MyNode;


public class HashFunctionSearch<K, V> {

	private final int numBuckets;
	ArrayList<MyLinkedList> myBucketArray;
	
	public HashFunctionSearch() {
		this.numBuckets = 11;
		this.myBucketArray = new ArrayList<>(numBuckets);
		
		for (int i=0;i<numBuckets;i++) {
			this.myBucketArray.add(null);
		}
	}
	
	public static void main(String args[]) {

		HashFunctionSearch<Integer, Integer> hashFunctionSearch = new HashFunctionSearch<>();
		
		hashFunctionSearch.add(15, 15);
		hashFunctionSearch.add(20, 20);
		hashFunctionSearch.add(34, 34);
		hashFunctionSearch.add(9, 9);
		hashFunctionSearch.add(5, 5);
		
		System.out.println(hashFunctionSearch.toString());

		
	}
	
	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}
	
	
	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		MyLinkedList myLinkedList = this.myBucketArray.get(index);
		
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.getNode(new MyNode<K>(key));

		if (myMapNode == null)  {
			myMapNode = new MyMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
		
	}

	@Override
	public String toString() {
		return "HashFunctionSearch [numBuckets=" + numBuckets + ", myBucketArray=" + myBucketArray + "]";
	}
	
	
	
}
