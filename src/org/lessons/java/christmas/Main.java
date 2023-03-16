package org.lessons.java.christmas;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


		//INIZIALIZZO ARRAY LIST
        ArrayList<String> wishList = new ArrayList<String>();

		//SCANNER
        Scanner s = new Scanner(System.in);

		//INIZIALIZZO LA SCELTA DELL'UTENTE IN QUESTA VARIABILE
        String scelta;

  	    //CICLO DO WHILE
        do {
            System.out.println("Digita 'yes' per aggiungere alla lista desideri.Digita 'no' per chiudere.");
            scelta = s.nextLine();

			   //CONDIZIONE IF
            if(scelta.equals("yes")) {
                System.out.println("Quale desideri vuoi aggiungere?");
                String desiderio= s.nextLine();
                wishList.add(desiderio);
            }
			   //Elementi in lista
            System.out.println("Ecco la tua Wish List :" + wishList.size() + wishList);
        }

        while (!scelta.equals("no"));

		//ORDINE ALFABETICO PER GLI ELEMENTI DELL ARRAY LIST
        Collections.sort(wishList);


        //CICLO FOR
        for(int i = 0; i < wishList.size(); i++) {
            System.out.println(wishList.get(i));
        }
    }

}