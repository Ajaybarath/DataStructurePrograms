package com.bridgeLabs.dataStructure;

import java.util.ArrayList;

import com.bridgeLabz.hashTable.MyMapNode;
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
	
	
	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		MyLinkedList myLinkedList = this.myBucketArray.get(index);
		
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>)myLinkedList.findNode((Comparable) key);

		if (myMapNode == null)  {
			myMapNode = new MyMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
		
	}
	
	
}
