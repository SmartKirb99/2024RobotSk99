// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.OIConstants;
import frc.robot.commands.Arm.ArmDown;
import frc.robot.commands.Arm.ArmUp;
import frc.robot.subsystems.Arm;


public class RobotContainer {
  //Controllers
  private final PS5Controller m_driver = new PS5Controller(OIConstants.kDriverController);
  private final Joystick m_operator = new Joystick(OIConstants.kOperatorController);

  //Subsystems
  //private final Swerve m_swerve = new Swerve();
  private final Arm m_arm = new Arm();
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    // Driver Buttons


    //Operator Buttons
    new JoystickButton(m_operator, 1).whileTrue(new ArmUp(m_arm));
    new JoystickButton(m_operator, 6).whileTrue(new ArmDown(m_arm));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
