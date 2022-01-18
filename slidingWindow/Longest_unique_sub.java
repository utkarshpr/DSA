package com.slidingWindow;

import java.util.HashMap;

public class  Longest_unique_sub {
	public static void main(String[] args) {
		int k=3;
		String s="aabacbebebe";
		int start=0,end=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		while(end<s.length()) {
			hm.put(s.charAt(end),hm.getOrDefault(s.charAt(end),0)+1);
			if(hm.size()<k) {
				end++;
			}
			else if(hm.size()==k) {
				System.out.println(s.substring(start, end+1));
				end++;
			}
			else if(hm.size()>k){
				while(hm.size()>k) {
					hm.put(s.charAt(start),hm.getOrDefault(s.charAt(start),0)-1);
					if(hm.get(s.charAt(start))==0) {
						hm.remove(s.charAt(start));
					}
					start++;
				}
				 if(hm.size()==k) {
					 System.out.println(s.substring(start, end+1));
					end++;
				}
			}
		}
		
	}
}
