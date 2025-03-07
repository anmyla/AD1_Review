package Solutions.b_LinkedLists.UE4_BookingQueue_Loesung;

public class Node {
    private final Booking booking;
    private Node next;

    // *** Konstruktor ***

    public Node(Booking booking) {
        this.booking = booking;
    }


    // *** Getter- & Setter-Methoden

    public Booking getBooking() {
        return this.booking;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }
}
