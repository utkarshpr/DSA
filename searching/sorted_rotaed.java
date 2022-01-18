package com.searching;

public class sorted_rotaed {
	public static void main(String[] args) {
		int ar[] = { 45, 67,78,88,98,12,23,40};
		int key = 10;
		int l = 0, r = ar.length - 1;
		binarySearch(ar, key, l, r);
	}

	public static void binarySearch(int ar[],int key,int l,int r) 
	{	
		while(l<=r) {
		int mid=(l+r)/2;
		if(ar[mid]>key) {
			r=mid-1;
		}
		else if(ar[mid]<key) {
			l=mid+1;
		}
		else {
			System.out.println(mid);
			return;
		}
	}
	}
}
