package com.slidingWindow;

import java.util.LinkedList;
import java.util.Queue;

public class firstNegative {
   public static void main(String[] args) {
       int ar[]={12,-1,-7,8,-15,30,16,28};//1,2,4
       int k=3;
       int start=0,end=0;
       int c=0;
       Queue< Integer> ind=new LinkedList<Integer>();
       while(end++<ar.length){
         
         if(end<ar.length && ar[end]<0)
        	 ind.add(end);
         if(end<ar.length && end-start+1==k) {
        	 	if(!ind.isEmpty()&&  start<=ind.peek() && end>=ind.peek()) {
        	 		System.out.println(ar[ind.peek()]);
        	 	}
        	 	else {
        	 		System.out.println(0);
        	 	}
        	 	if(!ind.isEmpty() && start>=ind.peek())
        	 		ind.poll();
        	 	start++;
        	 	
         }
         }
    }
}