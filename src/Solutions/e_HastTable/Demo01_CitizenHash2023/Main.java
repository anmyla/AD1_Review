package Solutions.e_HastTable.Demo01_CitizenHash2023;

public class Main {

    public static void main(String[] args) {
        CitizenHash ch = new CitizenHash(10);

        ch.add(4711, "Thomas Maier");

        System.out.println("Gefunden: " + ch.search(4711));
    }
}
