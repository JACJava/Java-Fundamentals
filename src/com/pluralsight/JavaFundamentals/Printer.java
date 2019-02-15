package com.pluralsight.JavaFundamentals;

import javax.swing.*;

public class Printer<T extends ICartridge> implements IMachine{

    private String modelNumber;
    private PaperTray paperTray = new PaperTray(); // composition - printer HAS a paper tray
    private Machine machine;
    private T cartridge;

    //constructor
    public Printer(boolean isOn, String modelNumber, T cartridge){
        machine = new Machine(isOn);
        this.modelNumber = modelNumber;
        this.cartridge = cartridge;
    }

    @Override
    public void turnOn(){
        System.out.println("Warming up printer");
        machine.turnOn();
    }

    @Override
    public void turnOff() {
        machine.turnOff();

    }

    public <U extends ICartridge> void printUsingCartridge(U cartridge, String message){

        System.out.println(cartridge.toString());
        System.out.println(message);
        System.out.println(cartridge.toString());
    }

    public void print(int copies){

        System.out.println(cartridge.getFillPercentage());

        String onStatus = "";

        if (machine.isOn())
            onStatus = " is On!";
        else
            onStatus = " is Off!";

        String textToPrint = "Printer model:  " + modelNumber + onStatus;

//        for(int i = 0; i < copies; i++){
//                System.out.println(textToPrint);
//        }

        //System.out.println("paperTray.isEmpty():  " + paperTray.isEmpty());

        while( copies > 0 && !paperTray.isEmpty() ){
            System.out.println(textToPrint);
            copies--;
            paperTray.usePage();
        }

        if(paperTray.isEmpty()){
            System.out.println("No Paper in Printer, Load More Paper");
        }

    }

    public void printColors(){

        String[] colors = new String[] {"Red", "Blue", "Green", "Yellow", "Orange"};

        for(String currentColor : colors){  //used the word "in" for colon!

//            if(currentColor.equals("Green")){
//                continue;
//            }
            System.out.println("Current color is:  " + currentColor);
        }

    }

    private void print(String text){
        System.out.println("Text value:  " + text);
    }

    public String getModelNumber(){ //getter!
        return modelNumber;
    }

    public boolean getIsOn(){ //getter!
        return machine.isOn;
    }

    public void loadPaper(int count) {
        paperTray.addPaper(count);
    }

    public boolean isOn(){ //getter!
        return machine.isOn;
    }




}
