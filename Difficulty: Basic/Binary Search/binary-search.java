class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int n = arr.length - 1;
        int left = 0;
        int right = n;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == k){
                return true;
            }
            if(arr[mid] < k){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }
}