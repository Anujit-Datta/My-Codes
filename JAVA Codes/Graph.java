import java.util.*;
class graph1{
    ArrayList<ArrayList<Integer>> graph;
    int nv;
    graph1(int nodes){
        nv=nodes;
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<nv; i++){
            graph.add(new ArrayList<Integer>());
        }
    }
    void add(int v,int u){
        graph.get(v).add(u);
        graph.get(u).add(v);
    } 
    void print(){
        for(int i=0; i<nv; i++){
            System.out.print("Node "+i+": ");
            for(int x:graph.get(i)){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    void dfs(int node,boolean vis[]){
        vis[node]=true;
        System.out.print(node+" ");
        for(int i=0; i<graph.get(node).size(); i++){
            if(vis[graph.get(node).get(i)]!=true){
                dfs(graph.get(node).get(i),vis);
            }
        }
    }
    void bfs(int node){
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] vis=new boolean[nv];
        vis[node] = true;
        queue.add(node);
        while (queue.isEmpty()==false) {
            int x = queue.poll();
            System.out.print(x + " ");
            for (int i: graph.get(x)) {
                if (vis[i]==false) {
                    vis[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
public class Graph {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Number of vertices: ");
        int n=in.nextInt();
        System.out.print("Number of edges: ");
        int e=in.nextInt();
        boolean[] vis=new boolean[n];
        graph1 g=new graph1(n);
       System.out.print("Input Edges: \n");
       for(int i=0; i<e; i++){
           g.add(in.nextInt(), in.nextInt());
       }
       System.out.print("Enter BFS/DFS source: ");
       int s=in.nextInt();
       System.out.print("DFS:");
        g.dfs(s,vis);
        for(int i=0; i<n; i++){
            vis[i]=false;
       }
       System.out.print("\nBFS:");
       g.bfs(s);
       in.close();
    }
}
