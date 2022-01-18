package com.slidingWindow;

import java.util.TreeMap;

public class Leetcode_1438_DifferenceIsK {
	public static void main(String[] args) {
		int A[] = { 1,5,6,7,8,10,6,5,6};
		int limit = 4;
		int i = 0, j;
	    TreeMap<Integer, Integer> m = new TreeMap<>();
	    for (j = 0; j < A.length; j++) {
	    	System.out.println(m);
	        m.put(A[j], 1 + m.getOrDefault(A[j], 0));
	        if (m.lastEntry().getKey() - m.firstEntry().getKey() > limit) {
	            m.put(A[i], m.get(A[i]) - 1);
	            if (m.get(A[i]) == 0)
	                m.remove(A[i]);
	            i++;
	        }
	    }
	    System.out.println( j - i);
	}
	}

