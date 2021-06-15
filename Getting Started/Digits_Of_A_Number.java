import java.util.Scanner;

/*
  100|754|7   while n is not equal to zero print quotient and here divisor is equal to no. of digits
  10 |54 |5   in the given original no. so we need to count them first i.e = div= 10^3-1=100 then at each 
  1  |4  |4   step decrease div by 10-> div=div/10;
     |0  |    but here one thing to notice is that in number type of 7600 our code will stop after printing
              7 and 6 will not print 0,0 so we need to change condition to when div is zero instead of n to be zero.
*/
public class Digits_Of_A_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nod=0;
        int temp=n;

        while(temp!=0){
            temp=temp/10;
            nod++;
        }

        int div = (int)Math.pow(10,nod-1);
        while(div!=0){  //here we have change n!=0 to div!=0
            int q=n/div;
            System.out.println(q);
            n=n%div;
            div=div/10;
        }
        





        scn.close();
    }
    
}
