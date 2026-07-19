class Solution {
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int m = a.length ;
        int n = b.length ;
        int o = c.length ;
        
        int i = 0,j = 0, k = 0 ;
        while(i < m && j < n && k < o){
            if(a[i] <= b[j] && a[i] <= c[k]){
                result.add(a[i]);
                i++;
            }
            else if(a[i] >= b[j] && b[j] <= c[k]){
                result.add(b[j]);
                j++;
            }
            else{
                result.add(c[k]);
                k++;
            }
        }
        while(i < m && j < n){
             if(a[i] > b[j]){
                 result.add(b[j]);
                 j++;
             }
             else{
                 result.add(a[i]);
                 i++;
             }
        }
        while(j < n && k < o){
             if(b[j] < c[k]){
                 result.add(b[j]);
                 j++;
             }
             else{
                 result.add(c[k]);
                 k++;
             }
        }
        while(i < m && k < o){
             if(a[i] < c[k]){
                 result.add(a[i]);
                 i++;
             }
             else{
                 result.add(c[k]);
                 k++;
             }
        }
        while(i < m){
            result.add(a[i]);
            i++;
        }
        while(j < n){
            result.add(b[j]);
            j++;
        }
        while(k < o){
            result.add(c[k]);
            k++;
        }
        return result;
    }
}
