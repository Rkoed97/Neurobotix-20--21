package ro.cnmv.neuro.teamcode.Testing;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="Servo Set 0",  group="Autonomous")
public class Servo0 extends LinearOpMode {
    @Override
    public void runOpMode() {
        Servo servo = hardwareMap.get(Servo.class, "servo");

        waitForStart();

        servo.setPosition(0);
        sleep(1000);
    }
}
