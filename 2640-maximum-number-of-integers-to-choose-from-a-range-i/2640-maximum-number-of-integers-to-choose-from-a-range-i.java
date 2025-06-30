class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
       Set<Integer>set=new HashSet<>();
       int cnt=0;
        for(int i=0;i<banned.length;i++){
         set.add(banned[i]);
        }
        for(int i=1;i<=n;i++){
            if(i<=maxSum &&!set.contains(i)){
                maxSum-=i;
                cnt++;
            }
        }
        return cnt;
    }
}