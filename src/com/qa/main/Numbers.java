package com.qa.main;


public class Numbers 
{
	public void createSumOfNumbers(String sumToInputNumbers, int sumToAddNumbers[])
	{
		int totalNumbersToAdd;

		for (int i = 0; i < sumToInputNumbers.length(); i++)
		{
		    sumToAddNumbers[i] = sumToInputNumbers.charAt(i) - '0';
		}
		
		totalNumbersToAdd = sumToAddNumbers[0] + sumToAddNumbers[1] + sumToAddNumbers[2];
		System.out.println(totalNumbersToAdd);
		
	}

}
