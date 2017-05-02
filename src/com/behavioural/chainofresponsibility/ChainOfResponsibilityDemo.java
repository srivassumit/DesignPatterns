package com.behavioural.chainofresponsibility;

/**
 * @author Sumit
 *
 */
public class ChainOfResponsibilityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Chain of Responsibility Demo");
		Chain calcChain1 = new AddNumbers();
		Chain calcChain2 = new SubtractNumbers();
		Chain calcChain3 = new MultiplyNumbers();
		Chain calcChain4 = new DivideNumbers();
		calcChain1.setNextChain(calcChain2);
		calcChain2.setNextChain(calcChain3);
		calcChain3.setNextChain(calcChain4);

		Numbers addRequest = new Numbers(14, 5, "add");
		calcChain1.calculate(addRequest);
		Numbers subRequest = new Numbers(41, 5, "sub");
		calcChain1.calculate(subRequest);
		Numbers mulRequest = new Numbers(4, 45, "mul");
		calcChain1.calculate(mulRequest);
		Numbers divRequest = new Numbers(44, 5, "div");
		calcChain1.calculate(divRequest);
		Numbers powRequest = new Numbers(4, 2, "pow");
		calcChain1.calculate(powRequest);
	}

}
