class Solution {
    static void reverse(int arr[],int left,int right){
        int n = arr.length;
        // left = 0;
        // right = n-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    static void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d%n;
        if(d == 0){
            return;
        }
        //left rotation
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
}