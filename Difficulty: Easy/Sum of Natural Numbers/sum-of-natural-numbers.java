import java.util.Scanner;

class GFG {
    public static int sum(int n){
    if(n == 1){
        return 1;
    }
    if(n == 0){
        return 0;
    }
    
    return sum(n-1)+n;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x = 0;
        int n = sc.nextInt();
        // x+=sum(n);
        System.out.print(sum(n));
        // code here
        
    }
}