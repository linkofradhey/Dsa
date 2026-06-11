package com.example.dsaaaa;

public class basic {
	static int i = 1;
	static int sum = 0;

	public static void printRecursion(int i, int N) {// program to print 1to n using recursion

		System.out.println(i);
		i++;
		if (i <= N)
			printRecursion(i, N);

	}

	public static void printReverseRecursion(int N) {// program to print N to 1 using recursion

		System.out.println(N);
		N--;
		if (N >= 1)
			printReverseRecursion(N);

	}

	public static void SumRecursion(int N) {
		sum += N; // program to print N sum using recursion
		N--;
		if (N >= 1) {
			SumRecursion(N);

		}
		if (N == 1) {
			System.out.println(sum);

		}
	}

	public static int factorialRecursion(int N) {// factorial
		if(N==0 || N==1) return 1;
		return N *factorialRecursion(N-1); //4*3
	
	}
	public static int fiboRecursion(int N) { // fibo
		if(N==0 || N==1) return 1;
		return N + factorialRecursion(N-1); //4*3
	
	}

	public static void main(String[] args) {
//		printRecursion(i, 8);
//		printReverseRecursion(8);
//		SumRecursion(8);
//		int result =factorialRecursion(4);
//		System.out.print(result);
//		int result = fiboRecursion(4);
//		System.out.println(result);
	}

}
