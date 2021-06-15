import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }


        for(int i=0; i< a.length;i++){        // Starting point  of subarray
            for(int j=i; j<a.length; j++){     // Ending point of subarray 
                for(int k=i; k<=j;k++){        // Kahan se kahan tak hume chaiye subarray printed like 10, 10 20, 10 20 30 etc
                     System.out.print(a[k] + "  ");
                }
                System.out.println();
            }
        }

        scn.close();
    }
}
