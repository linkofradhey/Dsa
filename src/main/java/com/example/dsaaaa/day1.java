package com.example.dsaaaa;

public class day1 {
//	write two programs to find the nth Fibonacci number of the sequence 0, 1, 1, 2, 3, 5, 8, ....
//	n may be any integer input to be passed, say 10 or 15. Fibonacci number can be generated in 
//	two different ways - once using Recursion and another without recursion.

	public void fiboWithRecursion(int prev, int current, int itr, int nth) {

		int temp = prev;// 0
		prev = current;// 1
		current = temp + current;// 0+1
		itr++;
		if (itr == nth) {
			System.out.println(current);
			;
		}
		if (itr < nth) {
			fiboWithRecursion(prev, current, itr, nth);

		}

	}

	public void fiboWithOutRecursion(int nth) {
		int prev = 0;
		int current = 1;

		for (int i = 0; i < nth; i++) {
			int temp = prev;// 0
			prev = current;// 1
			current = temp + current;// 0+1
		}
		System.out.println(current);

	}

	public static void main(String[] args) {
		day1 da = new day1();
		da.fiboWithRecursion(0, 1, 0, 10);// (Note: If your sequence starts with 1, 1, 2, 3... the 10th element would be
											// 89).
		da.fiboWithOutRecursion(10);
	}

}
