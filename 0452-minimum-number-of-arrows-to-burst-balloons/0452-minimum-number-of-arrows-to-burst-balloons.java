class Solution {
    public int findMinArrowShots(int[][] points) {
        //How many groups of overlapping intervals exist?
        //If balloons overlap → one arrow can burst all  If not overlap → need new arrow
        int n=points.length;
        if(points.length==0) return 0;
        // Always shoot arrow at end of balloon
         Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
         int arrow=1;
         int lastposition=points[0][1];
            //if arrowlat>next start same arrow can birts if not new arrow needed and update lastpo also
            for(int i=1;i<n;i++){
                if(lastposition<points[i][0]){
                    arrow++;
                    lastposition=points[i][1];
                }
            }
            return arrow;
    }
}