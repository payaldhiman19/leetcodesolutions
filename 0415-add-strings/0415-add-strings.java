class Solution {
    public String addStrings(String num1, String num2) {
       int n=num1.length();
       int m=num2.length();
       int carry=0;
       int i=n-1,j=m-1;
       StringBuilder ans=new StringBuilder();
       while(i>=0 || j>=0){
            int n1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int sum = n1 + n2 + carry;
        ans.append(sum%10);
        carry=sum/10;
       } 
       //if i completes or j
    //    while(i>=0){
    //     int sum=(num1.charAt(i--)-'0')+carry;
    //     ans.append(sum%10);
    //     carry=sum/10;
    //    }
    //     while(j>=0){
    //     int sum=(num2.charAt(j--)-'0')+carry;
    //     ans.append(sum%10);
    //     carry=sum/10;
    //    }
    if(carry!=0){
        ans.append(carry);
    }
    return ans.reverse().toString();
    }
}