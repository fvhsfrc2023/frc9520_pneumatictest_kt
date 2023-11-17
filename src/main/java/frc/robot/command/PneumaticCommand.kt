package frc.robot.command

import edu.wpi.first.wpilibj2.command.CommandBase
import frc.robot.Controller
import frc.robot.subsystem.PneumaticSystem

object PneumaticCommand: CommandBase() {
    init {
        addRequirements(PneumaticSystem)
    }


    override fun execute() {
        PneumaticSystem.compress(Controller.compress)
        PneumaticSystem.extends(Controller.extends)
    }
}