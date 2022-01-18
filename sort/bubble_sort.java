package com.sort;

public class bubble_sort {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,9};
		int n=ar.length;
		boolean swap=false;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++)
			{
				if(ar[j]>ar[j+1]) {
					int temp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=temp;
					swap=true;
				}
			}
			if(swap==false)
				break;
		
		for(int x:ar) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	}
}
