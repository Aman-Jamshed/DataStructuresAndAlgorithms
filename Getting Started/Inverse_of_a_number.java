import java.util.Scanner;

/*
   2   1   4   3   (value)
  [4] [3] [2] [1]  (position)

  Inverse-> [4] [3] [2] [1]  (position)
             2   1   4   3   (value)

    2 1 4 5 3  -> 2 3 1 5 4              
    P    D  |  P   D                       
    1 -  3  |  1 - 4  = 4* 10^1-1=4                    
    2 -  5  |  2 - 5  = 5* 10^2-1=50                     
    3 -  4  |  3 - 1  = 1* 10^3-1=100
    4 -  1  |  4 - 3  = 3* 10^4-1= 3000
    5 -  2  |  5 - 2  = 4* 10^5-1= 40000
*/

public class Inverse_of_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inv = 0;
        int op = 1;
        while(n!=0){
            int od = n%10;
            int id = op;
            int ip = od;

            //make change to inv using ip and id
            inv = inv + id * (int)Math.pow(10,ip-1);

            n = n/10;
            op++;



        }
        System.out.println(inv);
        scn.close();
    }
    
}
