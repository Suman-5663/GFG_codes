import java.util.Scanner;

class GFG {
    public static void print_name(int n){
        if(n == 0){
            return;
        }
        System.out.print("GFG ");
        print_name(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
         print_name(n);
    }
}