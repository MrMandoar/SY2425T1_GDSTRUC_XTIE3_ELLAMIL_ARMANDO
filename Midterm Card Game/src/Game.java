import java.util.Random;
import java.util.Scanner;

public class Game { //MTG Goblin cards ahihi
    private static final String[] GOBLIN_CARDS = {
            "Goblin Guide", "Goblin Chieftain", "Goblin Arsonist",
            "Goblin Bushwhacker", "Krenko, Mob Boss", "Goblin Instigator",
            "Goblin Matron", "Mogg War Marshal", "Legion Loyalist",
            "Goblin Piledriver"
    };

    private CardStack playerDeck;
    private CardStack playerHand;
    private CardStack discardPile;
    private Random random;

    public Game() {
        playerDeck = new CardStack();
        playerHand = new CardStack();
        discardPile = new CardStack();
        random = new Random();
        initializeDeck();
    }

    private void initializeDeck() {
        for (int i = 0; i < 30; i++) {
            playerDeck.push(new Card(GOBLIN_CARDS[random.nextInt(GOBLIN_CARDS.length)]));
        }
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        while (!playerDeck.isEmpty()) {
            System.out.println("----- New Turn -----");
            int command = random.nextInt(3);  // Random commands, try ya luck

            switch (command) {
                case 0 -> drawCards();
                case 1 -> discardCards();
                case 2 -> retrieveFromDiscard();
            }

            displayGameStatus();

            System.out.println("\nPress Enter to proceed to the next turn...");
            scanner.nextLine();
        }

        System.out.println("THE DECK IS EMPTY (hehe deck)");
    }

    private void drawCards() {
        int drawCount = random.nextInt(5) + 1;
        System.out.println("Command: Draw " + drawCount + " card(s)");

        for (int i = 0; i < drawCount; i++) {
            if (!playerDeck.isEmpty()) {
                playerHand.push(playerDeck.pop());
            } else {
                System.out.println("Ya done got everything, no more cards to draw dawg");
                break;
            }
        }
    }

    private void discardCards() {
        int discardCount = random.nextInt(5) + 1;
        System.out.println("Command: Discard " + discardCount + " card(s)");

        for (int i = 0; i < discardCount; i++) {
            if (!playerHand.isEmpty()) {
                discardPile.push(playerHand.pop());
            } else {
                System.out.println("Ya dont got cards in ya hand to discard anymore dawg");
                break;
            }
        }
    }

    private void retrieveFromDiscard() {
        int retrieveCount = random.nextInt(5) + 1;
        System.out.println("Command: Retrieve " + retrieveCount + " card(s) from the discard pile");

        for (int i = 0; i < retrieveCount; i++) {
            if (!discardPile.isEmpty()) {
                playerHand.push(discardPile.pop());
            } else {
                System.out.println("Ya dont got discarded cards to get from the pile no mo");
                break;
            }
        }
    }

    private void displayGameStatus() {
        System.out.println("\n--- Game Status ---");
        System.out.println("Player Hand:");
        playerHand.displayStack();

        System.out.println("\nRemaining Cards in Player Deck: " + playerDeck.size());
        System.out.println("Cards in Discard Pile: " + discardPile.size());
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}
