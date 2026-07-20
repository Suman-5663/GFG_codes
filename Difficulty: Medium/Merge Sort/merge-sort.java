class Solution {
    public void merge(int arr[],int l,int m,int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int nums1[] = new int[n1]; 
        int nums2[] = new int[n2];
        for(int i = 0; i < n1 ; i++){
            nums1[i] = arr[l + i];
        }
        for(int i = 0; i < n2 ; i++){
            nums2[i] = arr[ m +  1 + i];
        }
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else{
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
    }
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l < r){
            int m = l + (r - l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
}