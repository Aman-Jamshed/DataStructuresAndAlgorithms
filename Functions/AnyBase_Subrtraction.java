import java.util.Scanner;
public class AnyBase_Subrtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int subtraction=getSub(b,n1,n2);
        System.out.println(subtraction);

        scn.close();
    }

    public static int getSub(int b, int n1, int n2){
        int rv=0;
        int c=0;
        int p=1;

        while(n2>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=0;

            d2 = d2+c;


            if(d2>=d1){
                d=d2-d1;
            }else{
                c=-1;
                d=d2+b-d1;
            }

            rv+= p*d;
            p=p*10;

        }

        return rv;
    }
    
}
