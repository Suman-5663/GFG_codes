class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 != n2){
            return false;
        }
        char []character1 = s1.toCharArray();
        Arrays.sort(character1);
        // String sorted1 = new String(character1);
        char []character2 = s2.toCharArray();
        Arrays.sort(character2);
        // String sorted2 = new String(character2);
        int i=0;
        while(i < n1){
            if(character1[i] != character2[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}