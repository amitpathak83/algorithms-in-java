package com.algo.math;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(new Factorial().factorialIteration(5));
		System.out.println(new Factorial().factorialRecursion(6));

	}
	
	public int factorialIteration(int input){
		int factorial = 1;
		for(int i = 1;i<=input;i++) {
			factorial = factorial * i;
		}
		return factorial;
		
	}
	
	public int factorialRecursion(int input){
		
		if (input ==0 || input ==1) {
			return input;
		}else {
			return input * factorialRecursion(input-1);
		}
		
	}

}
