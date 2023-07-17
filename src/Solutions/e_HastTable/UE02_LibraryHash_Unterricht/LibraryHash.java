package Solutions.e_HastTable.UE02_LibraryHash_Unterricht;

import java.io.BufferedReader;
import java.io.FileReader;

public class LibraryHash
{
    private String[] books;

    // Konstruktor
    public LibraryHash(int size)
    {
        books = new String[size];
    }

    // Bücher aus einer Textdatei einlesen
    public void addBooksFromFile()
    {
        String line;
        BufferedReader br = null;

        try
        {
            br = new BufferedReader(new FileReader("books.txt"));

            while ((line = br.readLine()) != null)   {
                add(line);
            }

            br.close();
        } catch (Exception | HashFullException e)
        {
            e.printStackTrace();
        }
    }

    // Ein Buch zur Hashtable hinzufügen
    public void add(String bookTitle) throws HashFullException
    {
        int calcValue = Math.abs(bookTitle.hashCode());

        for (int i=0; i < books.length; i++)
        {
            int pos = (calcValue + i) % books.length;

            // Ist Stelle frei?
            if (books[pos] == null) {
                books[pos] = bookTitle;
                return;
            }
        }
        throw new HashFullException();
    }

    // Ein Buch aus der Hashtable entfernen
    public Boolean remove(String bookTitle)
    {
        int calcValue = Math.abs(bookTitle.hashCode());
        for (int i=0; i < books.length; i++)
        {
            int pos = (calcValue + i) % books.length;

            // Kommts überhaupt vor?
            if (books[pos] == null)
                return false;

            // Buch gefunden? Dann löschen
            if (books[pos].equals(bookTitle) == true)
            {
                books[pos] = null;
                return true;  // true heißt "Ja, ich habs gelöscht"
            }
        }
        return false;
    }

    // Abfrage, ob ein bestimmtes Buch in der Hashtable vorhanden ist
    public Boolean isBookInStock(String bookTitle)
    {
        int calcValue = Math.abs(bookTitle.hashCode());

        for (int i=0; i < books.length; i++)
        {
            int pos = (calcValue + i) % books.length;

            // Freie Stelle gefunden
            if (books[pos] == null)
                return false;

            // Buch gefunden?
            if (books[pos].equals(bookTitle) == true)
                return true;
        }
        return false;
    }

}
