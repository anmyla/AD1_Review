package a_LinkedList;

public class Main {

    public static void printList(List_LinkedList list) {
        Node currentNode = list.getFirst();

        while(currentNode != null){
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
        }

    }
    public static void main(String[] args) {

        List_LinkedList myToDoList = new List_LinkedList();

        myToDoList.appendList("0 firstEntry");
        myToDoList.appendList("1 secondEntry");
        myToDoList.appendList("2 thirdEntry");
        myToDoList.appendList("3 fourthEntry");

        printList(myToDoList);

        myToDoList.interchange2NeighboringEntries(1); // interchange nodes at index 1 & 2

        System.out.println("\nAfter interchanging index 1 nd 2: ");
        printList(myToDoList);

        System.out.println("\nGet entry at index 2-->  " + myToDoList.getEntryAtIndex(2));

        myToDoList.deleteEntryAtIndex(0);
        System.out.println("\n---------AFTER DELETING ENTRY AT INDEX: 1 ------");
        printList(myToDoList);

        myToDoList.deleteLastEntry();
        System.out.println("\n---------AFTER DELETING LAST ENTRY------");
        printList(myToDoList);


    }
}