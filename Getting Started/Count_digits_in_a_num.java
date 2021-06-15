import java.util.Scanner;

public class Count_digits_in_a_num {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count=0;

        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        scn.close();
    }
}
