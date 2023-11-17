package frc.robot

import edu.wpi.first.wpilibj.Joystick

object Controller {
    private val j1 = Joystick(0)

    var compress = true
        private set
    init {
        object: Thread() {
            override fun run() {
                while (true) {
                    if (j1.getRawButtonReleased(3)) {
                        compress = !compress
                    }
                    sleep(20)
                }
            }
        }.start()
    }

    var extends = false
        private set
    init {
        object: Thread() {
            override fun run() {
                while (true) {
                    if (j1.getRawButtonReleased(4)) {
                        extends = !extends
                    }
                    sleep(20)
                }
            }
        }.start()
    }
}