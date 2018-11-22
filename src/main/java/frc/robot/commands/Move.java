//*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.driveTrain;

public class Move extends Command {

  public static OI oi = new OI();
  public static driveTrain drivetrain = new driveTrain();

  public Move() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double leftX = oi.driverXbox.getRawAxis(0); //left X-axis
    double leftY = oi.driverXbox.getRawAxis(1); //left Y-axis
    double rightX = oi.driverXbox.getRawAxis(4); //right X-axis
    double rightY = -oi.driverXbox.getRawAxis(5); //right Y-axis
    
    leftX = leftX*leftX*Math.signum(leftX);
    leftY = leftY*leftY*Math.signum(leftY);
    rightX = rightX*rightX*Math.signum(rightX);
    rightY = rightY*rightY*Math.signum(rightY); 

    double left;
    double right;

    ////////////////////////////////////////////////////////////
    // only leave one of the following blocks uncommented,    //
    // the "prebuilt" ones need lines commmented/uncommented  //
    // in the driveTrain subsystem file as well               //
    ////////////////////////////////////////////////////////////


    //custom tank:
    left = leftY;
    right = rightY;

    // //custom arcade:
    // left = leftY -  rightX;
    // right = -leftY - rightX;

    // //prebuilt cheesy
    // left = leftY;
    // right = rightX;

    // //prebuilt tank
    // left = leftY;
    // right = rightY;

    // //prebuilt arcade
    // left = leftY;
    // right = rightX;


    drivetrain.drive(left,right);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
