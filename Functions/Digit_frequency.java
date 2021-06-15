import java.util.Scanner;

public class Digit_frequency {
    public static int getDigitFrequency(int n, int d){

        int count=0;
        while(n!=0){
            int q=n%10;
            if(q==d){
                count++;
            }
            n = n/10;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();

        int f = getDigitFrequency(n, d);
        System.out.println(f);

        scn.close();
    }
    
}
