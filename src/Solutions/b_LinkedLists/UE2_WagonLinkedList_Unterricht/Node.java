package Solutions.b_LinkedLists.UE2_WagonLinkedList_Unterricht;

public class Node {
    // *** Membervariablen ***
    private String wagonId;
    private Node next;
    private Node prev;

    // *** Getter- & Setter-Methoden ***
    public String getWagonId() {
        return wagonId;
    }

    public void setWagonId(String wagonId) {
        this.wagonId = wagonId;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
