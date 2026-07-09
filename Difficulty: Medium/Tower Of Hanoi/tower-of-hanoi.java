class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if(n == 0){
            return 0;
        }
        towerOfHanoi(n-1,from,aux,to);
        towerOfHanoi(n-1,to,aux,from);
        return (1 << n) -1;
    }
}