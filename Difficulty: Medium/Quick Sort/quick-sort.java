class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low < high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p - 1);
            quickSort(arr,p + 1,high);
        }
        
    }

    private int partition(int[] arr, int low, int high) {
        // code here
     int pivot = arr[high];
     int i = low - 1;
     for(int j = low ; j <= high-1 ; j++){
         if(arr[j] < pivot){
             i++;
             int temp = arr[j];
             arr[j] = arr[i];
             arr[i] = temp;
         }
     }
     int temp = arr[i + 1];
     arr[i + 1] = arr[high];
     arr[high] = temp;
     return i+1;
    }
}