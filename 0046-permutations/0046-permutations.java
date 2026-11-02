class Solution {
    public void solve(int nums[],List<Integer>curr,List<List<Integer>>ans,boolean vis[]){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
     for(int i=0;i <nums.length;i++){
        if(vis[i])continue;
        curr.add(nums[i]);
        vis[i]=true;
        solve(nums,curr,ans,vis);
        curr.remove(curr.size()-1);
        vis[i]=false;
     }

    }
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        solve(nums,new ArrayList<>(),ans,new boolean[n]);
        return ans;
    }
}