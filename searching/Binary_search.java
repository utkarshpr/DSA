package com.searching;

public class Binary_search {
	public static void main(String[] args) {
		int ar[]= {10,10};
		int key=10;
		int c=0;
		int l=0,r=ar.length-1;
		while(l<r) {
			int mid=(l+r)/2+1;
			if(ar[mid]==key) {
				c++;
				System.out.println(mid);
				break;
			}
			else if(ar[mid]>key) {
				r=mid-1;
			}
			else
				l=mid+1;
			
		}
		if(c==0)
			System.out.println("-1");
	}
}
