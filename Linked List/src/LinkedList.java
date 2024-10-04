// da linked list
class LinkedList {
    private Node head;  // da head
    private int size;   // size tracka

    // make empty list
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // new character incoming
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // If list is empty, new node is da head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;  // add a new node babeh
        }
        size++;  // counter bigger now
    }

    // first element go bye bye
    public void removeFirst() {
        if (head != null) {
            head = head.next;  // new head is next head
            size--;  // counter smaller now
        }
    }

    // return da numba of elements in da list
    public int getSize() {
        return size;
    }

    // is da character here ?
    public boolean contains(String data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;  // they here
            }
            current = current.next;
        }
        return false;  // they aint here
    }

    // return characters to da list, -1 if not found tho
    public int indexOf(String data) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(data)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;  // no bueno
    }

    // show it to the world
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
