class Solution {
        static final int mod = 1_000_000_007;

    public int countPaths(int n, int[][] roads) {
        List<List<int[]>>adj=new ArrayList<>();
         for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for(int []edge:roads){
            int u=edge[0];
            int v=edge[1];
            int d=edge[2];
            adj.get(u).add(new int[] {v,d});
            adj.get(v).add(new int[]{u,d});
        }
        long dist[]=new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0]=0;
        int ways[]=new int[n];
        ways[0]=1;
        PriorityQueue<long[]>q=new PriorityQueue<>((a,b)->Long.compare(a[1],b[1]));
        q.offer(new long[]{0,0});
        while(!q.isEmpty()){
            long []curr=q.poll();
            int u=(int)curr[0];  //coz this will be the node from where we explore neighbour
            long d=curr[1];
            if(d>dist[u])//if longer path the  skip this
            continue;
            for(int[] neighbor:adj.get(u)){
            int v=neighbor[0];   //v coz this is the node u want to go or is the estonaton node
            int wt=neighbor[1];
            if(dist[u]+wt<dist[v]){
                //if distnce through u is shorter for v 
                dist[v]=dist[u]+wt;
                ways[v]=ways[u];
                q.offer(new long[]{v,dist[v]});
            }
            else if(dist[u]+wt==dist[v]){
                //if found shorter path with same distance
                ways[v]=(ways[v]+ways[u])%mod;
            }
            }
        }
        return ways[n-1];
    }
}