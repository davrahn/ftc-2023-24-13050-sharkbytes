# Nueva FTC
This repository contains the Nueva FTC code for the CENTERSTAGE season.

## Starting Up the Robot
* Connect a battery to the Control Hub
* Charge and turn on the Driver Hub
* Turn on the Driver Hub and open the Driver Station app
* Set the op mode and click the init button

## Shutting Down the Robot
* Toggle the Control Hub battery switch
* Disconnect the battery from the Control Hub

## Running an Op Mode on the Robot
* Connect a battery to the Control Hub
* Turn on the Driver Hub and open the Driver Station app
* Connect to the Control Hub WiFi
    * The WiFi name should fit the form of `FTC-XXXX`
* Select the op mode by clicking the right dropdown
* Click the init button to run the op mode

## Pushing Code to the Control Hub
* Open Android Studio and open the FTC repo
    * Download Android Studio from https://developer.android.com/studio/
* Wait for Android Studio to set up the project
* Connect the Control Hub using the Device Manager
    * If it isn't showing up, wait until the Control Hub's LED is green
    * If it still isn't showing up, run `~/Library/Android/sdk/platform-tools/adb connect 192.168.43.1:5555`
* Run the TeamCode configuration using the run button
