// Copyright (c) 2021 StuyPulse Inc. All rights reserved.
// This work is licensed under the terms of the MIT license
// found in the root directory of this project.

package com.stuypulse.stuylib.input;

import com.stuypulse.stuylib.input.buttons.ButtonWrapper;
import com.stuypulse.stuylib.math.Vector2D;

/**
 * An class for using gamepads with different interfaces. You can implement this class in another
 * file, and then use it with a standard interface.
 *
 * <p>Any unimplemented buttons will never be triggered, so if a certain controller is missing one,
 * dont worry about it.
 *
 * <p>The button type that is used in OI.java is automatically generated by this class, as long as
 * you implement the getRaw...() function, the get...() function will work.
 *
 * <p>This class does not come with a constructor because by itself, the class does not do anything.
 * You need to extend this class in order to use it.
 *
 * @author Sam (sam.belliveau@gmail.com)
 */
public class Gamepad {

    /*******************************/
    /*** IMPLEMENTABLE FUNCTIONS ***/
    /*******************************/

    // Left Stick //
    public double getLeftX() {
        return 0.0;
    }

    public double getLeftY() {
        return 0.0;
    }

    // Right Stick //
    public double getRightX() {
        return 0.0;
    }

    public double getRightY() {
        return 0.0;
    }

    // D-Pad //
    public boolean getRawDPadUp() {
        return false;
    }

    public boolean getRawDPadDown() {
        return false;
    }

    public boolean getRawDPadLeft() {
        return false;
    }

    public boolean getRawDPadRight() {
        return false;
    }

    // Bumpers //
    public boolean getRawLeftBumper() {
        return false;
    }

    public boolean getRawRightBumper() {
        return false;
    }

    // Triggers //
    public double getLeftTrigger() {
        return 0.0;
    }

    public double getRightTrigger() {
        return 0.0;
    }

    // Face Buttons //
    public boolean getRawLeftButton() {
        return false;
    }

    public boolean getRawRightButton() {
        return false;
    }

    public boolean getRawTopButton() {
        return false;
    }

    public boolean getRawBottomButton() {
        return false;
    }

    // Start / Select / Option //
    public boolean getRawSelectButton() {
        return false;
    }

    public boolean getRawStartButton() {
        return false;
    }

    public boolean getRawOptionButton() {
        return false;
    }

    // Analog Stick Buttons //
    public boolean getRawLeftAnalogButton() {
        return false;
    }

    public boolean getRawRightAnalogButton() {
        return false;
    }

    // Rumble //
    public void setRumble(double intensity) {
        return;
    }

    /**************************************************/
    /*** BUTTONS BASED OFF OF IMPLEMENTED FUNCTIONS ***/
    /**************************************************/

    // Left Stick //
    public final Vector2D getLeftStick() {
        return new Vector2D(this.getLeftX(), this.getLeftY());
    }

    // Right Stick //
    public final Vector2D getRightStick() {
        return new Vector2D(this.getRightX(), this.getRightY());
    }

    // D-Pad //
    public final double getDPadX() {
        return (getRawDPadRight() ? 1.0 : 0.0) - (getRawDPadLeft() ? 1.0 : 0.0);
    }

    public final double getDPadY() {
        return (getRawDPadUp() ? 1.0 : 0.0) - (getRawDPadDown() ? 1.0 : 0.0);
    }

    public final Vector2D getDPad() {
        return new Vector2D(this.getDPadX(), this.getDPadY());
    }

    public final ButtonWrapper getDPadUp() {
        return new ButtonWrapper(this::getRawDPadUp);
    }

    public final ButtonWrapper getDPadDown() {
        return new ButtonWrapper(this::getRawDPadDown);
    }

    public final ButtonWrapper getDPadLeft() {
        return new ButtonWrapper(this::getRawDPadLeft);
    }

    public final ButtonWrapper getDPadRight() {
        return new ButtonWrapper(this::getRawDPadRight);
    }

    // Bumpers //
    public final ButtonWrapper getLeftBumper() {
        return new ButtonWrapper(this::getRawLeftBumper);
    }

    public final ButtonWrapper getRightBumper() {
        return new ButtonWrapper(this::getRawRightBumper);
    }

    // Triggers //
    protected static final double TRIGGER_AXIS_THRESHOLD = 3.0 / 16.0;

    public final boolean getLeftTriggerPressed() {
        return getLeftTrigger() > TRIGGER_AXIS_THRESHOLD;
    }

    public final ButtonWrapper getLeftTriggerButton() {
        return new ButtonWrapper(this::getLeftTriggerPressed);
    }

    public final boolean getRightTriggerPressed() {
        return getRightTrigger() > TRIGGER_AXIS_THRESHOLD;
    }

    public final ButtonWrapper getRightTriggerButton() {
        return new ButtonWrapper(this::getRightTriggerPressed);
    }

    // Face Buttons //
    public final ButtonWrapper getLeftButton() {
        return new ButtonWrapper(this::getRawLeftButton);
    }

    public final ButtonWrapper getRightButton() {
        return new ButtonWrapper(this::getRawRightButton);
    }

    public final ButtonWrapper getTopButton() {
        return new ButtonWrapper(this::getRawTopButton);
    }

    public final ButtonWrapper getBottomButton() {
        return new ButtonWrapper(this::getRawBottomButton);
    }

    // Select / Start / Option //
    public final ButtonWrapper getSelectButton() {
        return new ButtonWrapper(this::getRawSelectButton);
    }

    public final ButtonWrapper getStartButton() {
        return new ButtonWrapper(this::getRawStartButton);
    }

    public final ButtonWrapper getOptionButton() {
        return new ButtonWrapper(this::getRawOptionButton);
    }

    // Analog Stick Buttons //
    public final ButtonWrapper getLeftAnalogButton() {
        return new ButtonWrapper(this::getRawLeftAnalogButton);
    }

    public final ButtonWrapper getRightAnalogButton() {
        return new ButtonWrapper(this::getRawRightAnalogButton);
    }
}
