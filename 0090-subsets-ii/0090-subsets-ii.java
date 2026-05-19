class Solution {
    public void solve(int num[],int index,List<Integer>curr,List<List<Integer>>res){
    res.add(new ArrayList<>(curr));
    for(int i=index;i<num.length;i++){
        if(i>index && num[i]==num[i-1]) continue;
        curr.add(num[i]);
        solve(num,i+1,curr,res);
        curr.remove(curr.size()-1);
    }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}