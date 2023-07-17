package d_Stack;

import static d_Stack.BookStack.printBookStack;


public class MainBookStack {
    public static void main(String[] args) {
        BookStack bookStack = new BookStack();


        bookStack.push("1984");
        bookStack.push("Der kleine Prinz");
        bookStack.push("Robinson Crusoe");
        bookStack.push("Harry Potter 1");

        printBookStack(bookStack);


        bookStack.pop();
        bookStack.pop();
        bookStack.pop();

    }
}
