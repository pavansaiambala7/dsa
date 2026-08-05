class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
    List<List<Integer>> adj= new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());}
        boolean[] vis= new boolean[n];
    for(int []edges : invocations){
        int u= edges[0];
        int v=edges[1];
        adj.get(u).add(v);
    } dfs(k,adj,vis);
    for(int []edges :invocations){
        int u=edges[0];
        int v=edges[1];
        if(!vis[u]&&vis[v]){
            for(int i=0;i<n;i++){
                ans.add(i);
            }
            return ans;
        }
        }for(int i=0;i<n;i++){
            if(!vis[i])ans.add(i);
        }
    return ans;
    }
    void dfs(int node, List<List<Integer>>adj,boolean[]vis){
        vis[node]=true;
        for(int edge :adj.get(node)){
            if(!vis[edge]){
                dfs(edge,adj,vis);
    
            }
        }
    }
}