package d_Stack;

public class Node
{

    private final String bookTitle;
    private Node next; //next one below
    public Node(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }
    public String getBookTitle()
    {
        return this.bookTitle;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
