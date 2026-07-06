import java.util.Arrays;

public class PokerHand implements Comparable<PokerHand> {
    private final Card[] cards;
    private final int[] faceCounts = new int[13];
    private final int[] suitCounts = new int[4];

    public PokerHand(Card[] cards) {
        if (cards.length != 5) {
            throw new IllegalArgumentException("A poker hand must contain exactly 5 cards.");
        }
        this.cards = cards;
        evaluateFrequencies();
    }

    private void evaluateFrequencies() {
        for (Card card : cards) {
            faceCounts[card.getFace().ordinal()]++;
            suitCounts[card.getSuit().ordinal()]++;
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public void replaceCard(int index, Card newCard) {
        cards[index] = newCard;
        Arrays.fill(faceCounts, 0);
        Arrays.fill(suitCounts, 0);
        evaluateFrequencies();
    }

    // Hand evaluation methods (Exercise 1)[cite: 1]
    public boolean isFourOfAKind() {
        for (int count : faceCounts) if (count == 4) return true;
        return false;
    }

    public boolean isFullHouse() {
        boolean hasThree = false;
        boolean hasTwo = false;
        for (int count : faceCounts) {
            if (count == 3) hasThree = true;
            if (count == 2) hasTwo = true;
        }
        return hasThree && hasTwo;
    }

    public boolean isFlush() {
        for (int count : suitCounts) if (count == 5) return true;
        return false;
    }

    public boolean isStraight() {
        int consecutive = 0;
        for (int count : faceCounts) {
            if (count == 1) {
                consecutive++;
                if (consecutive == 5) return true;
            } else if (count > 1) {
                return false;
            } else {
                consecutive = 0;
            }
        }
        // Wheel Straight: Ace, 2, 3, 4, 5
        return faceCounts[12] == 1 && faceCounts[0] == 1 && faceCounts[1] == 1 && faceCounts[2] == 1 && faceCounts[3] == 1;
    }

    public boolean isThreeOfAKind() {
        if (isFullHouse() || isFourOfAKind()) return false;
        for (int count : faceCounts) if (count == 3) return true;
        return false;
    }

    public boolean isTwoPairs() {
        int pairs = 0;
        for (int count : faceCounts) if (count == 2) pairs++;
        return pairs == 2;
    }

    public boolean isPair() {
        if (isFullHouse() || isTwoPairs()) return false;
        for (int count : faceCounts) if (count == 2) return true;
        return false;
    }

    public int getHandRankValue() {
        if (isStraight() && isFlush()) return 8; 
        if (isFourOfAKind()) return 7;
        if (isFullHouse()) return 6;
        if (isFlush()) return 5;
        if (isStraight()) return 4;
        if (isThreeOfAKind()) return 3;
        if (isTwoPairs()) return 2;
        if (isPair()) return 1;
        return 0; 
    }

    public String getHandRatingAsString() {
        if (isStraight() && isFlush()) return "Straight Flush";
        if (isFourOfAKind()) return "Four of a Kind";
        if (isFullHouse()) return "Full House";
        if (isFlush()) return "Flush";
        if (isStraight()) return "Straight";
        if (isThreeOfAKind()) return "Three of a Kind";
        if (isTwoPairs()) return "Two Pairs";
        if (isPair()) return "Pair";
        return "High Card";
    }

    @Override
    public int compareTo(PokerHand other) {
        return Integer.compare(this.getHandRankValue(), other.getHandRankValue());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append("[").append(card).append("] ");
        }
        return sb.toString();
    }
}