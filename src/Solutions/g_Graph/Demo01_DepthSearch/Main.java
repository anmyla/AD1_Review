package Solutions.g_Graph.Demo01_DepthSearch;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        City bregenz = new City("Bregenz");
        City innsbruck = new City("Innsbruck");
        City salzburg = new City("Salzburg");
        City klagenfurt = new City("Klagenfurt");
        City linz = new City("Linz");
        City graz = new City("Graz");
        City eisenstadt = new City("Eisenstadt");
        City wien = new City("Wien");

        bregenz.neighborCities.add(innsbruck);
        innsbruck.neighborCities.add(salzburg);
        innsbruck.neighborCities.add(klagenfurt);
        innsbruck.neighborCities.add(bregenz);
        salzburg.neighborCities.add(innsbruck);
        salzburg.neighborCities.add(graz);
        salzburg.neighborCities.add(linz);
        klagenfurt.neighborCities.add(innsbruck);
        klagenfurt.neighborCities.add(graz);
        linz.neighborCities.add(salzburg);
        linz.neighborCities.add(graz);
        linz.neighborCities.add(wien);
        graz.neighborCities.add(klagenfurt);
        graz.neighborCities.add(salzburg);
        graz.neighborCities.add(linz);
        graz.neighborCities.add(eisenstadt);
        eisenstadt.neighborCities.add(wien);
        eisenstadt.neighborCities.add(graz);
        wien.neighborCities.add(linz);
        wien.neighborCities.add(eisenstadt);

        GraphFunctions functions = new GraphFunctions();
        ArrayList<City> resultArrayDepth = functions.performDepthSearch(bregenz);

        System.out.print("Depth Search: ");
        for (City city : resultArrayDepth)
        {
            System.out.print(city.name + " -> ");
        }
        System.out.println();

        ArrayList<City> resultArrayBreadth = functions.performBreadthSearch(bregenz);
        System.out.print("Breadth Search: ");
        for (City city : resultArrayBreadth)
        {
            System.out.print(city.name + " -> ");
        }
        System.out.println();
    }
}
