import java.util.Scanner;

public class Prime_Factorisation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int div=2; div*div<=n; div++){
            while(n%div==0){
                n = n/div;
                System.out.println(div);

            }
        }
        if(n!=1){
            System.out.println(n);
        }


        scn.close();
    }
    
}