import java.util.Scanner;

public class AnyBase_To_AnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int dec = baseToDecimal(n, b1);
        int res = decimalToBase(dec, b2);
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
