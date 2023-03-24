import java.util.Collections;
import java.util.*;
import java.io.*;

public class Operations extends Card
{
    // Scanner to take input
    Scanner scan = new Scanner(System.in);


    // To print entire Deck
    void printDeck(Vector<Card>cardDeck) {
        int count=0;
    for(Card card: cardDeck) {
        count++;
        card.getInfo();
        if(count%4 ==0)
        {
            System.out.println();
        }
    }
    }

    // This function maps each numbers to their respective suit
    public String mapping(int n)
    {
        if(n==1)
        {
            return spade;
        } else if (n==2) {
            return club;
        } else if (n==3) {
            return heart;
        } else if (n==4) {
            return diamond;
        }
        return "";
    }



    // This function returns the random value from 0 to 51
    public int random()
    {
        Random rand = new Random();
        return rand.nextInt(53);
    }



    // To Print a random Card
    void printCard(Vector<Card>cardDeck) {
        // Getting a random value from the deck of cards
        Card randomCard = cardDeck.get(random());
        System.out.print("Random card from the deck is -> ");
        randomCard.getInfo();
        System.out.println();
    }

    // Find Cards which are from same suit
    void sameCard(Vector<Card>cardDeck)
    {
        int suitInput;
        System.out.println("Enter the number corrosponding to the suit");
        System.out.println("1️⃣=> ♠️(Spade)    2️⃣=> ♣️(Club)  3️⃣=> ♥️(Heart)  4️⃣=> ♦️(Diamond)");
        suitInput = scan.nextInt();
        for(Card cards:cardDeck)
        {
            if (suitInput == 1) {
                if (cards.getSuit().equals(spade)) {
                    cards.getInfo();
                }
            }
            if (suitInput == 2) {
                if (cards.getSuit().equals(club)) {
                    cards.getInfo();
                }
            }
            if (suitInput == 3) {
                if (cards.getSuit().equals(heart)) {
                    cards.getInfo();
                }
            }

            if (suitInput == 4) {
                if (cards.getSuit().equals(diamond)) {
                    cards.getInfo();
                }

            }
        }
        System.out.println();

    }
    // Compare rank of cards
    void compareCards(Vector<Card>cardDeck)
    {
        System.out.println("Two random Cards");
        Card c1 = cardDeck.get(random());
        Card c2 = cardDeck.get(random());
        c1.getInfo();
        c2.getInfo();
        if (c1.getCard().equals(c2.getCard()))
        {
           System.out.println("=>Same");
        }
        else {
            System.out.println("=> Different");
        }
    }

    void shuffleDeck(Vector<Card>cardDeck)
    {
        Collections.shuffle(cardDeck);
        System.out.println("Kindly Print cards in order to see the shuffled cards");

    }
    void findCard(Vector<Card>cardDeck)
    {
            int suitInput;
            System.out.println("Enter the number corrosponding to the suit");
            System.out.println("1️⃣=> ♠️(Spade)    2️⃣=> ♣️(Club)  3️⃣=> ♥️(Heart)  4️⃣=> ♦️(Diamond)");
            suitInput = scan.nextInt();
            String card;
            System.out.println("Enter the card you want to check 1️⃣,2️⃣,3️⃣,4️⃣,5️⃣,6️⃣,7️⃣,8️⃣,9️⃣,🔟,J,Q,K");
            card = scan.next();
            int counter = 0;
            for(Card individualCards:cardDeck) // This loops through each cards
            {
                counter++;

                // This is just for mapping the numbering to the suits
                if (suitInput == 1) {
                    if (individualCards.getSuit().equals(spade) && individualCards.getCard().equals(card)) {
                        System.out.println("Card Found: -> " + spade + card);
                        break;
                    }
                }
                if (suitInput == 2) {
                    if (individualCards.getSuit().equals(club) && individualCards.getCard().equals(card)) {
                        System.out.println("Card Found: -> " + club + card);
                        break;
                    }
                }
                if (suitInput == 3) {
                    if (individualCards.getSuit().equals(heart) && individualCards.getCard().equals(card)) {
                        System.out.println("Card Found: -> " + heart + card);
                        break;
                    }
                }

                if (suitInput == 4) {
                    if (individualCards.getSuit().equals(diamond) && individualCards.getCard().equals(card)) {
                        System.out.println("Card Found: -> " + diamond + card);
                        break;
                    }

                }
            }
            // Checking if the loop completed or broke in the middle
            if(counter==52)
            {
                String m = mapping(suitInput);
                System.out.println("💀💀Your card not found --> " +m +card);
            }
            System.out.println();
        }

        // Printing 5 random cards
        void dealCard(Vector<Card>cardDeck)
        {
            System.out.println("Your 5 random cards are ");
            for(int i =0;i<5;i++)
            {
                int randomValue = random();
                cardDeck.get(randomValue).getInfo();
            }
            System.out.println();

        }
}

