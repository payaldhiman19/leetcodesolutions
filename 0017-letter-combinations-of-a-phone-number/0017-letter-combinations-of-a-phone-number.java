class Solution {
    public void backtrack(String s,String mapping[],int index,StringBuilder curr,List<String>ans){
        if(curr.length()==s.length()){
            ans.add(curr.toString());
            return;
        }
        //extract digit
        char digit=s.charAt(index);
        //letter associated to it
         String letter=mapping[digit-'0'];
         for(char lett:letter.toCharArray()){
            curr.append(lett);
            backtrack(s,mapping,index+1,curr,ans);
            curr.deleteCharAt(curr.length()-1);
         }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return new ArrayList<>();
        }
        String mapping[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       backtrack(digits,mapping,0,new StringBuilder(),ans);
       return ans;
    }
}