class Solution {
    public void subsets(List<List<Integer>>res,List<Integer>temp,int []nums,int target,int index){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        //exclude
        //if curernt value is smaller than or equal to target
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1])continue;
            if(nums[i]<=target){
                temp.add(nums[i]);
                //recurssive call
                subsets(res,temp,nums,target-nums[i],i+1);
                //undo --backtrack
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>>res=new ArrayList<>();
      Arrays.sort(candidates);
      subsets(res,new ArrayList<>(),candidates,target,0);
      return res;  
    }
}