/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

//import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ShootCube;


/**
 * Add your docs here.
 */
public class UpperIntake extends Subsystem {
  private TalonSRX UpperIntakeL = new TalonSRX(RobotMap.UpperIntakeL);
  private TalonSRX UpperIntakeR = new TalonSRX(RobotMap.UpperIntakeR);
 
  //public SpeedController IntakeCube = new SpeedController(UpperIntakeL, UpperIntakeR);

  public void Shoot(){
    UpperIntakeL.set(ControlMode.PercentOutput , 0.5);
    UpperIntakeR.set(ControlMode.PercentOutput , 0.5);
      
  }
  public void StopShoot(){
    UpperIntakeL.set(ControlMode.PercentOutput , 0);
    UpperIntakeR.set(ControlMode.PercentOutput , 0);
 }


  @Override
  public void initDefaultCommand() {
    
    setDefaultCommand(new ShootCube());
  }
}
