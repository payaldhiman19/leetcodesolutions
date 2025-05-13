class Solution {
    //you can imagine it as cycle detction in undirected graph
  public boolean dfs(int node,int coloring,int color[],int graph[][]){
    color[node]=coloring;
    for(int neighbour:graph[node]){
        if(color[neighbour]==-1){
            //not colord color it bit with diff color
            if(dfs(neighbour,1-coloring,color,graph)==false){
                return false;
            }
        }else if(color[neighbour]==coloring){
            return false;  //same color
        }
    }
    return true;
  }
    public boolean isBipartite(int[][] graph) {
        int v=graph.length;
        int color[]=new int[v];
        for(int i=0;i<v;i++){
            color[i]=-1;
        }
        for(int i=0;i<v;i++){
            if(color[i]==-1){
                if(dfs(i,0,color,graph)==false){
                    return false;
                }
            }
        }
        return true;
    }
}