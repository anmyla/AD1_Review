package c_Queue;

public class Booking {
    // *** Membervariablen ***
    private String bookingText;
    private double amount;

    // *** Konstruktor ***

    public Booking(String bookingText, double amount)
    {
        this.bookingText = bookingText;
        this.amount = amount;
    }

    // *** Getter-Methoden ***

    public String getBookingText()
    {
        return bookingText;
    }

    public double getAmount()
    {
        return amount;
    }

    @Override
    public String toString() {
        return "BookingText: " + bookingText + "\t" +
                "Amount: " + amount;
    }
}
