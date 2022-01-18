package com.slidingWindow;

public class Mini_sub_atleat_k {
	public static void main(String[] args) {
		int nums[]= {2,-1,2};
		int k=3;
		 int start=0,end=0,sum=0;
	        int res=Integer.MAX_VALUE;
	        while(start<=end && end<nums.length){
	        	  while(sum<k && end<nums.length)
	              {
	                  sum+=nums[end];
	                  end++;
	              }
	              while( start<end){
	            	  if(sum>=k)
	                     System.out.println(sum);
	                      sum-=nums[start];
	                      start++;
	                  }
	            
	        }
	        //return (res==Integer.MAX_VALUE)?(-1):res;
	    
	}
}
