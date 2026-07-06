import java.util.Random;

public class DeckOfCards {
    private final Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();

    public DeckOfCards() {
        Face[] faces = Face.values();
        Suit[] suits = Suit.values();
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    // Exercise 7.21: Fisher-Yates Shuffling Algorithm[cite: 1]
    public void shuffle() {
        currentCard = 0;
        for (int first = deck.length - 1; first > 0; first--) {
            int second = randomNumbers.nextInt(first + 1);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }
}