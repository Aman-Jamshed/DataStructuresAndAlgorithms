import java.util.Scanner;
public class Find_Element_In_Array {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        int d = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements " + n + " of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        int idx = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                idx=i;
                System.out.println("Yes the number exists at an index " + idx);
                break;

            }
        }

        if(idx==-1){
        
            System.out.println(idx);
        }
        


        scn.close();
    }
    
}
