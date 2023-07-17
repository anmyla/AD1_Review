package Solutions.b_LinkedLists.UE3_BookStack_Unterricht;

public class BookStack
{
    // *** Membervariablen ***
    private Node top;

    // *** Getter- und Setter-Methoden ***

    public Node getTop() {
        return top;
    }


    // *** Operationen ***

    public void push(String bookTitle)
    {
        Node newNode = new Node(bookTitle);

        if (top == null)
        {
            top = newNode;
        }
        else
        {
            newNode.setNext(top);
            top = newNode;
        }
    }

    public String pop() throws StackEmptyException
    {
        if (top == null)
        {
            throw new StackEmptyException();
        }
        else
        {
            String temp = top.getBookTitle();
            top = top.getNext();
            return temp;
        }
    }

    public int getCount()
    {
        // Liste leer
        if (top == null)
            return 0;

        Node current = top;
        int counter = 0;

        while (current.getNext() != null)
        {
            current = current.getNext();
            counter++;
        }
        return counter+1;
    }
}
