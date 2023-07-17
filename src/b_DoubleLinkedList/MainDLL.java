package b_DoubleLinkedList;

public class MainDLL {
    public static void printList(DoubleLinkedList list) {
        Node currentNode = list.getFirst();
        int counter = 0;
        while(currentNode != null) {
            System.out.println(counter + ": " +currentNode);
            currentNode = currentNode.getNext();
            counter++;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList myToDoList = new DoubleLinkedList();

        myToDoList.addEntryToEndOfList("firstEntry");
        myToDoList.addEntryToEndOfList("secondEntry");
        myToDoList.addEntryToEndOfList("thirdEntry");
        myToDoList.addEntryToEndOfList("lastEntry");

        printList(myToDoList);

        System.out.println("\nGet entry at index 2-->  " + myToDoList.getNodeAtIndex(2));

        System.out.println("\n------After Inserting Entry at the start------");
        myToDoList.addEntryAtStartOfList("insert this at the start of the list");
        printList(myToDoList);

        System.out.println("\n------After Inserting Entry to a Particular Index------");
        myToDoList.addEntryAtIndex("Insert this to index 2", 2);
        printList(myToDoList);

        System.out.println("\n------After Deleting LAST Entry------");
        myToDoList.deleteLastEntry();
        printList(myToDoList);


        System.out.println("\n------After Deleting FIRST Entry------");
        myToDoList.deleteFirstEntry();
        printList(myToDoList);

        System.out.println("\n------After Deleting Entry at a particular index------");
        myToDoList.deleteEntryAtIndex(1);
        printList(myToDoList);

    }
}
