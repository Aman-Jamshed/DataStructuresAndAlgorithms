import java.util.Scanner;

public class DisplayReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        displayReverseArray(arr, 0);


        scn.close();
    }

    public static void displayReverseArray(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }

        displayReverseArray(arr, idx+1);
        System.out.println(arr[idx]);

    }
    
}
