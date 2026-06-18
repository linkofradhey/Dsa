package com.example.dsaaaa;

import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.List;

public class basic {
	static int i = 1;
	static int sum = 0;
	static String str = "";

	static int n = 0;

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
		if (N == 0 || N == 1)
			return 1;
		return N * factorialRecursion(N - 1); // 4*3

	}

	public static int fiboRecursion(int N) { // fibo
		if (N == 0 || N == 1)
			return 1;
		return N + factorialRecursion(N - 1); // 4*3

	}

	public static String ReverseStrRecursion(String a) {// reverse a string using the Recurrsion
		if (a == null || a.length() == 0) {
			return str;
		}
		str = str + a.charAt(a.length() - 1);

		ReverseStrRecursion(a.substring(0, a.length() - 1));
		return str;
	}

	public static boolean checkPanlindrome(String a, int Start, int end) {
		if (Start >= end) {
			return true;// panlindrome using recursion
		}

		if (a.charAt(Start) != a.charAt(end)) {
			return false;
		}
		return checkPanlindrome(a, Start + 1, end - 1);
	}

	public static int twoPowerN(int num, int i, int n) {
		if (i != num) {
			n = n * 2;
			i++;
			return twoPowerN(num, i, n);
		}

		return n;
	}

	public static int XPowerN(int num, int x, int i, int n) {
		if (i != num) {
			n = n * x;
			i++;
			return XPowerN(num, x, i, n);
		}

		return n;
	}

	public static int countDigit(int num, int i) {

		if (num < 10) {
			return i + 1;
		}
		i++;
		num = num / 10;
		return countDigit(num, i);
	}

	public static int sumDigit(int num, int i) {

		if (num < 10) {
			return i + 1;
		}
		i++;
		num = num / 10;
		return countDigit(num, i);
	}
	public static void hanoi (int n , char source , char desanation , char helper) {
		if (n==1) {
			System.out.println("Move disk 1 from " +source +"to "+desanation);
			return;
		}
		
		hanoi(n-1, source, desanation, helper);
		System.out.println("move disk "+n + "from "+source+ "to "+desanation);
		
		hanoi(n-1, desanation, helper, source);
		System.out.println("move disk "+n + "from "+source+ "to "+desanation);
	}
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, nums, current, result);
        return result;
    }

    private static void backtrack(int index, int[] nums,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // Every path we reach is a valid subset -> add a copy
        result.add(new ArrayList<>(current));

        // Try including each remaining element one by one
        for (int i = index; i < nums.length; i++) {
            // Choose nums[i]
            current.add(nums[i]);

            // Explore further with next index
            backtrack(i + 1, nums, current, result);

            // Backtrack: remove last chosen element
            current.remove(current.size() - 1);
        }
    }
	public static void main(String[] args) {
//		printRecursion(i, 8);
//		printReverseRecursion(8);
//		SumRecursion(8);
//		int result =factorialRecursion(4);
//		System.out.print(result);
//		int result = fiboRecursion(4);
//		System.out.println(result);
//		System.out.print(ReverseStrRecursion("Hello"));
//		String ss = "madam";
//		System.out.println(checkPanlindrome(ss, 0, ss.length()-1));
//		System.out.println(twoPowerN(8,0,1));
//		System.out.println(XPowerN(8,5,0,1));
//		System.out.print(countDigit(5555, 0));
//		int n =4;
//		hanoi(n, 'c', 'a', 'B');
//        int[] nums = {1, 2, 3};
//        basic b = new basic();
//        List<List<Integer>> ans = b.subsets(nums);
//        System.out.println(ans);
		

	}

}
