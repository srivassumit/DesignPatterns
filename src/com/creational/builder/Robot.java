
package com.creational.builder;

/**
 * @author Sumit
 *
 */
public class Robot implements RobotPlan {

	private String head, torso, arms, legs;

	@Override
	public void setRobotHead(String head) {
		this.head = head;
	}

	@Override
	public void setRobotTorso(String torso) {
		this.torso = torso;
	}

	@Override
	public void setRobotArms(String arms) {
		this.arms = arms;
	}

	@Override
	public void setRobotLegs(String legs) {
		this.legs = legs;
	}

	/**
	 * @return the head
	 */
	public String getHead() {
		return head;
	}

	/**
	 * @return the torso
	 */
	public String getTorso() {
		return torso;
	}

	/**
	 * @return the arms
	 */
	public String getArms() {
		return arms;
	}

	/**
	 * @return the legs
	 */
	public String getLegs() {
		return legs;
	}

	public String toString() {
		return "Robot with following Specifications: \nRobot Head: " + this.head + "\nRobot Torso: " + this.torso
				+ "\nRobot Arms: " + this.arms + "\nRobot Legs: " + this.legs;
	}

}
