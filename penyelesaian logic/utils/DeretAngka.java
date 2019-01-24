package com.xsis.training.batch184.utils;

import java.util.Arrays;

public class DeretAngka {
	
	//1,1,2,3,5...
	public static int[] getFibonachi(int n) {
		int[] data = new int[n];
		//logic fibo
		data[0] = 1;
		data[1] = 1;
		for(int i = 2; i < n; i++) {
			data[i] = data[i - 1] + data[i - 2];
		}
		
		return data;
	}
	
	//1,3,5...
	public static int[] getOdd(int n) {
		int[] data = new int[n];
		int val = 1;
		for(int i = 0; i < n; i++) {
			//System.out.println(val);
			data[i] = val;
			val = val + 2;
		}
		
		return data;
	}
	
	//1,3,6..
	public static int getLastTriAngluar(int n) {
		int result  = 0;
		for(int i = 1; i <= n; i++) {
			result = result  + i;
		}
		return result;
	}
	
	//0,1,3,6...
	public static int[] getTriAngluar(int n) {
		int[] data = new int[n];
		
		int result  = 0;
		for(int i = 0; i < n; i++) {
			result = result  + i;
			data[i] = result;
		}
		
		return data;
	}
	
	public static int[] getPangkat(int n) {
		int[] data = new int[n];
		
		for(int i = 0; i < n; i++) {
			data[i] = i*i;
		}
		
		return data;
	}
	
	//0,1,2,
	public static int[] getIncrement(int n) {
		int[] data = new int[n];
		
		for(int i = 1; i <= n; i++) {
			data[i-1] = i;
		}
		
		return data;
	}
	
	public static void main(String[] args) {
		int[] rs = DeretAngka.getFibonachi(5);
		int[] rs2 = DeretAngka.getOdd(9);
		System.out.println(Arrays.toString(rs));
		System.out.println(Arrays.toString(rs2));
		System.out.println(Arrays.toString(DeretAngka.getTriAngluar(4)));
	}

}
