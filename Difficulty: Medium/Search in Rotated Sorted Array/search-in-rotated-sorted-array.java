class Solution {
    int search(int[] arr, int key) {
        // code here
        int left =0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[left] == arr[mid] && arr[mid] == arr[right]){
                left++;
                right--;
                continue;
            }
            if(arr[mid] >= arr[left]){
                if(arr[left] <= key && arr[mid] > key){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if(arr[mid] < key && arr[right] >= key){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}