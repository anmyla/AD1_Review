package d_Stack;

public class BookStack {
    private Node top;

    public Node getTop() {
        return this.top;
    }


    public void push(String bookTitle) { //add entry to the top of the stack
        Node newNode = new Node(bookTitle);
        newNode.setNext(top);
        top = newNode;
    }

    public String pop() { //return the top entry and deletes it.
        if (top == null) {
            System.out.println("Stack is empty. nothing to pop");
            return null;
        } else {
            String returnString = top.getBookTitle();
            top = top.getNext();
            return returnString;
        }
    }

    public int getCount() {
        Node current = top;
        int counter = 0;

        if (top == null) {
            return 0;
        }
        while (current.getNext() != null) {
            current = current.getNext();
            counter++;

        }
        return counter + 1;
    }

    public static void printBookStack(BookStack stack) {
        BookStack tempStack = new BookStack();

        // Transfer elements to a temporary stack in reverse order
        while (stack.getTop() != null) {
            String bookTitle = stack.pop(); //remove and save entry
            System.out.println(bookTitle); // print entry
            tempStack.push(bookTitle); // save entry to a temporary stack
        }

        // Transfer elements back to the original stack
        while (tempStack.getTop() != null) {
            stack.push(tempStack.pop()); //save to original stack
        }
    }


}