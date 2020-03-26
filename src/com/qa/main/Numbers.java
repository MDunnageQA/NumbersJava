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
	
	public void numbersToText(String underTwentyNumbers[], String overTwentyNumbers[], int selectedNumber)
	{		
		if (selectedNumber < 20)
		{
			System.out.println(underTwentyNumbers[selectedNumber - 1]);
		}
		else
		{
			System.out.println(overTwentyNumbers[selectedNumber / 10 - 2] + " "
					+ underTwentyNumbers[selectedNumber % 10 - 1]);
		}
		
	}
	
}
