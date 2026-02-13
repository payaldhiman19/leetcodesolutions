class Solution {
    public String addBinary(String a, String b) { 
        //check in decimal first  by adding digits from back a+b+carry
        //carry=sum/2 and result digit that we stire we will get from sum%2 becoz we are adding binary that why by 2 in end reverse res
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
     while(i>=0 ||j>=0||carry==1){
        int sum=carry; //coz carry nedd to be added
      if(i>=0){
        sum+=a.charAt(i)-'0';
        i--;
      }
       if(j>=0){
        sum+=b.charAt(j)-'0';
        j--;
      }
      res.append(sum%2);
      carry=sum/2;
     }
     return res.reverse().toString();
    }
}