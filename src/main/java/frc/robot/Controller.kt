package frc.robot

import edu.wpi.first.wpilibj.Joystick

object Controller {
    private val j1 = Joystick(0)

    var compress = true
        private set
    init {
        object: Thread() {
            override fun run() {
                while (true) {  //if compress is true and sees if the button pressed its equal to 3 and sets compress to false
                    if (j1.getRawButtonReleased(3)) {
                        compress = !compress
                    }
                    sleep(20) //this waits 20 seconds in real time before starting
                }
            }
        }.start()
    }

    var extends = false
        private set
    init {
        object: Thread() {
            override fun run() {
                while (true) { //if extends is false when the button is released its equal to 4 and sets extends to true
                    if (j1.getRawButtonReleased(4)) {
                        extends = !extends
                    }
                    sleep(20) //this waits 20 seconds in real time before starting
                }
            }
        }.start()
    }
}
