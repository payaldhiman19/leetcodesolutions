class Solution {
    public String reverseWords(String s) {
         // it make it like  ---['hello','world','the']
       //add one by one word from end
            //if not last word add space between 
        s=s.trim();
        String words[]=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i>0)sb.append(" ");
        }
        return sb.toString();
    }
}