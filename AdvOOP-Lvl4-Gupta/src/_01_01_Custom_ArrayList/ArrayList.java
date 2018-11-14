package _01_01_Custom_ArrayList;

import java.lang.*;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] arr;
	int size;
	
	public ArrayList() {
		arr = (T[]) new Object[10];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		T val = arr[loc];
		
		return val;
	}
	
	public void add(T val) {
		
		arr[size++] = val;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr2 = (T[]) new Object[arr.length + 1];
		for(int i = 0; i < arr2.length; i++) {
			if(i < loc) {
				arr2[i] = arr[i];
			} else if (i > loc) {
				arr2[i] = arr[i-1];
			} else {
				arr2[i] = val;
			}
		}
		arr = arr2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] arr2 = (T[]) new Object[arr.length - 1];
		for(int i = 0; i < arr.length; i++) {
			if(i < loc) {
				arr2[i] = arr[i];
			} else if (i > loc) {
				arr2[i-1] = arr[i];
			}
		}
		arr = arr2;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==val) {
				return true;
			}
	}
		
		return false;
}
}