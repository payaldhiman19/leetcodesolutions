class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        StringBuilder res=new StringBuilder();
        int minlength=Math.min(n,m);
        //jiski length short ha vha tak chalo if dusri bch gyi end me add krdena
        for(int i=0;i<minlength;i++){
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        //for remaining
        if(n>m){
            res.append(word1.substring(minlength));
        }else if(m>n){
            res.append(word2.substring(minlength));
        }
        return res.toString();
    }
}