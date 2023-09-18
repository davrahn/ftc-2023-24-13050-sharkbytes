package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

// main op mode
@TeleOp
public class Main extends OpMode {
    // handlers
    DrivingHandler    drivingHandler;
    GrabServoHandler  grabServoHandler;
    SlideMotorHandler slideMotorHandler;

    // initialization
    public void init() {
        // setup handlers
        drivingHandler    = new DrivingHandler(hardwareMap);
        grabServoHandler  = new GrabServoHandler(hardwareMap);
        slideMotorHandler = new SlideMotorHandler(hardwareMap);

        telemetry.addData("status", "initialized");
        telemetry.update();
    }

    // gameplay loop
    public void loop() {
        // run handlers
        drivingHandler.loop(gamepad1);
        grabServoHandler.loop(gamepad1);
        slideMotorHandler.loop(gamepad1);

        telemetry.addData("status", "running");
        telemetry.update();
    }
}
