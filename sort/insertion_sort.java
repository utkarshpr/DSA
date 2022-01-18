package com.sort;

public class insertion_sort {
	public static void main(String[] args) {
		int ar[]= {2,34,54,13,57,32,67,346};
		int n=ar.length;
		for(int i=1;i<n;i++) {
			int key=ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>key) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
		//display
	}
}
