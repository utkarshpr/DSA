package com.slidingWindow;

import java.util.HashMap;

public class QWER_n_divide_4 {
	public static void main(String[] args) {
		String s="QWEWERWQWEWEQWEREWQWEREWEREWQWEREWEREWEWEWEWEREWEREWQWQR";
		int[] count = new int[128];
        int n = s.length(), res = n, i = 0, k = n / 4;
        for (int j = 0; j < n; ++j) {
            ++count[s.charAt(j)];
        }
        
        for(int iw=0;iw<count.length;iw++) {
        	if(count[iw]!=0)
        	System.out.print(count[iw]+" ");
        }
        System.out.println("count");
        for (int j = 0; j < n; ++j) {
            --count[s.charAt(j)];
            for(int iw=0;iw<count.length;iw++) {
            	if(count[iw]!=0)
            	System.out.print(count[iw]+" ");
            }
            System.out.println();
            while (i < n && count['Q'] <= k && count['W'] <= k && count['E'] <= k && count['R'] <= k) {
                res = Math.min(res, j - i + 1);
                ++count[s.charAt(i++)];
                for(int iw=0;iw<count.length;iw++) {
                	if(count[iw]!=0)
                	System.out.print(count[iw]+" ");
                }
                System.out.println();
            }
        }
	}
}
