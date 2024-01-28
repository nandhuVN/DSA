import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private int V; //number of vertices
    private LinkedList<Integer>[] adjList; //Adjacency list representation

    public Main(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjList[i] = new LinkedList<>();
    }

    // Function to add an edge to the graph
    void addEdge(int v, int w) {
        adjList[v].add(w);
    }
// Function for BFS traversal 
    void BFS(int s) {
        boolean[] visited = new boolean[V]; 
        Queue<Integer> queue = new LinkedList<>(); // Create a queue for BFS

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");
            //loop for search the posibilities value nearBy
            for(int neighbor:adjList[s]){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
            
        } 
    }

// main 
public static void main(String args[]){
    Main g=new Main(4);
    g.addEdge(0,1);
    g.addEdge(0,3);
    g.addEdge(1,3);
    g.addEdge(2,0);
    g.addEdge(2,3);
    g.addEdge(3,1);
    System.out.println("starting vertex: ");
    g.BFS(2);
    
}
}
