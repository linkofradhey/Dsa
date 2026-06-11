package com.example.dsaaaa;

public class basic {
	static int i=1;
	public static void printRecursion(int i ,int N) {//program to print 1to n using recursion
		
		System.out.println(i);
		i++;
		if(i<= N)
		printRecursion(i, N);
		
	}
public static void printReverseRecursion(int N) {//program to print N to 1 using recursion
		
		System.out.println(N);
		N--;
		if( N>=1)
		printReverseRecursion( N);
		
	}
	public static void main (String[] args) {
//		printRecursion(i, 8);
		printReverseRecursion(8);
	}

}
