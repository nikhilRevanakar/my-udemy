package com.learning.CircluarQueue;

public class CircularQueue {
	
	int[] arr;
	
	int topOfQueue;
	
	int beginingOfQueue;
	
	int size;

	public CircularQueue(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginingOfQueue = -1;
		this.size = size;
	}
	
	public boolean isEmpty() {
		if(topOfQueue==-1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(topOfQueue+1 == beginingOfQueue) {
			return true;
		} else if(beginingOfQueue==0 && topOfQueue+1==size) {
			return true;
		} else
		{
			return false;
		}
	}
	
	
	public void enQueue(int val) {
		if(isFull()) {
			System.out.println("Queue is FUll");
		} else if(isEmpty()) {
			beginingOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = val;
			System.out.println("Element inserted successfully");
		} else {
			if(topOfQueue==size-1) {
				topOfQueue = 0;
			}
			else {
				topOfQueue++;
			}
			arr[topOfQueue] = val;
			System.out.println("Element inserted successfully");
		}
		
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue empty");
			return -1;
		} else {
			int res = arr[beginingOfQueue];
			arr[beginingOfQueue] = 0;
			if(beginingOfQueue == topOfQueue) {
				beginingOfQueue = -1; 
				topOfQueue = -1;
			} else if(beginingOfQueue+1 == size) {
				beginingOfQueue =0;
			} else {
				beginingOfQueue++;
			}
			
			return res;
		}
	}
	
}
