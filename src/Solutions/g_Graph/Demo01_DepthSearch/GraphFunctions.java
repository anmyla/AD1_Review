package Solutions.g_Graph.Demo01_DepthSearch;

import java.util.*;

public class GraphFunctions {

    public ArrayList<City> performDepthSearch(City start) {
        ArrayList<City> visited = new ArrayList<>();

        performDepthSearchRecursive(start, visited);
        return visited;
    }

    private void performDepthSearchRecursive(City current, ArrayList<City> visited) {
        visited.add(current);
        for (City nextCity : current.neighborCities) {
            if (!visited.contains(nextCity))
                performDepthSearchRecursive(nextCity, visited);
        }
    }

    public ArrayList<City> performBreadthSearch(City start) {
        Queue<City> queue = new LinkedList<>();
        ArrayList<City> visited = new ArrayList<>();

        queue.add(start);
        while (!queue.isEmpty())
        {
            City current = queue.poll();  // = dequeue()
            visited.add(current);
            for (City next : current.neighborCities) {
                if (!visited.contains(next) && !queue.contains(next))
                    queue.add(next);
            }
        }
        return visited;
    }
}
