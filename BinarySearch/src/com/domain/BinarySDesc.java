package com.domain;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySDesc {
	public static int binaryDesc(int key, int[] arr) {
		int l = 0, r = arr.length - 1, mid;

		while (l <= r) {
			mid = (l + r) / 2;
			if (arr[mid] == key) {// 30==20
				return mid;
			} else if (arr[mid] < key) {// 30<20
				l = mid + 1;
			} else if (arr[mid] > key) {// 30>20
				r = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
//		int[] arr= {90,82,77,69,62,61,60,55,43,32,21,11};
		int[] arr = { 10, 20, 30, 34, 55, 60 };
		int idx;
		Scanner sc = new Scanner(System.in);
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("Enter Num");

		int key = sc.nextInt();

		System.out.println((idx = binaryDesc(key, arr)) == -1 ? "Key not Found" : "Key found at index: " + idx);
		System.out.println(idx);

	}

}
