package com.practice.java;

public class InterestCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<9;i++)
		{
			System.out.println(String.format("%.2f", calcInterest(10000, i)));
		}


	}
	
	public static double calcInterest(double amount,double interest)
	{
		return (amount * (interest/100));
	}

}
