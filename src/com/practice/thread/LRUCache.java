package com.practice.thread;

import java.util.LinkedHashMap;
import java.util.Map;


public class LRUCache {
	
	private int capacity;
	public LRUCache(int capacity)
	{
		this.capacity=capacity;
		this.cache = new LinkedHashMap<>(this.capacity);
	}
	Map<Integer,Integer> cache;
	
	
	public void put(int key,int value)
	{
		// if map contains key, replace value and move to end
		if(cache.containsKey(key))
		{
			cache.put(key, value);
			moveToEnd(key);
			return;
		}
		
		// if exceeds capacity
		if(cache.size()>=this.capacity)
		{
			// remove first node
			int oldKey = cache.keySet().iterator().next();
			//System.out.println(oldKey);
			cache.remove(oldKey);
		}
		cache.put(key, value);
	}
	
	public int get(int key)
	{
		if(!cache.containsKey(key))
			return -1;
		moveToEnd(key);
		return cache.get(key);
	}
	
	public void moveToEnd(int key)
	{
		int val = cache.get(key);
		cache.remove(key);
		cache.put(key, val);
	}
	public static void main(String args[])
	{
		LRUCache lru = new LRUCache(3);
		lru.put(1, 1);
		lru.put(2, 2);
		lru.put(3, 3);
		System.out.println(lru.get(1));
		System.out.println(lru.get(2));
		lru.put(4, 4);
		lru.put(5, 4);
		System.out.println(lru.get(3));
		System.out.println(lru.get(1));
	}

}
