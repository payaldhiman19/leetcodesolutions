class Solution {
    public void solve(List<List<Integer>>ans,List<Integer>curr,int index,int target,int []arr){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
         if(arr[index]<=target){
            //if samller first add then incude 
            curr.add(arr[index]);
            solve(ans,curr,index,target-arr[index],arr);
         //exclude
          curr.remove(curr.size()-1); //backtrack
         }
         solve(ans,curr,index+1,target,arr);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        solve(ans,new ArrayList<>(),0,target,candidates);
        return ans;
    }
}