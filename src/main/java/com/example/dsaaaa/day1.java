package com.example.dsaaaa;

public class day1 {
	 int intre =0;
	
//	Write a program to convert a decimal integer to its corresponding octal representation. For eg., 8 in decimal is represented as 10 in octal, 
//	and 10 in decimal
//	represented as 12 in Octal etc. Similarly write a program to convert an octal integer to decimal integer.
	public String DecimalToOctal(int value, String result,int num) {
		int temp = num;
		if (value>1) {
			value = value /8;// 1
//			System.out.println(value);
			num = num % 8;// 0
//			System.out.println(num);
			result=result+num;
			
//			System.out.println(result);
			DecimalToOctal(value, result, num);
		}
		return value+""+result;
		
	}
	
	public  int octalToDecimal(int num, int position, int result) {
		if (num == 0) {
	        return result;
	    }

	    int digit = num % 10;

	    int value = digit * (int) Math.pow(8, position);

	    result += value;

	    return octalToDecimal(num / 10, position + 1, result);
	}
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
//		da.fiboWithRecursion(0, 1, 0, 10);// (Note: If your sequence starts with 1, 1, 2, 3... the 10th element would be
//											// 89).
//		da.fiboWithOutRecursion(10);
//		System.out.println(da.DecimalToOctal(12, "", 12));
		System.out.println(da.octalToDecimal(10, 0, 0));
	}

}
