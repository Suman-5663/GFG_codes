class Solution {
    void reverse(int arr[],int left,int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]  = temp;
            left++;
            right--;
        }
    }
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n = arr.length;
        k = k%n;
        if(k == 0){
            return;
        }
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
}