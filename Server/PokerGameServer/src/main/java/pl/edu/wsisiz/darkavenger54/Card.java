package pl.edu.wsisiz.darkavenger54;

public class Card
{
    private final Suit suit;
    private final Rank rank;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() { return suit; }
    public Rank getRank() { return rank; }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
