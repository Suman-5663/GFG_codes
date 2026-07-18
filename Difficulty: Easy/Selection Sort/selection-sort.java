class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int min_index = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[min_index] > arr[j])
                    min_index = j;
            }
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
        }
    }
}