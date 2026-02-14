class Solution {
    public void helper(int start,Set<List<Integer>>res,List<Integer>temp,int nums[]){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            helper(i+1,res,temp,nums);
            //backtrack
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>>res=new HashSet<>();
        Arrays.sort(nums);
        helper(0,res,new ArrayList<>(),nums);
        return new ArrayList<>(res);
    }
}