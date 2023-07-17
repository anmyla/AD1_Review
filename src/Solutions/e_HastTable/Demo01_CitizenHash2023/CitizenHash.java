package Solutions.e_HastTable.Demo01_CitizenHash2023;

public class CitizenHash {
    public String citizens[];
    public int size;

    public CitizenHash(int size) {
        citizens = new String[size];
        this.size = size;
    }

    public void add(int socialSecurityNo, String name)
    {
        // Name = "Thomas Becker"
        int pos = socialSecurityNo % size;
        citizens[pos] = name;
    }

    public String search(int socialSecurityNo)
    {
        int pos = socialSecurityNo % size;
        return citizens[pos];
    }

}
