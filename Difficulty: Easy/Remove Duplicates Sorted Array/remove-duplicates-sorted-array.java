class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
         ArrayList<Integer> nums =new ArrayList<>(); 
        int n = arr.length;
        if(n == 0){
            return nums;
        }
        nums.add(arr[0]);
        for(int j = 1 ; j < n ; j++){
            if(arr[j] != nums.get(nums.size()-1)){
                nums.add(arr[j]);
            }
        }
        return nums;
    }
}
