class Solution {
    public int[][] insert(int[][] intervals, int[] newI) {
      int n=intervals.length;
      List<int[]>res=new ArrayList<>();
      int i=0;
      while(i<n &&intervals[i][1]<newI[0]){
        res.add(intervals[i]);
        i++;
      }  
      //if overlapp
      while(i<n&&intervals[i][0]<=newI[1]){
        newI[0]=Math.min(intervals[i][0],newI[0]);
        newI[1]=Math.max(intervals[i][1],newI[1]);
        i++;
      }
      res.add(newI);
      while(i<n){
        res.add(intervals[i]);
        i++;
      }
      return res.toArray(new int[res.size()][]);
    }
}