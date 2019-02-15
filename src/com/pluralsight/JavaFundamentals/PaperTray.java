package com.pluralsight.JavaFundamentals;

public class PaperTray {

    int pages = 0;

    public void addPaper(int count){
        pages += count;
    }

    public void usePage(){
        pages --;
    }

    public boolean isEmpty(){
//        System.out.println("pages:  "+pages);
//        System.out.print("pages > 0:  ");
//        System.out.println(pages > 0 );
        return pages <= 0;
    }

}