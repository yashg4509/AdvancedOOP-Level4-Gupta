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
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		;
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}