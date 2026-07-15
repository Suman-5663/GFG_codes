class Solution {
  public String reverseString(String s) {
        // code here
        int n = s.length();
        if(n<=1){
            return s;
        }
         StringBuilder str = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
};
