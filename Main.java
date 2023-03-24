import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        int choice;
        int flag=0;
        int secondChoice;
        Vector<Card> cardDeck = new Vector<Card>();
        Scanner scan = new Scanner(System.in);
        Operations o = new Operations();
        Deck d = new Deck();
        // Printing out the description of the game 1️⃣3️⃣4️⃣5️⃣6️⃣7️⃣8️⃣9️⃣🔟🃏👑👑
        System.out.println("****************  CARD GAME  **************** ");
        while(true)
        {
            System.out.println();
            System.out.println("Pick your choice (1️⃣-8️⃣) / 0️⃣ to exit ");
            System.out.println("----------------------------------------------");
            System.out.println("1️⃣ Create a deck               5️⃣ Same Cards");
            System.out.println("2️⃣ Print the deck              6️⃣ Find Cards");
            System.out.println("3️⃣ Print a Card                7️⃣ Deal Cards");
            System.out.println("4️⃣ Compare two Cards           8️⃣ Shuffle Deck");
            System.out.println("----------------------------------------------");
            System.out.print("Choice ➡️ ");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1: cardDeck = d.createDeck();
                break;
                case 2: o.printDeck(cardDeck);
                break;
                case 3: o.printCard(cardDeck);
                break;
                case 4: o.compareCards(cardDeck);
                break;
                case 5:o.sameCard(cardDeck);
                break;
                case 6:o.findCard(cardDeck);
                break;
                case 7:o.dealCard(cardDeck);
                break;
                case 8:o.shuffleDeck(cardDeck);
                break;
                case 0:
                    flag=1;
                    break;
                default:
                    System.out.println("💀☠️Check the number and try again");
            }
            if(flag==1)
            {
                break;
            }

        }
    }
}
