class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        Arrays.fill(color,-1);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                q.add(i);
                color[i]=1;
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int ne:graph[node]){
                        if(color[ne]==-1){
                            q.add(ne);
                            color[ne]=1-color[node];
                        }else if(color[ne]==color[node]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}