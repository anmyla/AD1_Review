package Solutions.b_LinkedLists.UE2_WagonLinkedList_Unterricht;

public class WagonLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Methoden ***
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    void insertWagonAtFirstPos(String wagonId) {
        // wagonId = String
        // --> gewünscht Node
        Node newNode = new Node();
        newNode.setWagonId(wagonId);

        // Fall: Liste ist leer
        if (first == null)
        {
            first = newNode;
            last = newNode;
        }
        else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }

    void removeWagonFromLastPos() {

        // Fall: Liste besteht aus einem Element
        if ((last != null) && (first == last))
        {
            first = null;
            last = null;
        }
        else
        {
            // last.getPrev() == Vorgänger vom letzten Knoten
            last.getPrev().setNext(null);

            // Last zeigt jetzt auf den Vorgänger
            last = last.getPrev();
        }
    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}
