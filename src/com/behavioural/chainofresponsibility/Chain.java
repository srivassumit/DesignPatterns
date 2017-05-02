package com.behavioural.chainofresponsibility;

/**
 * @author Sumit
 *
 */
interface Chain {

	public void setNextChain(Chain nextChain);
	
	public void calculate(Numbers request);
}
