package com.zhou.sumaim;

public class Sumaim {

	public static boolean process(int[] arr, int i, int sum, int aim ) {
		if(i == arr.length) {
			return sum==aim;
		}
		return process(arr, i+1, sum, aim) || process(arr, i+1, sum+arr[i], aim);
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,5};
		int aim = 10;
		System.out.println(process(arr, 0, 0, aim));
	}
}
