import java.util.Scanner;

public class Spiral_traversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();


        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        scn.close();

        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = m-1;

        int tne = n*m;
        int cnt = 0;



        while(cnt<tne){
            //left wall
            for(int i=minr, j=minc;i<=maxr && cnt<tne;i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;

            //bottom wall
            for(int i=maxr, j=minc;j<= maxc && cnt<tne;j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;


            // right wall
            for(int i=maxr, j=maxc; i>=minr && cnt<tne ;i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;

            // top wall
            for(int i=minr, j=maxc; j>=minc && cnt<tne; j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;

        }
    }
    
}
