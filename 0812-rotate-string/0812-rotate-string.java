class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
             return false;
        }
        String rotation=s+s;
        return rotation.contains(goal);
    }
}