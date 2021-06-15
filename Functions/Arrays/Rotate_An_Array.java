import java.util.Scanner;

public class Rotate_An_Array {

    public static void reverse(int[] a, int i, int j){
        int li = i;
        int ri = j;

        while(li<ri){
            int temp=a[li];
            a[li]=a[ri];
            a[ri]=temp;

            li++;
            ri--;
        }
    }

    public static void rotate(int[] a, int k){
        k = k% a.length;   // if k is greater than the length of array

        if(k<0){
            k = k + a.length;
        }
        // part 1
        reverse(a, 0, a.length-k-1);

        // part 2
        reverse(a, a.length-k, a.length-1);

        // all
        reverse(a, 0, a.length-1);


    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }

        int k = scn.nextInt();

        rotate(arr, k);

        scn.close();

        
    }
    
}
