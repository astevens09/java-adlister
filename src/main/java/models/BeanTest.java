package models;

import java.util.ArrayList;
import java.util.List;

public class BeanTest {

    public static void main(String[] args) {
        Author sam = new Author(1, "Sam", "Bankmanfried");
        Author rick = new Author(2, "Rick", "Sanchez");
        Author  doa = new Author(3, "Doa", "Quan");

        ArrayList<Quotes> quotes = new ArrayList<>(List.of(
                new Quotes(1, "Everything is fine", sam),
                new Quotes(2, "What happened to morty", rick),
                new Quotes(3, "Luna Classic is great!", doa)
        ));

        for(Quotes quote: quotes){
            System.out.println(quote.getAuthor().getFirst_name());
        }



    }
}
