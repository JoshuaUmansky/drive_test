/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.GrabCube;


/**
 * Add your docs here.
 */
public class Intake extends Subsystem {
  private VictorSP LowerIntakeL = new VictorSP(RobotMap.lowerIntakeL);
  private VictorSP LowerIntakeR = new VictorSP(RobotMap.lowerIntakeR);
 
  //public SpeedControllerGroup IntakeCube = new SpeedControllerGroup(LowerIntakeL, LowerIntakeR);

  public void Grab(){
     LowerIntakeL.set(0.5);  
     LowerIntakeR.set(0.5);   
  }
  public void GrabStop(){
    LowerIntakeL.set(0);  
    LowerIntakeR.set(0);   
 }


  @Override
  public void initDefaultCommand() {
    
    setDefaultCommand(new GrabCube());
  }
}
