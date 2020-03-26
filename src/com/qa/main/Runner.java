package com.qa.main;

public class Runner 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Numbers user = new Numbers();
		String sumNumbersToInput = "336";
		int[] sumToAddNumbers = new int[sumNumbersToInput.length()];
		
		user.createSumOfNumbers(sumNumbersToInput, sumToAddNumbers);

	}

}
