import java.util.Scanner;

public class PokerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();
        
        System.out.println("Starting a 20-game stretch against the Computer Dealer (From Chapter 7.docx)...\n"); //[cite: 1]
        int playerWins = 0;
        int dealerWins = 0;
        int ties = 0;

        for (int game = 1; game <= 20; game++) { //[cite: 1]
            deck.shuffle();
            System.out.printf("--- Game %d ---\n", game);

            Card[] playerHandCards = new Card[5];
            Card[] dealerHandCards = new Card[5];
            for (int i = 0; i < 5; i++) {
                playerHandCards[i] = deck.dealCard();
                dealerHandCards[i] = deck.dealCard();
            }

            PokerHand playerHand = new PokerHand(playerHandCards);
            PokerHand dealerHand = new PokerHand(dealerHandCards);

            System.out.println("Your hand: " + playerHand);
            System.out.println("Your current rank: " + playerHand.getHandRatingAsString());

            // Player Choice (Exercise 4)[cite: 1]
            System.out.print("How many cards do you want to replace (0-3)? ");
            int toReplace = input.nextInt();
            toReplace = Math.min(3, Math.max(0, toReplace)); 

            for (int r = 0; r < toReplace; r++) {
                System.out.print("Enter card index to replace (0-4): ");
                int idx = input.nextInt();
                if (idx >= 0 && idx < 5) {
                    playerHand.replaceCard(idx, deck.dealCard());
                }
            }
            System.out.println("Your final hand: " + playerHand);
            System.out.println("Your final rank: " + playerHand.getHandRatingAsString());

            // Dealer Automation (Exercise 3)[cite: 1]
            executeDealerAI(dealerHand, deck);

            System.out.println("\nDealer's final hand: " + dealerHand);
            System.out.println("Dealer's final rank: " + dealerHand.getHandRatingAsString());

            // Evaluation (Exercise 2)[cite: 1]
            int result = playerHand.compareTo(dealerHand);
            if (result > 0) {
                System.out.println(">> You win this round! <<");
                playerWins++;
            } else if (result < 0) {
                System.out.println(">> Dealer wins this round! <<");
                dealerWins++;
            } else {
                System.out.println(">> It's a tie! <<");
                ties++;
            }
            System.out.println("---------------------------\n");
        }

        System.out.println("=== FINAL SCOREBOARD ===");
        System.out.printf("Player Wins: %d\n", playerWins);
        System.out.printf("Dealer Wins: %d\n", dealerWins);
        System.out.printf("Ties: %d\n", ties);
    }

    private static void executeDealerAI(PokerHand hand, DeckOfCards deck) {
        int rank = hand.getHandRankValue();
        if (rank >= 4) return; // Keep Straights/Flushes or better

        Card[] cards = hand.getCards();
        
        if (rank == 3) {
            Face tripleFace = null;
            int[] counts = new int[13];
            for (Card c : cards) counts[c.getFace().ordinal()]++;
            for (int i = 0; i < 13; i++) if (counts[i] == 3) tripleFace = Face.values()[i];

            for (int i = 0; i < 5; i++) {
                if (cards[i].getFace() != tripleFace) {
                    hand.replaceCard(i, deck.dealCard());
                }
            }
        } else if (rank == 2) {
            int[] counts = new int[13];
            for (Card c : cards) counts[c.getFace().ordinal()]++;
            for (int i = 0; i < 5; i++) {
                if (counts[cards[i].getFace().ordinal()] == 1) {
                    hand.replaceCard(i, deck.dealCard());
                    break; 
                }
            }
        } else if (rank == 1) {
            Face pairFace = null;
            int[] counts = new int[13];
            for (Card c : cards) counts[c.getFace().ordinal()]++;
            for (int i = 0; i < 13; i++) if (counts[i] == 2) pairFace = Face.values()[i];

            int replaced = 0;
            for (int i = 0; i < 5; i++) {
                if (cards[i].getFace() != pairFace && replaced < 3) {
                    hand.replaceCard(i, deck.dealCard());
                    replaced++;
                }
            }
        } else {
            for (int r = 0; r < 3; r++) {
                int lowestIdx = 0;
                for (int i = 1; i < 5; i++) {
                    if (cards[i].getFace().ordinal() < cards[lowestIdx].getFace().ordinal()) {
                        lowestIdx = i;
                    }
                }
                hand.replaceCard(lowestIdx, deck.dealCard());
            }
        }
    }
}