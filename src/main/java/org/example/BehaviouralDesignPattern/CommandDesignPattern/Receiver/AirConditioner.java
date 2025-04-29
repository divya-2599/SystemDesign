package org.example.BehaviouralDesignPattern.CommandDesignPattern.Receiver;

public class AirConditioner {

    boolean isOn;
    int temp;

    public void turnOnAC() {
        isOn = true;
        System.out.println("AC turned on");
    }

    public void turnOffAC() {
        isOn = false;
        System.out.println("AC turned off");
    }

    public void setTemperature(int temp) {
        this.temp=temp;
        System.out.println("Temperature changed to: " + temp);
    }
}
