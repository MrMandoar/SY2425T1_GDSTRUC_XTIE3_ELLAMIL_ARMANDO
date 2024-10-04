public class Main {
    public static void main(String[] args) {
        // da linked list
        LinkedList characterList = new LinkedList();
        characterList.add("Harry Du Bois");
        characterList.add("Kim Kitsuragi");
        characterList.add("Jean Vicquemare");
        characterList.add("Cuno");
        characterList.add("Klaasje Amandou");

        System.out.println("Singly Linked List:");
        characterList.printList();
        System.out.println("Size: " + characterList.getSize());

        System.out.println("Removing first character...");
        characterList.removeFirst();
        characterList.printList();
        System.out.println("Size: " + characterList.getSize());

        System.out.println("Does the list contain 'Kim Kitsuragi'? " + characterList.contains("Kim Kitsuragi"));
        System.out.println("Index of 'Cuno': " + characterList.indexOf("Cuno"));
    }
}
