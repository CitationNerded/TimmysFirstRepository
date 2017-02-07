package test;

import java.util.ArrayList;
import java.util.List;


public class MyFibClass {

	public static void main(String []args){

		List<Integer> fibList = new ArrayList<Integer>();
		fibList.add(1);
		fibList.add(1);
		fibList.add(2);

		for (int n =1; n<=1000; n++) {
			fibList.get(fibList.size()-2);
			int firstNumber =  fibList.get(fibList.size()-2);
			fibList.get(fibList.size()-1);
			int secondNumber = fibList.get(fibList.size()-1);
	
			int sumNumber = firstNumber+secondNumber;
			fibList.add(sumNumber);
			//System.out.println(firstNumber);
			//System.out.println(secondNumber);
			System.out.println(sumNumber);
			//  System.out.println("Element "+n+" at index 0: " + fibonacciArray[n]);
			//fibonacciArray.toArray(sumNumber);
		    }
	}
}
