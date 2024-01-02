import java.util.*;

public class DeckCards {
    public static void main(String[] args) {
        List<String> suits = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");
        List<String> ranks = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
        List<String> deck = initializeDeck(suits, ranks);
        shuffuleDeck(deck);
        String[][] playersCards  = distributedCards(deck, 4, 9);
        printPlayerCards(playersCards);
    }

    private static List<String> initializeDeck(List<String> suits, List<String> ranks) {
        List<String> deck = new ArrayList<>();
        for(String suit : suits) {
            for(String rank : ranks) {
                deck.add(rank +" of "+suit);
            }
        }
        return deck;
    }

    private static void shuffuleDeck(List<String> deck) {
        Collections.shuffle(deck, new Random());
    }

    private static String[][] distributedCards(List<String> deck, int players, int cards) {
        String[][] playersCards = new String[players][cards];
        int cardIndex = 0;
        for(int player=0; player<players; player++) {
            for(int card=0; card<cards; card++) {
                playersCards[player][card] = deck.get(cardIndex++);
            }
        }
        return playersCards;
    }

    private static void printPlayerCards(String[][] playersCards) {
        for(int player=0; player<playersCards.length; player++) {
            System.out.print("Player"+(player+1)+" cards:   ");
            for(int card=0; card<playersCards[player].length; card++) {
                System.out.print(playersCards[player][card]+",\t");
            }
            System.out.println();
        }
    }
}