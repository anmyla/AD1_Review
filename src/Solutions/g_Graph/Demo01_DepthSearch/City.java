package Solutions.g_Graph.Demo01_DepthSearch;

import java.util.ArrayList;

public class City {
    public String name;
    public ArrayList<City> neighborCities;

    public City(String name) {
        this.name = name;
        this.neighborCities = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }
}
