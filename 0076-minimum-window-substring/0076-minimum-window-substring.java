class Solution {
    public String minWindow(String s, String t) {
        //in s it can hav duplicates character should have minimum t characters
    if(s.length()<t.length()) return "";
    HashMap<Character,Integer>tmap=new HashMap<>();
    for(char ch:t.toCharArray()){
        tmap.put(ch,tmap.getOrDefault(ch,0)+1);
    }
    HashMap<Character,Integer>window=new HashMap<>();
    int left=0;int minlen=Integer.MAX_VALUE; int right=0; int formed=0;
    int start=0; //start of substring
    //requied variable that match the character from 
    int required=tmap.size(); 
    while(right<s.length()){
         char ch=s.charAt(right);
         window.put(ch,window.getOrDefault(ch,0)+1); //increment the count
         // if tmap conatains the characters from string s form window of s string and tmap 
    if(tmap.containsKey(ch)   &&  window.get(ch).intValue()==tmap.get(ch).intValue()){
        //formed one match character
        formed++;
    }
    while(left<=right &&formed==required){
        //if found the valid window shrink it feom left
        char c=s.charAt(left);
if(right-left+1<minlen){
    minlen=right-left+1;  //minimum substring
    start=left;  //start of subtring fromleft
}
window.put(c,window.get(c)-1);    //decrement the cnt of character at left to shrink the window
if(tmap.containsKey(c) &&window.get(c).intValue()<tmap.get(c).intValue()){
    formed--;     //decreemnt as it is smaller
}
left++;
    }
                    // Move the left pointer to the right to try and shrink the window

    right++;
    }
    //start --i its inex
    return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}