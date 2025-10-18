
// Traversal 1 - Breadth First Search Traversal
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GBFS {
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
    graph[5].add(new Edge(5, 6));
    graph[6].add(new Edge(6, 5));
  }

  // BFS - Breadth First Search Traversal
  public static void bfs(ArrayList<Edge> graph[], int V) {
    Queue<Integer> q = new LinkedList<>(); // Queue to store vertices
    boolean vis[] = new boolean[V]; // Array to track vertex traversal

    q.add(0); // starting traversal from 0th vertex

    while (!q.isEmpty()) {
      int curr = q.remove(); // removing curr from front
      if (vis[curr] == false) { // if we have not traversed the vertex
        System.out.print(curr + " "); // print vertex
        vis[curr] = true; // mark it as traversed

        // adding curr vertex's neighbours in queue
        for (int i = 0; i < graph[curr].size(); i++) {
          Edge e = graph[curr].get(i); // getting each edge of curr
          q.add(e.dest); // adding curr's neighbour in queue
        }
      }
    }
  }

  public static void main(String args[]) {
    int V = 7;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    bfs(graph, V); // 0 1 2 3 4 5 6
  }
}
