package com.pluralsight.JavaFundamentals;

public class Printer extends Machine{

    private String modelNumber;
    private PaperTray paperTray = new PaperTray(); // composition - printer HAS a paper tray

    //constructor
    public Printer(boolean isOn, String modelNumber){
        super(isOn); //call my parent (like this.)
        this.modelNumber = modelNumber;
    }

    public void print(int copies){

        String onStatus = "";

        if (isOn)
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
        return isOn;
    }


    public void loadPaper(int count) {
        paperTray.addPaper(count);
    }
}
