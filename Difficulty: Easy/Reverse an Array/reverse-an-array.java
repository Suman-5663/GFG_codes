class Solution {
       public void reverseArray(int arr[]) {
           
            reverseHelper(arr, 0, arr.length - 1);
    }
    public void reverseHelper(int arr[],int left,int right) {
        // code here
        int n = arr.length;
        //  left = 0;
        //  right = n - 1;
        if(left > right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseHelper(arr,left + 1,right - 1);
    }
}