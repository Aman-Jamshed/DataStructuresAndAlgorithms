import java.util.Scanner;

public class Diagonal_Traversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        


        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }


        for(int g=0; g<arr.length;g++){
            for(int i=0, j=g; j<arr.length; i++,j++)
                System.out.println(arr[i][j]);
        }

        scn.close();
    }
    
}
