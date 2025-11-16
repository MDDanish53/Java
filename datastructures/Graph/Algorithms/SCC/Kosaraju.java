import java.util.ArrayList;
import java.util.Stack;

// Strongly Connected Component (SCC) using Kosaraju's Algorithm. TC = O(V+E)

// Steps in Kosaraju's Algorithm
// 1. Get nodes in stack through topological sort. TC = O(V+E)
// 2. Transpose the graph. TC = O(V+E)
// 3. Do DFS according to stack nodes on the transpose graph. TC = O(V+E)

public class Kosaraju {

  static class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
      this.src = src;
      this.dest = dest;
    }
  }

  public static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Edge>();
    }

    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));

    graph[1].add(new Edge(1, 0));

    graph[2].add(new Edge(2, 1));

    graph[3].add(new Edge(3, 4));
  }

  public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
    vis[curr] = true;
    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      if (!vis[e.dest]) {
        topSort(graph, e.dest, vis, s);
      }
    }
    s.push(curr);
  }

  public static void dfs(ArrayList<Edge> transposeGraph[], int curr, boolean vis[]) {
    vis[curr] = true;
    System.out.print(curr + " ");
    for (int i = 0; i < transposeGraph[curr].size(); i++) {
      Edge e = transposeGraph[curr].get(i);
      if (!vis[e.dest]) {
        dfs(transposeGraph, e.dest, vis);
      }
    }
  }

  public static void kosarajuAlgo(ArrayList<Edge> graph[], int V) {

    // Step 1 - Get nodes in stack through topological sort. TC = O(V+E)
    Stack<Integer> s = new Stack<>();
    boolean vis[] = new boolean[V];
    for (int i = 0; i < V; i++) {
      if (!vis[i]) {
        topSort(graph, i, vis, s);
      }
    }

    // Step 2 - Transpose the graph. TC = O(V+E)

    // i - Creating the Transpose graph
    ArrayList<Edge> transposeGraph[] = new ArrayList[V];
    for (int i = 0; i < transposeGraph.length; i++) {
      vis[i] = false; // to use vis[] again for dfs
      transposeGraph[i] = new ArrayList<Edge>();
    }

    // ii - storing transpose of edges of graph in transposeGraph
    for (int i = 0; i < graph.length; i++) { // traversing to all vertices
      for (int j = 0; j < graph[i].size(); j++) { // traversing to all neighbors of curr vertex
        Edge e = graph[i].get(j); // getting edge
        transposeGraph[e.dest].add(new Edge(e.dest, e.src)); // performing edge transpose
      }
    }

    // Step 3 - Do DFS according to stack nodes on the transpose graph. TC = O(V+E)
    while (!s.isEmpty()) {
      int curr = s.pop();
      if (!vis[curr]) {
        dfs(transposeGraph, curr, vis);
        System.out.println();
      }
    }

  }

  public static void main(String args[]) {
    int V = 5;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    kosarajuAlgo(graph, V);
  }
}
