package com.sort;

public class selection_sort {
	public static void main(String[] args) {
		int ar[]= {90,3,56,2,88,23,74};
		int n=ar.length;
		
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(ar[j]<ar[min])
					min=j;
			}
			int temp=ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
		
	}
}
