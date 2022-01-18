package com.slidingWindow;

import java.util.HashMap;

public class K_changeInCharacter {
	public static void main(String[] args) {
		String s="AAAA";
		int k=1;
		int start=0,end=0;
        String res="";
        HashMap<Character,Integer> hm=new HashMap<>();
        char ch;
        int c=0;
        while(end<s.length()){
        	 ch=s.charAt(end);
            
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
            c=Math.max(c, hm.get(ch));
            
            if(end-start-c+1==k){
                System.out.println(s.substring(start, end+1));
                end++;
            }
            else if( end-start-c+1<k)
            {
                end++;
            }
            else if(end-start-c+1>k){
                while(end-start-c+1>k) {
                	hm.put(s.charAt(start), hm.getOrDefault(s.charAt(start), 0)-1);
                	start++;
                }
                if(end-start-c+1==k){
                    System.out.println(s.substring(start, end+1));
                    end++;
                }
            }
        }
	}
}
