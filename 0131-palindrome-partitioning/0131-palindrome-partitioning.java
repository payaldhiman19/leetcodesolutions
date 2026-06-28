class Solution {
    public boolean pali(String s){
        int i=0;int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public void solve(String s,int index,List<String>path,List<List<String>>ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int end=index;end<s.length();end++){
            String sub=s.substring(index,end+1);
            if(pali(sub)){
                path.add(sub);
                solve(s,end+1,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        solve(s,0,new ArrayList<>(),ans);
        return ans;
    }
}