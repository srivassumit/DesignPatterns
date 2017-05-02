package com.creational.builder;

/**
 * @author Sumit
 *
 */
public class BuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		robotEngineer.makeRobot();
		Robot firstRobot = robotEngineer.getRobot();
		System.out.println(firstRobot);
	}

}
