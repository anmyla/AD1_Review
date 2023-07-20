package a_LinkedList;

public class List_LinkedList {
    protected Node last;
    protected Node first;

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public void appendList(String entry) { //add to the end of the list
        Node newNode = new Node();
        newNode.setToDo(entry);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void deleteLastEntry() {
        Node currentNode = new Node();
        currentNode = first; // we start searching for the last Node here.

        if (first == last) {
            first = null;
            last = null;
        } else {
            while (currentNode.getNext() != last) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null); //we delete the content of last
            last = currentNode;
        }
    }


    public String getEntryAtIndex(int index) {
        Node currentNode = first;
        int currentIndex = 0;

        while (currentNode != null) {
            if (currentIndex == index) {
                return currentNode.getToDo();
            }
            currentIndex++;
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public Node getNodeAtIndex(int index) {
        Node currentNode = first;
        int currentIndex = 0;

        while (currentNode != null) {
            if (currentIndex == index) {
                return currentNode;
            }
            currentIndex++;
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public void deleteEntryAtIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if (index == 0) {
            // Case 1: Deleting the first node
            if (first == last) {
                // If the list has only one node
                first = null;
                last = null;
            } else {
                // If there are more than one node
                first = first.getNext();
            }
        } else {
            // Case 2: Deleting a node other than the first node
            Node previousNode = getNodeAtIndex(index - 1);

            if (previousNode != null && previousNode.getNext() != null) {
                Node currentNode = previousNode.getNext().getNext(); //saving to a variable to prevent data loss
                previousNode.setNext(currentNode);


                if (currentNode == last) {
                    // If the deleted node is the last node
                    last = previousNode;
                }
            } else {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }
        }
    }

    public void interchange2NeighboringEntries(int index) { // interchange array[index] with its predecessor
        Node baseNode = getNodeAtIndex(index - 1); //we get the node prior to array[index]

        if(first == null) {
            System.out.println("List is empty, nothing to interchange!");
        } else if(first == last) {
            System.out.println("List has only 1 entry, nothing to interchange");
        }else {
            Node currentNode = first;
            Node node1, node2, node3;
            while (currentNode != baseNode) {
                currentNode = currentNode.getNext();
            }
            node1 = currentNode.getNext(); // this is what we want to
            node2 = node1.getNext();
            node3 = node2.getNext();

            currentNode.setNext(node2);
            node2.setNext(node1);
            node1.setNext(node3);
        }
    }
}
