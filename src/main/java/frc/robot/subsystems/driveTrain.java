/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.Move;



public class driveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private VictorSP leftFront = new VictorSP(RobotMap.frontLeftDrive);
  private VictorSP leftBack = new VictorSP(RobotMap.backLeftDrive);
  private VictorSP rightFront = new VictorSP(RobotMap.frontRightDrive);
  private VictorSP rightBack = new VictorSP(RobotMap.backRightDrive);

  SpeedControllerGroup left = new SpeedControllerGroup(leftFront, leftBack);
  SpeedControllerGroup right = new SpeedControllerGroup(rightFront, rightBack);

  public void drive(double leftInput, double rightInput){

    left.set(leftInput);
    right.set(rightInput);

    //DifferentialDrive m_drive = new DifferentialDrive(left, right);

    //m_drive.curvatureDrive(leftInput, rightInput, false);
    //m_drive.arcadeDrive(leftInput, rightInput);
    //m_drive.tankDrive(leftInput, rightInput);
  }
  @Override
  public void initDefaultCommand() {
  
    setDefaultCommand(new Move());
  }
}
