class Solution {
    public int removeDuplicates(int[] nums) {
      //use hasset
      int cnt=0;
      HashSet<Integer>set=new HashSet<>();
      for(int num:nums){
        if(!set.contains(num)){
            set.add(num);
            nums[cnt]=num;
            cnt++;
        }
      }
      return cnt;
    }
}