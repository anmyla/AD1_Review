package k_SampleExam.P3_SortCards;

public class Deck {
    private Card[] deck;
    private int cardCount;

    public Deck(int arraySize) {
        this.deck = new Card[arraySize];
        cardCount = 0;
    }

    public boolean addCard(Card.Color color, int number) {
        Card newCard = new Card(color, number);
        if (cardCount == deck.length)
            return false;
        else {
            deck[cardCount] = newCard;
            cardCount = cardCount + 1;
            return true;
        }
    }

    public Card[] getDeck() {
        return this.deck;
    }

    public void sortDeck1() { //bubble sort
        int n = cardCount;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (deck[j].getColor().compareTo(deck[j + 1].getColor()) > 0) {
                    // Swap the cards if the colors are not in ascending order
                    Card temp = deck[j];
                    deck[j] = deck[j + 1];
                    deck[j + 1] = temp;
                } else if (deck[j].getColor().compareTo(deck[j + 1].getColor()) == 0 &&
                        deck[j].getNumber() > deck[j + 1].getNumber()) {
                    // Swap the cards if the colors are the same but the numbers are not in ascending order
                    Card temp = deck[j];
                    deck[j] = deck[j + 1];
                    deck[j + 1] = temp;
                }
            }
        }
    }

    public void sortDeck() { //bubble sort
        int n = cardCount-1;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n-i; j++) {
                Card card1 = deck[j];
                Card card2 = deck[j +1];
                if (card1.getColor().compareTo(card2.getColor()) > 0) {
                    deck[j] = card2;
                    deck[j+1] = card1;
                } else if (card1.getColor().compareTo(card2.getColor()) == 0
                        && card1.getNumber() > card2.getNumber()) {
                    deck[j] = card2;
                    deck[j+1] = card1;
                }
            }
        }
    }
}
