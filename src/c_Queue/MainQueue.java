package c_Queue;

public class MainQueue {
    public static void main(String[] args) {
        BookingQueue bookingQueue = new BookingQueue();
        Booking dmBooking = new Booking("dm-Einkauf", -6.78);
        bookingQueue.enqueue(dmBooking);
        Booking fmBooking = new Booking("Finanzministerium Rückzahlung", +170.45);
        bookingQueue.enqueue(fmBooking);
        Booking rentBooking = new Booking("Miete", -548.00);
        bookingQueue.enqueue(rentBooking);
        Booking phoneBill = new Booking("Phone bill", -20.00);
        bookingQueue.enqueue(phoneBill);

        System.out.println("After enqueue:");
        bookingQueue.printQueue(bookingQueue);

        System.out.println("\nNumber of Nodes in the Queue: " +bookingQueue.getCount());

        System.out.println("\nWe will remove this booking from queue: " + bookingQueue.dequeue());

        System.out.println("\nAfter dequeue: ");
        bookingQueue.printQueue(bookingQueue);

        System.out.println("\nDequeue an empty list: ");
        BookingQueue bookingQueue2 = new BookingQueue();
        System.out.println("\nRemove front from empty queue: " + bookingQueue2.dequeue());

        System.out.println("\nDequeue a list with only 1 entry: ");
        bookingQueue2.enqueue(phoneBill); //add one booking to queue
        System.out.println("We will remove this booking from queue: " + bookingQueue2.dequeue());
        bookingQueue2.printQueue(bookingQueue2);
        System.out.println("\nAfter a dequeue of a list with only 1 entry: ");
        bookingQueue2.printQueue(bookingQueue2);

    }

}
