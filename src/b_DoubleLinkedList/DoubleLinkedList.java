package b_DoubleLinkedList;

public class DoubleLinkedList {
    protected Node first;
    protected Node last;

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

    public Node getNodeAtIndex(int index) {
       Node currentNode = first;
        int currentIndex = 0;

        while (currentNode != null) {
            if(currentIndex == index){
                return currentNode;
            }
            currentIndex++;
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public void addEntryToEndOfList(String entry) {
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

    public void addEntryAtStartOfList(String entry) {
        Node newNode = new Node();
        newNode.setToDo(entry);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            first.setPrevious(newNode);
            newNode.setNext(first);
            first = newNode;
        }
    }

    public void addEntryAtIndex(String entry, int index) {
        Node newNode = new Node();
        newNode.setToDo(entry);

        if (index < 0) {
            System.out.println("Invalid index!");
        } else if (index == 0) {
            if (first == last) {
                first.setPrevious(newNode);
                newNode.setNext(first);
                last = first;
                first = newNode;
            } else {
                first.setPrevious(newNode);
                newNode.setNext(first);
                first = newNode;
            }
        } else {
            Node currentNode = first;
            Node temp;
            int currentIndex = 1;

            while (currentNode != null) {
                temp = currentNode.getNext();
                temp.setPrevious(currentNode);

                if (currentIndex == index) {
                    currentNode.setNext(newNode);
                    newNode.setPrevious(currentNode);
                    newNode.setNext(temp);
                    temp.setPrevious(newNode);
                    break;

                } else {
                    currentNode = currentNode.getNext();
                    currentIndex++;
                }

            }
        }
    }
    public void deleteLastEntry(){
        Node currentNode;
        if(first == null) {
            System.out.println("List ist empty, nothing to delete here...");
        }else if(first == last) {
            last = null;
            first = null;
        }else {
            currentNode = first;
            while(currentNode.getNext() != last) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            last = currentNode;
        }
    }

    public void deleteFirstEntry(){
        Node currentNode;
        if(first == null) {
            System.out.println("List ist empty, nothing to delete here...");
        }else if(first == last) {
            last = null;
            first = null;
        }else {
            currentNode = first;
            Node temp = first.getNext();
            temp.setPrevious(null);
            first = temp;
        }
    }

    public void deleteEntryAtIndex(int index) {
        Node temp1;
        Node temp2;
        if (index < 0) {
            System.out.println("Invalid index!");
        }else if(first == null) {
            System.out.println("List ist empty, nothing to delete here...");
        } else if (index == 0) {
            if (first == last) {
                first = null;
                last = null;
            } else {
                temp1 = first.getNext();
                temp1.setPrevious(null);
                first = temp1;
            }
        } else {
            Node currentNode = first.getNext();
            int currentIndex = 1;

            while (currentNode != null && currentIndex <= index) {
                temp1 = currentNode.getNext();
                temp2 = currentNode.getPrevious();
                if (currentIndex == index) {
                    temp1.setPrevious(temp2);
                    temp2.setNext(temp1);
                    break;
                } else {
                    currentNode = currentNode.getNext();
                    currentIndex++;
                }

            }
        }
    }
}
