package com.bridgeLabs.dataStructure;

import java.util.ArrayList;

import com.bridgeLabz.linkedList.MyLinkedList;


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
	
	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}
	
	
	
	
}
