package com.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Three_Sum {
	public static void main(String[] args) {
		int ar[]={-1,2,1,-4};
		
		System.out.println(threeSum(ar));
	}
	public static  List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		HashSet<ArrayList<Integer>> hs=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            int start=i+1;
            
            int end=nums.length-1;
            while(start<end){
                int sum=nums[start]+nums[end]+nums[i];
                if(sum==0){
                    List<Integer> ar=new ArrayList<>();
                    ar.add(nums[i]);
                    ar.add(nums[start]);
                    ar.add(nums[end]);
                    if(!hs.contains(ar))
                    {
                    	hs.add((ArrayList<Integer>) ar);
                    	res.add(ar);
                    }
                    start++;
                  
                }
                else if(sum<0){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return res;
        
    }
}
