package Solutions.g_Graph.UE05_ArrayAndListGraph;

public class WeightedEdge {
	public int from_vertex;
	public int to_vertex;
	public int weight;

	public WeightedEdge(int from_vertex, int to_vertex, int weight) {
		this.from_vertex = from_vertex;
		this.to_vertex = to_vertex;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "WeightedEdge{" +
				"from_vertex=" + from_vertex +
				", to_vertex=" + to_vertex +
				", weight=" + weight +
				'}';
	}
}
