package com.TwoPointer;

import java.util.Arrays;

public class close_to_target {
	public static void main(String[] args) {
		int ar[] = { -1, 2, 1, -4 };

		System.out.println(threeSum(ar, 2));
	}

	public static int threeSum(int[] nums, int target) {
		int res = nums[0] + nums[1] + nums[2];
		int min=0;
		Arrays.sort(nums);
	
		for (int i = 0; i < nums.length - 2; i++) {
			int start = i + 1;
			int end = nums.length - 1;
			while (start < end) {
				int sum = nums[start] + nums[end] + nums[i];
				 int distance = Math.abs(sum - target);
	                res = distance < Math.abs(res - target) ? sum : res;
	               if(sum<target)
	            	   start++;
	               else
	            	   end--;
			}
		}
		return min;

	}
}
