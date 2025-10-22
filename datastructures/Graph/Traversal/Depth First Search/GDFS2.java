
import java.util.ArrayList;

// Traversal 2 - Depth First Search/Traversal when we have graph in parts

public class GDFS2 {

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

    // First Part -> 0 --- 1 --- 2

    graph[0].add(new Edge(0, 1));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));

    graph[2].add(new Edge(2, 1));

    /*
     * Second Part -> 3 --- 4 --- 5
     * |
     * |
     * 6
     */

    graph[3].add(new Edge(3, 4));

    graph[4].add(new Edge(4, 3));
    graph[4].add(new Edge(4, 5));
    graph[4].add(new Edge(4, 6));

    graph[5].add(new Edge(5, 4));

    graph[6].add(new Edge(6, 4));
  }

  // Depth First Search - TC = O(V + E)
  public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
    System.out.print(curr + " ");
    vis[curr] = true;
    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      if (vis[e.dest] == false) {
        dfs(graph, e.dest, vis);
      }
    }
  }

  public static void main(String args[]) {
    int V = 7;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    boolean vis[] = new boolean[V];
    for (int i = 0; i < V; i++) {
      if (vis[i] == false) {
        dfs(graph, i, vis);
      }
    }
  }
}
