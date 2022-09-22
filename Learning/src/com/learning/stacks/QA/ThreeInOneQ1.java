package com.learning.stacks.QA;

public class ThreeInOneQ1 {

	private int numberOfStacks=3;
	private int[] sizes;
	private int[] values;
	private int stackCapacity;
	
	public ThreeInOneQ1(int stackSize) {
		stackCapacity = stackSize;
		values = new int[stackSize * numberOfStacks];
		sizes = new int[numberOfStacks];
	}
	
	public boolean isFull(int stackNum) {
		
		if(sizes[stackNum] == stackCapacity) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean isEmpty(int stackNum) {
		if(sizes[stackNum] == 0) {
			return true;
		} else {
		return false;
		}
	}
	
	public int indexOfTop(int stackNum) {
		int offSet = stackNum * stackCapacity;
		int size = sizes[stackNum];
		return offSet + size -1;
	}
	
	public void push(int stackNum, int value) {
		if(isFull(stackNum)) {
			System.out.println(stackNum+" is full");
		} else {
			sizes[stackNum]++;
			values[indexOfTop(stackNum)] = value;
		}
	}
	
	public int pop(int stackNum) {
		if(isEmpty(stackNum)) {
			System.out.println(stackNum+" is empty");
			return -1;
		} else {
			int topIndex = indexOfTop(stackNum);
			int ret = values[topIndex];
			values[topIndex] = 0;
			sizes[stackNum]--;
			return ret;
		}
	}
	
	public int peek(int stackNum) {
		if(isEmpty(stackNum)) {
			System.out.println(stackNum+" is empty");
			return -1;
		} else {
			return values[indexOfTop(stackNum)];
		}
	}

}
