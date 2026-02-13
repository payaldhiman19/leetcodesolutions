class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
           if(num1.equals("0") || num2.equals("0"))
            return "0";
        int res[]=new int[n+m];
        //reverse iterate over both strings
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int d1=num1.charAt(i)-'0';
                int d2=num2.charAt(j)-'0';
                int mul=d1*d2;
                int pos1=i+j;
                int pos2=i+j+1;
                 int sum=mul+res[pos2];
                res[pos2]=sum%10;
                res[pos1]+=sum/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int num:res){
            if(!(sb.length()==0 &&num==0)){
                sb.append(num);
            }
        }
        return sb.toString();
    }
}