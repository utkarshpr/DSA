package com.slidingWindow;

import java.util.HashMap;

public class k_change_Binary {
	public static void main(String[] args) {
		int ar[]= {1,1,1,0,0,0,1,1,1,1,0,0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k=16;
		HashMap<Integer,Integer> hm=new HashMap<>();
		int start=0,end=0;
		hm.put(0, 0);
		while(end<ar.length) {
			
			if(ar[end]==0)
				hm.put(ar[end], hm.getOrDefault(ar[end], 0)+1);
			System.err.println(hm);
			if(hm.get(0)<k) {
				end++;
			}
			else if(hm.get(0)==k) {
				System.out.println(end-start+1);
				end++;
			}
			else if(hm.get(0)>k) {
				while(hm.get(0)>k) {
					if(ar[start]==0)
						hm.put(0,hm.getOrDefault(0, 0)-1);
					start++;
				}
				if(hm.get(0)==k) {
					System.out.println(end-start+1);
					end++;
				}
			}
			
		}
		if(hm.get(0)<k)
			System.out.println(ar.length);
	}
	
}
