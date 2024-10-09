import java.util.LinkedList;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack() {
        stack = new LinkedList<>();
    }

    public void push(Card card) {
        stack.push(card);
    }

    public Card pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public Card peek() {
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("No cards in this stack dawg.");
        } else {
            for (Card card : stack) {
                System.out.println(card);
            }
        }
    }
}
