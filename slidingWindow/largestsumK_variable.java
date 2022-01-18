package com.slidingWindow;

public class largestsumK_variable {
	public static void main(String[] args) {
		int ar[]= {4,1,1,3,2,1,1,1,5};int k=5;int start=0,end=0,sum=0;
		while(end<ar.length) {
			sum+=ar[end];;
			if(sum<k) {
				end++;
			}
			else if(sum==k) {
				System.out.println(+start+" to "+(end)+"="+sum);
				end++;
			}
			else if(sum>k) {
				while(sum>k) {
					sum-=ar[start] ;
					start++;
				}
				if(sum==k) {
					System.out.println(+start+" to "+(end)+"="+sum);
				}
				end++;
			}
		}
	}

}
