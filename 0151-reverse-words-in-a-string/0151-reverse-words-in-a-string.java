class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String word[]=s.split("\\s+"); // it make it like  ---['hello','world','the']
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);   //add one by one word from end
            if(i>0)sb.append(" "); //if not last word add space between 
        }
        return sb.toString();
    }
}