package com.searching;

public class totalOcurrence {
public static void main(String[] args) {
	int ar[]= {1,10,10,10,20,20,40};
	int key=10;
	int l=0,r=ar.length-1;
	while(l<=r) {
		int mid=(l+r)/2;
		if(ar[mid]>key) {
			r=mid-1;
		}
		else if(ar[mid]<key) {
			l=mid+1;
		}
		else {
			if(ar[mid]==ar[mid-1] && ar[mid]==ar[mid+1])
			{
				l=mid-1;r=mid+1;
			}
			else if(ar[mid]==ar[mid-1]) {
				l=mid-1;
			}
			else if(ar[mid]==ar[mid+1]) {
				l=mid+1;
			}
			else {
				return ;
			}
		}
	}
	System.out.println(r-l+1);
}
}
