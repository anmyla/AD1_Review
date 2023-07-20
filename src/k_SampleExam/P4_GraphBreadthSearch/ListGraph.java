package k_SampleExam.P4_GraphBreadthSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListGraph {

    private ArrayList<Edge>[] graph;
    private int numVertices;
    private boolean directed;

    public ListGraph(int numVertices, boolean directed) {
        graph = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++)
            graph[i] = new ArrayList<Edge>();
        this.numVertices = numVertices;
        this.directed = directed;
    }

    public int numVertices() {
        return numVertices;
    }

    public boolean isDirected() {
        return directed;
    }

    public boolean hasEdge(int fromVertex, int toVertex) {
        Edge edge = findEdge(fromVertex, toVertex);
        return edge != null;
    }

    public void addEdge(int fromVertex, int toVertex) {
        graph[fromVertex].add(new Edge(fromVertex, toVertex));
        if (!directed) {
            graph[toVertex].add(new Edge(toVertex, fromVertex));
        }
    }

    private Edge findEdge(int fromVertex, int toVertex) {
        for (Edge edge : graph[fromVertex]) {
            if (edge.toVertex == toVertex) {
                return edge;
            }
        }
        return null;
    }

    public void removeEdge(int fromVertex, int toVertex) {
        graph[fromVertex].remove(findEdge(fromVertex, toVertex));
        if (!directed) {
            graph[toVertex].remove(findEdge(toVertex, fromVertex));
        }
    }

    public List<Edge> getEdges(int v) {
        return graph[v];
    }

    public List<Integer> performBreadthSearch(int startVertex) {
        List searchedList = new LinkedList();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            if (!searchedList.contains(vertex)) {
                searchedList.add(vertex);
                for (Edge edge : graph[vertex]) {
                    int adjacentVertex = edge.toVertex;
                    queue.add(adjacentVertex);
                }
            }
        }
        return searchedList;
    }


    public List<Integer> performBreadthSearch2(int startVertex) {
        List searchedList = new LinkedList();
        boolean[] isVisited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startVertex);
        isVisited[startVertex] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            searchedList.add(vertex);

            for (Edge edge : graph[vertex]) {
                int adjacentVertex = edge.toVertex;
                if (!isVisited[adjacentVertex]) {
                    isVisited[adjacentVertex] = true;
                    queue.add(adjacentVertex);
                }
            }
        }
        return searchedList;
    }

    public List<Integer> performBreadthSearch4(int startVertex) {
        Queue<Integer> queue = new LinkedList<Integer>();
        ArrayList<Integer> visited = new ArrayList<Integer>();

        queue.add(startVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();  // =dequeue (d.h. raus aus Queue)

            // Nur weiterprüfen, wenn der Knoten nicht schon in visited ist.
            if (visited.contains(currentVertex) == false) {
                visited.add(currentVertex);  // Eintragen als nächstes in visited
                // Jeden Edge von der Array-Position anschauen
                for (Edge e : graph[currentVertex]) {
                    queue.add(e.toVertex);
                }
            }
        }
        return visited;
    }


    public List<Integer> performBreadthSearch1(int startVertex) {
        List<Integer> visited = new ArrayList<>(); // List to store the visited vertices
        boolean[] isVisited = new boolean[numVertices]; // Array to mark visited vertices
        Queue<Integer> queue = new LinkedList<>(); // Queue for breadth-first search

        // Mark the start vertex as visited and enqueue it
        isVisited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            visited.add(vertex);

            // Visit all adjacent vertices of the current vertex
            for (Edge edge : graph[vertex]) {
                int adjacentVertex = edge.toVertex;
                if (!isVisited[adjacentVertex]) {
                    isVisited[adjacentVertex] = true;
                    queue.add(adjacentVertex);
                }
            }
        }
        return visited;
    }


}
