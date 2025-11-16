import java.util.ArrayList;

// Finding Bridge in graph using Tarjan's algorithm

public class Tarjan {

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
    graph[0].add(new Edge(0, 3));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));

    graph[2].add(new Edge(2, 1));
    graph[2].add(new Edge(2, 0));

    graph[3].add(new Edge(3, 0));
    graph[3].add(new Edge(3, 4));
    graph[3].add(new Edge(3, 5));

    graph[4].add(new Edge(4, 3));
    graph[4].add(new Edge(4, 5));

    graph[5].add(new Edge(5, 3));
    graph[5].add(new Edge(5, 4));
  }

  // Tarjan's algorithm to find bridge in graph
  public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[], int dt[], int low[], int time, int par) {
    vis[curr] = true;
    dt[curr] = low[curr] = ++time;

    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      // Case 1 - if neighbor is parent then do nothing
      if (e.dest == par) {
        continue;
      } // Case 2 - if neighbor is non-parent and non-visited
      else if (!vis[e.dest]) {
        dfs(graph, e.dest, vis, dt, low, time, curr); // then visit it

        low[curr] = Math.min(low[curr], low[e.dest]); // assign lowest discovery time from curr vertex and neighbor vertex in lowest discovery time of curr

        // Check for Bridge existence
        if (dt[curr] < low[e.dest]) {
          System.out.println("Bridge is : " + curr + " ---- " + e.dest);
        }
      } // Case 3 - if neighbor is non-parent but visited
      else {
        // then update curr's lowest discovery time as
        low[curr] = Math.min(low[curr], dt[e.dest]);
      }
    }
  }

  public static void getBridge(ArrayList<Edge> graph[], int V) {
    int dt[] = new int[V]; // discovery time
    int low[] = new int[V]; // lowest discovery time
    int time = 0;
    boolean vis[] = new boolean[V];

    for (int i = 0; i < V; i++) {
      if (!vis[i]) {
        dfs(graph, i, vis, dt, low, time, -1);
      }
    }
  }

  public static void main(String args[]) {
    int V = 6;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    getBridge(graph, V);
  }
}