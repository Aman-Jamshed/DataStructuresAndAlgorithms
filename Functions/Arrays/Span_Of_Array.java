import java.util.Scanner;

public class Span_Of_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements " + n + " of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        int span=max-min;
        System.out.println("The span of array is: ");
        System.out.println(span);

        scn.close();
    }
    
}
