class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int largest = arr[0];
        int second_largest = -1;
        for(int i = 0;i<n;i++){
            if(largest < arr[i]){
                second_largest = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]>second_largest) second_largest=arr[i];
        }
        return second_largest;
    }
}