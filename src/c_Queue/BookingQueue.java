package c_Queue;

public class BookingQueue {
    // *** Membervariablen ***
    private Node front;
    private Node rear;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public int getCount() {
        int counter = 0;

        if (front == null) {
            System.out.println("The queue is empty...");
            return counter;
        }else if (front == rear) {
            counter = counter + 1;
        }else {
            Node currentNode = front;
            while (currentNode != null) {
                currentNode = currentNode.getNext();
                counter++;
            }
        }
        return counter;
    }

    public void enqueue(Booking newBooking) {
        Node newNode = new Node(newBooking);
        if (front == null) {
            front = newNode;
        }else {
            rear.setNext(newNode);
        }
        rear = newNode;
    }

    public Booking dequeue() {
        Booking removeBooking;
        if(front == null) {
            System.out.println("Queue is empty. Nothing to dequeue!");
            return null;
        } else if (front == rear) {
            removeBooking = front.getBooking();
            front = null;
            rear = null;
        } else {
            Node temp = front.getNext();
            removeBooking = front.getBooking();
            front = null;
            setFront(temp);
        }
        return removeBooking;
    }

    public void printQueue(BookingQueue queue) {
        Node currentNode = front;
        int counter = 0;
        if(front == null) {
            System.out.println("Empty List. Nothing to print here...");
        } else {
            while (currentNode != null) {
                System.out.println(counter + " " + currentNode);
                currentNode = currentNode.getNext();
                counter++;
            }
        }
    }
}
