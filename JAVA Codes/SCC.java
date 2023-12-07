import java.util.*;

class Solution {
    void dfs(int node, int []vis, ArrayList<ArrayList<Integer>> adj,Stack<Integer> st) {
        vis[node] = 1;
        for (Integer it : adj.get(node)) {
            if (vis[it] == 0) {
                dfs(it, vis, adj, st);
            }
        }
        st.push(node);
    }
    void dfsc(int node, int[] vis, ArrayList<ArrayList<Integer>> adjT) {
        vis[node] = 1;
        System.out.print(node+ " ");
        for (Integer it : adjT.get(node)) {
            if (vis[it] == 0) {
                dfsc(it, vis, adjT);
            }
        }
    }
    
    int scc(int n, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i, vis, adj, st);
            }
        }
        ArrayList<ArrayList<Integer>> adjT = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            adjT.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            vis[i] = 0;
            for (Integer it : adj.get(i)) {
                adjT.get(it).add(i);
            }
        }
        ArrayList<ArrayList<Integer>> sccs=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            sccs.add(new ArrayList<Integer>());
        }
        int ans = 0;
        System.out.println("Results of SCCs: ");
        while (!st.isEmpty()) {
            int node = st.peek();
            st.pop();
            if (vis[node] == 0) {
                ans++;
                System.out.print("SCC-"+ans+": ");
                dfsc(node, vis, adjT);
                System.out.println();
            }
        }
        return ans;
    }
}

class SCC {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Number of vertices: ");
        n=in.nextInt();
        System.out.print("Number of edges: ");
        int e=in.nextInt();
        System.out.println("Input Edges: ");
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adjt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
            adjt.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < e; i++) {
            int u=in.nextInt(); int v=in.nextInt();
            adj.get(u).add(v);
            adjt.get(v).add(u);
        }
        Solution obj = new Solution();
        int ans = obj.scc(n, adj);
        System.out.println("The number of strongly connected components is: " + ans);
        in.close();
    }
}