package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Gamepad;

// driving handler
public class DrivingHandler {
    // front motors
    DcMotor motorFrontLeft;
    DcMotor motorFrontRight;

    // back motors
    DcMotor motorBackLeft;
    DcMotor motorBackRight;

    // initialization
    public DrivingHandler(HardwareMap hardwareMap) {
        // set front motors
        motorFrontLeft  = hardwareMap.get(DcMotor.class, "motorFrontLeft");
        motorFrontRight = hardwareMap.get(DcMotor.class, "motorFrontRight");

        // set back motors
        motorBackLeft  = hardwareMap.get(DcMotor.class, "motorBackLeft");
        motorBackRight = hardwareMap.get(DcMotor.class, "motorBackRight");
    }

    // gameplay loop
    public void loop(Gamepad gamepad1) {
        float leftStickX  = gamepad1.left_stick_x;
        float leftStickY  = gamepad1.left_stick_y;
        float rightStickX = gamepad1.right_stick_x;

        // set motor powers
        motorFrontLeft.setPower(Math.min(leftStickX   - leftStickY + rightStickX, 1) * 0.5);
        motorFrontRight.setPower(Math.min(-leftStickX - leftStickY - rightStickX, 1) * 0.5);
        motorBackLeft.setPower(Math.min(-leftStickX   - leftStickY + rightStickX, 1) * 0.5);
        motorBackRight.setPower(Math.min(leftStickX   - leftStickY - rightStickX, 1) * 0.5);

        // dpad control
        if (gamepad1.dpad_up) {
            motorFrontLeft.setPower(0.25);
            motorFrontRight.setPower(0.25);
            motorBackLeft.setPower(0.25);
            motorBackRight.setPower(0.25);
        }
        if (gamepad1.dpad_down) {
            motorFrontLeft.setPower(-0.25);
            motorFrontRight.setPower(-0.25);
            motorBackLeft.setPower(-0.25);
            motorBackRight.setPower(-0.25);
        }
        if (gamepad1.dpad_left) {
            motorFrontLeft.setPower(-0.25);
            motorFrontRight.setPower(0.25);
            motorBackLeft.setPower(0.25);
            motorBackRight.setPower(-0.25);
        }
        if (gamepad1.dpad_right) {
            motorFrontLeft.setPower(0.25);
            motorFrontRight.setPower(-0.25);
            motorBackLeft.setPower(-0.25);
            motorBackRight.setPower(0.25);
        }
    }
}
