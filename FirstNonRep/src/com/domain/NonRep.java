package com.domain;

public class NonRep {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int l=0,r=1;
		while(r<arr.length&& l<arr.length) {
			if(arr[l]==arr[r]) 
				{
				if(l==r) {
					r++;

				}else {
				l++;
				r=0;}
				}
			else {
				r++;
			}
		}
		 l<arr.length?arr[l]:0;
	}

}
