class Solution {
    public int trailingZeroes(int n) {
        int cnt=0;
        //go until n becomes smaller than 5
        while(n>=5){
            n=n/5;
            cnt+=n;
        }
        return cnt;
            }
}