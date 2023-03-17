package org.lessons.java.christmas;

import java.util.ArrayList;

public class ChristmasLetter {
    private String name;
    private String address;
    private ArrayList<String> wishList;

    //COSTRUTTORE


    public ChristmasLetter(String name, String address, ArrayList<String> wishList) {
        this.name = name;
        this.address = address;
        this.wishList = wishList;
    }


    //METODI

    public void send() throws GreedyException{
        if (wishList.size() > 5){
            throw new GreedyException("Wishes list too long");
        }
        if (Math.random()<0.5){
            throw new NaughtyException("Cattivo");
        }
        System.out.println("Lettera mandata a " + name + address);
    }


}
