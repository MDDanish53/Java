
// Implementation 1 - Creating Graph using Adjacency List
import java.util.ArrayList;

public class Graph {

  static class Edge {
    int src;
    int dest;
    int wt;

    public Edge(int src, int dest, int weight) {
      this.src = src;
      this.dest = dest;
      this.wt = weight;
    }
  }

  public static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Edge>(); // creating arraylist of type Edge at every array index
    }

    // adding edges in graph
    graph[0].add(new Edge(0, 2, 2)); // (source vertex, destination vertex, weight)

    graph[1].add(new Edge(1, 2, 10));
    graph[1].add(new Edge(1, 3, 0));

    graph[2].add(new Edge(2, 0, 2));
    graph[2].add(new Edge(2, 1, 10));
    graph[2].add(new Edge(2, 3, -1));

    graph[3].add(new Edge(3, 1, 0));
    graph[3].add(new Edge(3, 2, -1));
  }

  public static void main(String args[]) {
    int V = 4; // number of vertices(nodes)
    ArrayList<Edge> graph[] = new ArrayList[V]; // creating array of size equal to vertices of type ArrayList
    createGraph(graph); // creating the graph

    // printing neighbours and edge weight of vertex = 2
    for (int i = 0; i < graph[2].size(); i++) {
      Edge e = graph[2].get(i); // getting the edge
      System.out.println(e.dest + " " + e.wt); // printing the neighbour and edge weight
    }
  }
}