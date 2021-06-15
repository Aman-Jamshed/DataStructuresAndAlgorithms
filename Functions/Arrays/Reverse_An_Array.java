import java.util.Scanner;

public class Reverse_An_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }

        reverse(arr);


        

        for(int val: arr){
            System.out.println(val);
        }



        scn.close();
    }

    public static void reverse(int[] a){

        int i = 0 ;
        int j = a.length-1;

        while(i!=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;

            i++;
            j--;
        }

    }

    
}
