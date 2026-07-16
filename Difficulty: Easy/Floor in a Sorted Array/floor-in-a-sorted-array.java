class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
       int n = arr.length;
       int ans = -1;
        for(int i = 0;i<n;i++){
            if(arr[i] <= x){
                ans = i;
            }
        }
        return ans;
    }
}
