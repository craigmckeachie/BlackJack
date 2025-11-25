package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        //Craig was here !!
        ArrayList<String> playerNames = new ArrayList<>();
        playerNames.add("Tim");
        playerNames.add("Jim");
        playerNames.add("Lynn");
        int number = Integer.parseInt("5"); //static method that belongs to the class

        ArrayList<Dog> dogs = new ArrayList<>();

        Dog dog = new Dog("Scooby","Great Dane", LocalDate.of(1999, 12, 31));
//        dog.bark(); //instance method that belongs to the object (created from the Class)
        dogs.add(dog);

        Dog dog1 = new Dog("Scrappy", "Great Dane", LocalDate.of(2008, 11, 3));
        dogs.add(dog1);

        for (Dog d : dogs) {
            String representationOfTheDogObjectAsAString = d.toString();
            System.out.println(representationOfTheDogObjectAsAString);
        }


        for (String playerName : playerNames) {
            // code that uses variable
            System.out.println(playerName);
        }





        Deck deck = new Deck();
        Hand hand1 = new Hand();
        int numberOfCardsPerHand = 2;
        // deal 2 cards
        for(int cardCount = 1; cardCount <= numberOfCardsPerHand; cardCount++) {
            // get a card from the deck
            Card card = deck.dealCard();
            // deal that card to the hand
            hand1.addCard(card);
        }
        int handValue = hand1.calculateTotalPoints();
        System.out.println("This hand is worth " + handValue);
    }
}
