package com.practice.lambdaExample;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Functional func = ()->
				{System.out.println("helllo world");
		};*/
		
		//func.apply();
		
		// In case of parameters
		Functional func = t ->
						{System.out.println(t);
			};
		
		func.apply("Hello world");
	}

}
