class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int fib(int k){
        if( k == 0)return 0;
        if( k == 1)return 1;
        return fib(k-1) + fib(k - 2);
    }
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] arr = new int[n];
        for(int i = 0;i < n ; i++){
            arr[i] = fib(i);
        }
        return arr;
    }
}