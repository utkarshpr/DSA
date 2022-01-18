package com.test;
//
public class Array {
	public static void main(String[] args) {
		int arr[] = {100, 140, 150, 200, 215, 400};
		int dep[] = {110, 300, 220, 230, 315, 600};
			int n=arr.length;
			int pla=1,res=1;
			for(int i=0;i<n;i++){
				pla=1;
				for(int j=i+1;j<n;j++){
					if((arr[i]>=arr[j] && arr[i]<=dep[j])||(arr[j]>arr[i]&&arr[j]<=dep[i]))
					{
						pla++;
					}
				}
				res=Math.max(res,pla);

			}
		System.out.println(res);

		}


	}
	


