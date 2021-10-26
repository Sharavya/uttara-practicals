package com.collection.practicals.part1;

import java.util.Arrays;

public class MyArrayList {

	private Object[] arr = new Object[10];
	private int count = 0;
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyArrayList other = (MyArrayList) obj;
		if (!Arrays.equals(arr, other.arr))
			return false;
		if (count != other.count)
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "MyArrayList [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
	}

	
	public boolean add(Object o) {
		if (count < arr.length) {
			arr[count++] = o;
		} else {
			Object[] newArr = new Object[20];
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
			arr[count++] = o;
		}
		return true;
	}

	public Object get(int index) {
		if (index > 0 && index <= count)
			return arr[index];
		else
			throw new IllegalArgumentException("accessing out of boundary");
	}
	
	public boolean contains(Object o) {
		// access each ele of arraylist
		// compare with o
		// if true, return true
		// else check next ele
		// after checking if no math, return false
		for (Object obj : arr) {
			if (obj.equals(o))
				return true;
		}
		return false;
	}

	public boolean remove(Object o) {
		// loop over and compare with each element - for loop
		// when match is found shift element by 1 position - for loop
		for (int i = 0; i < count; i++) {
			if (arr[i].equals(o)) {
				for (int k = i + 1; k < count; k++) {
					arr[k] = arr[k + 1];
				}
				arr[count] = null;
				count--;
				return true;
			}
		}
		return false;
	}
	
	public Object remove(int index) {
		if (index > 0 && index < count) {
			Object temp = arr[index];
			for (int k = index; k < count - 1; k++) {
				arr[k] = arr[k + 1];
			}
			arr[count] = null;
			count--;
			return temp;
		} else
			throw new IllegalArgumentException("Accessing out of index");
	}
	
	public boolean add(int index, Object o) {
		for (int k = count - 1; k > index; k--) {
			arr[k] = arr[k + 1];
		}
		arr[index] = o;
		count++;
		return true;
	}
	
	public int size() {
		return count;
	}
}
