package com.slidingWindow;

public class leetcode_1343 {

	
	    public static int numOfSubarrays(int[] arr, int k, int threshold) {
	        int start=0,end=0,count=0,sum=0;
	        while(end<arr.length){
	            sum+=arr[end++];
	            if(end-start==k){
	                System.out.println(sum+" "+threshold*k);
	                if(sum>=(threshold*k)){
	                    
	                    count++;
	                }
	                sum-=arr[start];
	                start++;
	            }
	        }
	        return count;
	        
	    }
	    public static void main(String args[]) {
	    	int ar[]= {2,2,2,2,5,5,5,8};
	    	System.out.println(numOfSubarrays(ar,3, 4));
	    }
	}