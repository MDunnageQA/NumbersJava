package com.qa.main;

public class Runner 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Numbers user = new Numbers();
		String sumNumbersToInput = "336";
		int[] sumToAddNumbers = new int[sumNumbersToInput.length()];
		String[] underTwentyNumbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", 
				"Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fiteen", 
				"Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] overTwentyNumbers = {"Twenty", "Thrity", "Fourty", "Fifty", "Sixty", "Seventy",
				"Eighty", "Ninety"};
		
		user.createSumOfNumbers(sumNumbersToInput, sumToAddNumbers);
		user.numbersToText(underTwentyNumbers, overTwentyNumbers, 99);

	}

}
