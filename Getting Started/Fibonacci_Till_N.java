import java.util.Scanner;

public class Fibonacci_Till_N {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int n1=0;
        int n2=1;
        int i=1;
        while(i<=n-2){
            if(n1==0 && n2==1){
                System.out.println(n1 + "\n" + n2);
            }
            int next=n1+n2;
            System.out.println(next);
            n1=n2;
            n2=next;
            i++;
            
        }
        scn.close();
    }
    
}
