
import java.util.ArrayList;
import java.util.PriorityQueue;

// Minimum Spanning Tree (MST) using Prim's Algorithm
// To apply MST algorithms like Prim’s:
// - The graph must be undirected.
// - The graph must be connected.
// - The graph must have weighted edges.

public class Prims {

  static class Edge {
    int src;
    int dest;
    int wt;

    public Edge(int src, int dest, int wt) {
      this.src = src;
      this.dest = dest;
      this.wt = wt;
    }
  }

  public static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Edge>();
    }

    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 3, 30));
    graph[0].add(new Edge(0, 2, 15));

    graph[1].add(new Edge(1, 0, 10));
    graph[1].add(new Edge(1, 3, 40));

    graph[2].add(new Edge(2, 0, 15));
    graph[2].add(new Edge(2, 3, 50));

    graph[3].add(new Edge(3, 0, 30));
    graph[3].add(new Edge(3, 1, 40));
    graph[3].add(new Edge(3, 2, 50));
  }

  public static class Pair implements Comparable<Pair> {
    int node;
    int cost;

    public Pair(int node, int cost) {
      this.node = node;
      this.cost = cost;
    }

    // overriding comparison to perform comparison of two object of this class based
    // on their cost in ascending order
    @Override
    public int compareTo(Pair p2) {
      return this.cost - p2.cost; // ascending order cost based sorting
    }
  }

  // TC of Prim's Algorithm = ElogE
  public static void primsAlgo(ArrayList<Edge> graph[], int V) {
    PriorityQueue<Pair> pq = new PriorityQueue<>(); // non-mst
    boolean vis[] = new boolean[V]; // mst
    int mstCost = 0;
    pq.add(new Pair(0, 0)); // starting vertex

    while (!pq.isEmpty()) {
      Pair curr = pq.remove();

      // if the node is unvisited
      if (!vis[curr.node]) {
        vis[curr.node] = true; // mark it visited
        mstCost += curr.cost; // add its cost in the mst cost

        for (int i = 0; i < graph[curr.node].size(); i++) {
          Edge e = graph[curr.node].get(i);
          // if the neighbor of current node is unvisited then
          if (!vis[e.dest]) {
            pq.add(new Pair(e.dest, e.wt)); // add it and cost to react it from curr in pq
          }
        }
      }
    }
    System.out.print("Minimum Cost of Spanning Tree = " + mstCost);
  }

  public static void main(String[] args) {
    int V = 4;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    primsAlgo(graph, V);
  }
}