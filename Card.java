import java.util.*;
import java.io.*;
public class Card {
    private String suit;
    private String card;
    public String spade = "♠️";
    public String diamond = "♦️";
    public String club = "♣️";
    public String heart = "♥️";

    public Card(String suit, String card) {
        this.suit = suit;
        this.card = card;
    }
    public  Card()
    {

    }

    public String getSuit() {
        return this.suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getCard() {
        return this.card;
    }

    public void setCard(String card) {
        this.card = card;
    }
    public void getInfo()
    {
        System.out.print(this.suit +  this.card + "  ");
    }
}