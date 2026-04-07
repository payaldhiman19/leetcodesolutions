class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        int tank=0;
        int start=0;
        //greedy problem -- if we need to travel from one staion to another it will be like gas[i]-cost[i]   moving also means we are using cost so that's why differnece
        //if totalcost<totalgas not possible to travel whole 
        //when at any station if it becomes negative, reset to zero coz at current start and next index it will reduce more
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            tank+=gas[i]-cost[i];
            if(tank<0){
                start=i+1;
                tank=0;
            }
        } 
        if(totalgas<totalcost){
            return -1;
        }
        return start;
    }
}