import javafx.beans.binding.StringBinding;

import java.time.ZonedDateTime;
import java.util.*;

public class Hello {
    /**
     * key, value
     *
     * @param args
     */

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Breadth First Traversal for graph"+
                "(starting from vertex 2)");

        g.bfs(2);

        System.out.println("Depth First Traversal for graph"+
                "(starting from vertex 2)");

        g.dfs(2);
    }
}

class Graph {

    int v;
    LinkedList<Integer> adj[];
    boolean[] visited;

    Graph(int V) {
        v = V;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
       visited  = new boolean[v];
    }

    //add edge
    void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    //bfs
    void  bfs(int s) {
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for(int neighbor: adj[vertex]) {
                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }

        }
    }

    //dfs
    void dfs(int s) {

        visited[s] = true;
        System.out.print(s + " ");

        for(int neighbor: adj[s]) {
            if(!visited[neighbor]) {
                dfs(neighbor);
            }
        }

    }
}
