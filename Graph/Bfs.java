import java.util.*;
public class Bfs {

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

     static void createGraph(ArrayList<Edges> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        // Write down the vertex 0,1,2,3,4,5,6
        // for vertex 0
        graph[0].add(new Edges(0, 1, 1)); 
        graph[0].add(new Edges(0, 2, 1)); 

        // for vertex 1
        graph[1].add(new Edges(1, 0, 1)); 
        graph[1].add(new Edges(1, 3, 1)); 

        // for vertex 2
        graph[2].add(new Edges(2, 0, 1)); 
        graph[2].add(new Edges(2, 4, 1));
        
        // for vertex 3
       
        graph[3].add(new Edges(3, 1, 1)); 
        graph[3].add(new Edges(3, 4, 1)); 
        graph[3].add(new Edges(3, 5, 1)); 

        // for vertex 4

        graph[4].add(new Edges(4, 3, 1)); 
        graph[4].add(new Edges(4, 2, 1)); 
        graph[4].add(new Edges(4, 5, 1)); 

        // for vertex 5
        graph[5].add(new Edges(5, 3, 1)); 
        graph[5].add(new Edges(5, 4, 1)); 
        graph[5].add(new Edges(5, 6, 1)); 

        // for vertex 6
        graph[6].add(new Edges(6, 5, 1));    
     }

     public static void bfs(ArrayList<Edges>[] graph){
        Queue <Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edges e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
     }

     public static void dfs(ArrayList<Edges>[] graph,int curr, boolean vis[]) {
        // first time visited
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edges e= graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
         
     }

     public static boolean hasGraph(ArrayList<Edges>[] graph, int src, int dest, boolean vis[]){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edges e= graph[src].get(i);
            if(!vis[e.dest] && hasGraph(graph, e.dest, dest, vis)){
                return  true;
            }
        }
        return false;
     }




     public static void main(String[] args) {
        int V=7;
        ArrayList<Edges> graph[]=new ArrayList[V];
        createGraph(graph);
        // dfs(graph, 0, new boolean[V]);
        System.out.println(hasGraph(graph, 0, 5, new boolean[V]));
     }

    
}
