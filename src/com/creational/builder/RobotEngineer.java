package com.creational.builder;

/**
 * @author Sumit
 *
 */
public class RobotEngineer {

	private RobotBuilder robotBuilder;
	
	public RobotEngineer(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}

	/**
	 * @return the robotBuilder
	 */
	public Robot getRobot() {
		return robotBuilder.getRobot();
	}
	
	public void makeRobot() {
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}
	
}
