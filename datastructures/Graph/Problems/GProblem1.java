import java.util.ArrayList;

// Problem 1 - All Paths from source to target

// For given src & tar, print all paths that exist from src to tar. src = 0, tar = 5

/*  Graph
       1 --- 3 
      /      | \
    0        |  5
     \       | / \
      2 --- 4     6
 */

public class GProblem1 {

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

    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));
    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 3));
    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 4));
    graph[3].add(new Edge(3, 1));
    graph[3].add(new Edge(3, 4));
    graph[3].add(new Edge(3, 5));
    graph[4].add(new Edge(4, 2));
    graph[4].add(new Edge(4, 3));
    graph[4].add(new Edge(4, 5));
    graph[5].add(new Edge(5, 3));
    graph[5].add(new Edge(5, 4));
    graph[6].add(new Edge(6, 5));
  }

  // Function to print all paths from src to tar of a graph - TC = O(V^V)
  public static void printAllPaths(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar) {

    if (curr == tar) {
      System.out.println(path);
      return;
    }

    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      if (!vis[e.dest]) {
        vis[curr] = true;
        printAllPaths(graph, vis, e.dest, path + e.dest, tar);
        vis[curr] = false;
      }
    }
  }

  public static void main(String args[]) {
    int V = 7;
    ArrayList<Edge> graph[] = new ArrayList[V];
    boolean vis[] = new boolean[V];
    createGraph(graph);
    int src = 0, tar = 5;
    printAllPaths(graph, vis, src, "0", tar);
  }
}
