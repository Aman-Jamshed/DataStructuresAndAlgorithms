import java.util.Scanner;

/**
 * IsPrime
 */
/*
public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0){
            int n = scn.nextInt();
            int c=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println(n + " Is Prime");
            }
            else{
                System.out.println(n + " Is not Prime");
            }
            t--;
            

        }
        scn.close();
    }

    
}
*/

/* 10^9 operations = 1sec        [CPU=3* 10^9 cycle/sec]
  Given constraints- t -> 10^4 , n-> 10^9
  In our program we have 2 loops-> 10^4 + 10^9= 10^13 which is more than 1sec thats why our time exceded
  so we need to manage our code by using any superior algorithm

  --- 24 1*24  24*1     36 1*36     36*1
         2*12  12*2        2*18     18*2
         3*8   8*3         3*36     36*3
         4*6   6*4         4*9  6*6 9*4
    so we need to check upto root n, if number not diveded upto root n then it will not be diveded further by any number
    except itself means agr root n tak koi factor nahi mila n ka then aage bhi nahi milega.
    1 divide every number so no need to check for that we check only fron 2 to root n; if we find any factor in betwen then its 
    its not prime otherwise  prime.
    17-1, {2-root n - not factor}, 17 so prime
    25-1,5,25- not prime
*/

// OPTIMIZED Solution----Now time complexity- t=10^4, n=10^9->root n=10^3 = t+n= 10^7 which is < than 1sec

/*
public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0){
            int n = scn.nextInt();
            int c=0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c==0){
                System.out.println(n + " Is Prime");
            }
            else{
                System.out.println(n + " Is not Prime");
            }
            t--;
            

        }
        scn.close();
    }

    
}
*/

/*More optimized solution-> 
    between 2 to root n, like in 12 no need to check for 3 once we check for 2 and its divisible by 2 so we can say 
    its not prime bcoz it has 3 factors 1,2, itself so its already prime no need to check for others number ryt.
 */

public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0){
            int n = scn.nextInt();
            int c=0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.println(n + " Is Prime");
            }
            else{
                System.out.println(n + " Is not Prime");
            }
            t--;
            

        }
        scn.close();
    }

    
}

/* Two Optimizations- 1) we check from 2 to root n, not upto n bcoz for any number
                  its both factor must be less than or equal to root n not greater than root n
                  pq=n
                  p< root n or equal to root n
                  q< root n or equal to root n
                  if between 2 to root n we are not getting any factor than after root n no factor of that number will exist

                2) if between 2 to root n, at one division we are getting factor than we can say its not prime
                   no need to check for others.
                   as soon as you find the first divisor for the number come out from loop no need to check for others

*/
               
