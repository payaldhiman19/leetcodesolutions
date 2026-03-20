class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        if(n==0)return 0;
        int cnt=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int last=intervals[0][1];
        for(int i=1;i<n;i++){
            if(last>intervals[i][0]){
                cnt++;
            }else{
                last=intervals[i][1];
            }
        }
        return cnt;
    }
}