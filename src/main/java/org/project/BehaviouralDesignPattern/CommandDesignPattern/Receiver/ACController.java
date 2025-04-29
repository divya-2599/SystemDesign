package org.project.BehaviouralDesignPattern.CommandDesignPattern.Receiver;

import lombok.Setter;

public class ACController {

    private boolean isOn;

    @Setter
    private int temp;

    public void turnOnAc() {
        isOn = true;
    }

    public void turnOffAc() {
        isOn = false;
    }

}
