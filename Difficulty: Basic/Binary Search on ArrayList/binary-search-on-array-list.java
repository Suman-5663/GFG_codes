class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        int n = list.size();
        int low = 0;
        int high = n-1;
        while(low <= high){
           int mid = low + (high-low)/2;
            if(list.get(mid) == k){
                return mid;
            }
            if(list.get(mid) > k){
                 high = mid - 1; 
            }
            else{
                 low = mid+1;
            }
        }
        return -1;
        // If k in arr return 1, else return -1
    }
}