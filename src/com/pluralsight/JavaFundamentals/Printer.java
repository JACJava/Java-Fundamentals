package com.pluralsight.JavaFundamentals;

public class Printer {

    private boolean isOn;
    private String modelNumber;

    //constructor
    public Printer(boolean isOn, String modelNumber){
        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }


    public void print(int copies){

        String onStatus = "";

        if (isOn)
            onStatus = " is On!";
        else
            onStatus = " is Off!";

        String textToPrint = "Printer model:  " + modelNumber + onStatus;

        for(int i = 0; i < copies; i++){
                System.out.println(textToPrint);
        }
    }

    private void print(String text){
        System.out.println("Text value:  " + text);
    }

    public String getModelNumber(){ //getter!
        return modelNumber;
    }
    public boolean getIsOn(){ //getter!
        return isOn;
    }






}
