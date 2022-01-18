package com.searching;

public class recursive_binarySearch {
	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50,60};
		int key=61;
		System.out.println(binarySearch(ar,key,0,ar.length-1));
	}

	private static int  binarySearch(int[] ar, int key, int i, int j) {
		if(i<j)
		{
			int mid=(i+j)/2+1;
			if(ar[mid]==key)
				return mid;
			else if(ar[mid]>key)
				return binarySearch(ar, key, i, mid-1);
			else
				return binarySearch(ar, key,  mid+1,j);
		}
		return -1;
	}
	
}
