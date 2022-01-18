package com.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubKUniqueChar {
	public static void main(String[] args) {
		String s="abcabc";
	    int start=0,end=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('a',0);
        hm.put('b',0);
        hm.put('c',0);
        ArrayList<String> res=new ArrayList<>();
        while(end<s.length()){
            hm.put(s.charAt(end),hm.get(s.charAt(end))+1);
          
            if(hm.get('a')<1 || hm.get('b')<1 || hm.get('c')<1 ){
               end++;
                
            }
            else if(hm.get('a')==1 && hm.get('b')==1 && hm.get('c')==1) {
            	
            	res.add(s.substring(start, end+1));
            	end++;
            }
            else if(hm.get('a')>=1 && hm.get('b')>=1 && hm.get('c')>=1 ) {
            	int st=0;
            	String temp=s.substring(st, end+1);
            	while(temp.contains("a") &&  temp.contains("b")&&temp.contains("c")) {
            		
            		//System.out.println(temp+" :: "+hm);
            		res.add(temp);
            		temp=temp.substring(1);
            		//System.out.println("temp"+temp);
            		}
            	end++;
            	
            }
            
        }
        System.out.println(res);
	}
}
