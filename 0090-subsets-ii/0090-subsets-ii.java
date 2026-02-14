class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     Set<List<Integer>>res=new HashSet<>();
     Arrays.sort(nums);
     helper(res,new ArrayList<>(),nums,0);
     return new ArrayList<>(res);
    }
    public void helper(Set<List<Integer>>res,List<Integer>templist,int nums[],int start){
     res.add(new ArrayList<>(templist));
     for(int i=start;i<nums.length;i++){
        //include the numbe in subset
        templist.add(nums[i]);
        //recurssively call other and include them
        helper(res,templist,nums,i+1);
        templist.remove(templist.size()-1);
     }
    }
}