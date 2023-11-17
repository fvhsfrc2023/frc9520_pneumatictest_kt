package frc.robot.subsystem

import edu.wpi.first.wpilibj.Compressor
import edu.wpi.first.wpilibj.PneumaticsModuleType
import edu.wpi.first.wpilibj.Solenoid
import edu.wpi.first.wpilibj2.command.SubsystemBase

object PneumaticSystem: SubsystemBase() {
    private val compressor = Compressor(PneumaticsModuleType.REVPH)
    val solenoid1 = Solenoid(PneumaticsModuleType.REVPH, 12)
    val solenoid2 = Solenoid(PneumaticsModuleType.REVPH, 15)

    fun compress(on: Boolean = true) = if (on) compressor.enableDigital() else compressor.disable()

    fun extends(on: Boolean) {
        solenoid1.set(on)
        solenoid2.set(!on)
    }
}