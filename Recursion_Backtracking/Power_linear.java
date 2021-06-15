import java.util.Scanner;


public class Power_linear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();

        int ans = Power(x,n);
        System.out.println(ans);
    }

    public static int Power(int x, int n){

        if(n==0){
            return 1;
        }
        int r = x * Power(x, n-1);

        return r;
    }
    
}
