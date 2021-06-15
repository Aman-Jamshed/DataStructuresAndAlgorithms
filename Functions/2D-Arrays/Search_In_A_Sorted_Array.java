import java.util.Scanner;
public class Search_In_A_Sorted_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        


        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
       

        int x = scn.nextInt();

        scn.close();

        int i=0;
        int j = arr.length-1;

        while(i<arr.length && j>=0){
            if(x==arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(x<arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not Found");

        
    }
    
}
