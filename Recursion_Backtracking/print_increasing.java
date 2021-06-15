import java.util.Scanner;
public class print_increasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pi(n);
        scn.close();
    }
    
    public static void pi(int n){
        if(n==0){
            return;
        }
        pi(n-1);
        System.out.println(n);

        

    }
    
}
