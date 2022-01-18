package com.slidingWindow;

public class max_minSubArraySizeK {
	public static void main(String[] args) {
		int ar[]= {2,5,1,8,2,9,1};
		int size=7;
		int k=3;
		System.out.println(helper(ar,size,k));
	}
	public static int helper(int [] ar,int n,int k) {
		
		
		
		int start=0,end=0,max=Integer.MIN_VALUE;
		int sum=0;
		while(end<ar.length) {
			
			sum+=ar[end++];
			if(k==(end-start))
			{
				if(sum>max)
					max=sum;
				sum-=ar[start++];
			}
		}
		return max;
	}
}
