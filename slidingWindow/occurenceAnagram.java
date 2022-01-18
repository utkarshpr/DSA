package com.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class occurenceAnagram {
	
	    public static List<Integer> findAnagrams(String s, String p) {
	        
	       ArrayList<Integer> ar=new ArrayList<>();
	        int start=0,end=0,k=p.length();
	       HashMap<Character,Integer> hm=new HashMap<>();
	       for(int i=0;i<p.length();i++)
	    	   hm.put(p.charAt(i), hm.getOrDefault(p.charAt(i), 0)+1);
	       int count=hm.size();
	        while(end<s.length()){
	        	
	        	char ch=s.charAt(end++);
	        	if(hm.containsKey(ch)) {
	        		hm.put(ch, hm.getOrDefault(ch, 0)-1);
	        		if(hm.get(ch)==0) {
		        		count--;
		        	}
	        	}
	        	//System.out.println(hm +"::"+count);
	        	if( end-start==k) {
	        		if(count==0)
	        		{
	        			//System.out.println(start);
	        			ar.add(start);
	        		}
	        		
	        		if(hm.containsKey(s.charAt(start))) {
	        			hm.put(s.charAt(start), hm.getOrDefault(s.charAt(start), 0)+1);
	        			
	        		}
	        		if(hm.containsKey(s.charAt(start))&& hm.get(s.charAt(start))==1) {
	        			count++;
	        		}
	        		//System.out.println("new "+hm);
	        		start++;
	        	
	        	}
	        }
	       
	        return ar;
	    }
	    public static void main(String args[]) {
	    	System.out.println(findAnagrams("cbaebabacd","abc"));
	    }
}
