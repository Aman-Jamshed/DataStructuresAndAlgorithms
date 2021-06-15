import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("The factorial of " + n + " is " + fact(n));
        scn.close();
    }
    
    public static int fact(int n){

       if(n==0){
           return 1;
       }

       int f = n * fact(n-1);

       return f;
    }
}
