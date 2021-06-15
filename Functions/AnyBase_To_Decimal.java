import java.util.Scanner;
public class AnyBase_To_Decimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();

        int res = baseToDecimal(n,b);
        System.out.println(res);

        scn.close();


    }

    public static int baseToDecimal(int n, int b){
        int rv=0;
        int p=1;
        while(n>0){
            int d = n%10;
            n=n/10;
            rv = rv + p*d;
            p=p*2;
        }

        return rv;
    }
    
}
