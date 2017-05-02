package com.behavioural.chainofresponsibility;

/**
 * @author Sumit
 *
 */
public class Numbers {

	private int num1, num2;
	private String calculationMethod;

	public Numbers(int num1, int num2, String calculationMethod) {
		this.num1 = num1;
		this.num2 = num2;
		this.calculationMethod = calculationMethod;
	}

	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}

	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}

	/**
	 * @return the calculationMethod
	 */
	public String getCalculationMethod() {
		return calculationMethod;
	}
}
