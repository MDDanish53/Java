
import java.util.ArrayList;

// Problem 2 - Cycle detection in Directed Graph using DFS

public class GProblem2 {

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
    graph[1].add(new Edge(1, 0));
    graph[2].add(new Edge(2, 3));
    // graph[3].add(new Edge(3, 0));
  }

  // function to check presence of cycle in directed graph. TC = O(E + V)
  public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
    vis[curr] = true;
    rec[curr] = true;

    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      // if the neighbor of current vertex is in the recursion stack i.e rec[]
      if (rec[e.dest]) {
        return true; // cycle detected in the graph
        // if the neighbor of current vertex is not visited
      } else if (!vis[e.dest]) {
      } // visit the neighbor and check presence of cycle there
      if (isCycleDirected(graph, vis, e.dest, rec)) {
        return true; // cycle detected in the graph
      }
    }
    rec[curr] = false;
    return false;
  }

  public static void main(String args[]) {
    int V = 4;

    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    boolean vis[] = new boolean[V];
    boolean rec[] = new boolean[V];
    for (int i = 0; i < V; i++) {
      // check cycle presence from all the vertices
      if (!vis[i]) {
        boolean isCycle = isCycleDirected(graph, vis, 0, rec);
        if (isCycle) {
          System.out.print(isCycle);
          break;
        } 
      }
    }
  }
}
