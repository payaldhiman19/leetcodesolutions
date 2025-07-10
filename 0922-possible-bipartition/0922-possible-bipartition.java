class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<Integer>[]graph=new ArrayList[n+1];
        //adjanecy list make
        for(int i=1;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int []pair:dislikes){
            graph[pair[0]].add(pair[1]);
            graph[pair[1]].add(pair[0]);
        }
        //step 3: color them different
        int color[]=new int[n+1];
        for(int i=1;i<=n;i++){
            if(color[i]==0){
                //if not colored
                Queue<Integer>q=new LinkedList<>();
                q.add(i);
                color[i]=1;
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int neighbour:graph[node]){
                        if(color[neighbour]==0){
                            color[neighbour]=-color[node];
                            q.add(neighbour);
                        }else if(color[neighbour]==color[node]){
                            return false;
                        }
                    }
                }
            }  
        }
        return true;
    }
}