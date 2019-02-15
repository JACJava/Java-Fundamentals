package com.pluralsight.JavaFundamentals;

public class Machine {

    protected boolean isOn; //protected allows subclass to access variable

    //constructor
    public Machine(boolean isOn){
        this.isOn = isOn;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }


}
