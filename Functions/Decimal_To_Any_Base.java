import java.util.Scanner;

public class Decimal_To_Any_Base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();

        int num = decimalToBase(n, b);
        System.out.println(num);

        scn.close();
    }
    
    public static int decimalToBase(int n, int b){
        int rv=0;
        int p=1;

        while(n>0){
            int d = n%b;
            n=n/b;
            rv=rv+p*d;
            p=p*10;
        }

        return rv;


    }
}
