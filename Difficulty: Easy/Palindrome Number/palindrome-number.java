class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int absolute = Math.abs(n);
        int original = absolute;
        int new_number =0;
        while(absolute > 0){
            int num = absolute % 10;
            absolute/=10;
            new_number = new_number*10+num;
        }
        return original == new_number;
    }
}