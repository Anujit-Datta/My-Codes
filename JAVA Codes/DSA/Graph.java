
import java.util.*;

public class Graph {
    static Scanner in=new Scanner(System.in);
    static int v,ne;
    

    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createG(ArrayList<Edge> graph[]){
        for(int i=0; i< graph.length; i++){
            graph[i]=new ArrayList<Edge>();
        }
        System.out.println("Enter all Edges[source_vertex  destination_vertex]: ");
        for(int i=0; i<ne; i++){
            int s=in.nextInt(),d=in.nextInt();
            graph[s].add(new Edge(s, d));
        }
    }

    public static void bfs(ArrayList<Edge> graph[]){
        ArrayList<Integer> q=new ArrayList<>(),res=new ArrayList<>();
        boolean vis[]=new boolean[v];
        int curr=graph[1].get(0).src;
        q.add(curr);
        while(!q.isEmpty()){
            q.remove(curr-1);
            res.add(curr); vis[curr]=true;
            if(graph[curr].size()>0){
                for(int i=0; i<graph[curr].size(); i++){
                    if(q.contains(graph[curr].get(i).dest)==false && vis[graph[curr].get(i).dest]==false){
                        q.add(graph[curr].get(i).dest);
                    }
                }
            }
            curr=q.get(curr+1);
        }
    }

    public static void main(String[] args){
        System.out .print("Number of vertices & Edges: ");
        v=in.nextInt();
        ne=in.nextInt();
        ArrayList<Edge> graph[]=new ArrayList[v+1];
        
        createG(graph);
        bfs(graph);
    }
    
}
