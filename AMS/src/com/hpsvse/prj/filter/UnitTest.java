package com.hpsvse.prj.filter;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class UnitTest {
	int a;
	int b;
	static int c;// 用户答案
	int answer;// 答案
	static Scanner in = new Scanner(System.in);

	public int Expression() {
		a = new Random().nextInt() % 10;
		b = new Random().nextInt() % 10;
		System.out.print("" + a + "+" + b + "=");
		return answer = a + b;

	}

	public static void main(String[] args) {
		int answer;
		UnitTest expression = new UnitTest();
		answer = expression.Expression();
		try {
			UnitTest.c = in.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("\nError  ,please Enter a Int number");
		}
		if (answer == c) {
			System.out.print("答对了");
		} else
			System.out.print("答错了");
		// System.out.print("answer="+answer);
	}
}