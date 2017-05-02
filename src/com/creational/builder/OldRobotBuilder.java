package com.creational.builder;

/**
 * @author Sumit
 *
 */
public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;

	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Blowtorch");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Rollerskates");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
