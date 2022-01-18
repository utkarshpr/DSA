package com.slidingWindow;

public class Absolute_diff_K {
	public static void main(String[] args) {
		String s1="abcd";
		String s2="bcdef";
		int max=3;
		int st=0,end=0,sum=0;
		int len=(s1.length()>s2.length())?s1.length():s2.length();
		int ascii[]=new int[len];
		for(int i=0;i<len;i++) {
			if(i<s1.length() && i<s2.length()) {
				int k=s1.charAt(i)-s2.charAt(i);
				ascii[i]=Math.abs(k);
			}
			else if(i<s1.length())
			{
				ascii[i]=s1.charAt(i);	
			}
			else {
				ascii[i]=s2.charAt(i);
			}
			//System.out.println(ascii[i]);
		}
		while(end<len) {
			sum+=ascii[end];
			if(sum<=max) {
				System.out.println(st+" "+end);
				end++;
			}
			else {
				while(st<end && sum>max) {
					sum-=ascii[st];
					st++;
					
				}
				if(sum<=max) {
					System.out.println(st+" "+end);
					end++;
				}	
				else {
					end++;
				}
			}
			
		}
	}
}
