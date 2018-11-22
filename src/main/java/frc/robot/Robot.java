/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
//import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.subsystems.teleGroup;
//import frc.robot.subsystems.Intake;
//import frc.robot.commands.GrabCube;

public class Robot extends TimedRobot {

  CommandGroup teleop = new teleGroup();
  
  
  @Override
  public void robotInit() {   
  }
  @Override
  public void robotPeriodic() {
  }
  @Override
  public void disabledInit() {
  }
  @Override
  public void disabledPeriodic() {
  }  
  @Override
  public void autonomousInit() {  
  }
  @Override
  public void autonomousPeriodic() {
  }
  @Override
  public void teleopInit() {
    Scheduler.getInstance().run();
    teleop.start();   
  }
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();    
  }
  @Override
  public void testPeriodic() {
  }
}
