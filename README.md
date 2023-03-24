# Card-Game-on-Java
This program contains 4 files
- Main.java
- Operations.java
- Deck.java
- Card.java
### Card.java
It is a class file containing suit and card as private variable, public variables for all suits for emoji along with constructor, getter and setter methods.
### Deck.java
It consists of following functions:
- createDeck -> Creates whole deck of cards. Deck is a vector which contains 4 vectors for suits and each suit contains Card object. This function returns a vector(whole deck).
### Operations.java
It consists of following functions:
- printDeck -> It takes vector of deck as input and prints the entire deck in order.
- mapping -> Maps each emoji with the respective suit.
- random -> Returns a random number from 0 to 52 for indexing purpose.
- printCard -> Prints a random card from the deck using random function.
- sameCard -> Asks the user for the suit they want to print and display evetything from that particular suit.
- compareCards -> Compares two randomly generated cards from the deck.
- shuffleDeck -> Uses the Collections.shuffle method from java util library which shuffles the entire deck.
- findCard -> Asks user to input the suit and rank of the card and checks if the card is present in the deck or not.
- dealCard -> Prints 5 random cards from the deck
### Main.java
It consists of menue to navigate through various options in game:
<p>
Pick your choice (1️⃣-8️⃣) / 0️⃣ to exit. <br>
----------------------------------------------<br>
1️⃣ Create a deck               5️⃣ Same Cards<br>
2️⃣ Print the deck              6️⃣ Find Cards<br>
3️⃣ Print a Card                7️⃣ Deal Cards<br>
4️⃣ Compare two Cards           8️⃣ Shuffle Deck<br>
----------------------------------------------<br>
Choice ➡️
  </p>
