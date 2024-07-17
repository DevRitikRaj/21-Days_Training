
import java.util.*;

public class Classroom {

    static class Edges {

        int src;
        int dest;
        int wt;

        public Edges(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edges>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        // Traversing the vertex
        graph[0].add(new Edges(1, 0, 5));    // 0-Vertex

        // 1-Vertex
        graph[1].add(new Edges(1, 0, 5));
        graph[1].add(new Edges(1, 2, 1));
        graph[1].add(new Edges(1, 3, 3));

        //For all Neibours
        for (int i = 0; i < graph[1].size(); i++) {
            Edges e = graph[1].get(i);
            System.out.println(e.dest);
            
        }

    }
}
