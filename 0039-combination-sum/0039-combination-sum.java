class Solution {
    public void sum(int arr[],int index,int target,List<Integer>curr,List<List<Integer>>ans){
      if(index==arr.length){
        if(target==0){
        ans.add(new ArrayList<>(curr));
        }
        return;
      }
      if(arr[index]<=target){
        curr.add(arr[index]);
        sum(arr,index,target-arr[index],curr,ans);
        curr.remove(curr.size()-1);
      }
      sum(arr,index+1,target,curr,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        sum(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
}