
import java.util.ArrayList;
import java.util.Stack;

// Problem 3 - Topological Sorting 
// Approach - modified DFS

public class GProblem3 {

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
    graph[2].add(new Edge(2, 3));
    graph[3].add(new Edge(3, 1));
    graph[4].add(new Edge(4, 0));
    graph[4].add(new Edge(4, 1));
    graph[5].add(new Edge(5, 0));
    graph[5].add(new Edge(5, 2));
  }

  // Function to perform topological sorting (TC = O(V + E))
  public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack) {
    vis[curr] = true;
    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      if (!vis[e.dest]) {
        topSortUtil(graph, e.dest, vis, stack);
      }
    }
    stack.push(curr);
  }

  public static void topSort(ArrayList<Edge> graph[], int V) {
    boolean vis[] = new boolean[V];
    Stack<Integer> stack = new Stack<>();

    // perform topological sort for each unvisited vertex
    for (int i = 0; i < V; i++) {
      if (!vis[i]) {
        topSortUtil(graph, i, vis, stack);
      }
    }

    while (!stack.isEmpty()) {
      System.out.print(stack.pop() + " ");
    }
  }

  public static void main(String args[]) {
    int V = 6;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    topSort(graph, V); // 5 4 2 3 1 0
  }
}
