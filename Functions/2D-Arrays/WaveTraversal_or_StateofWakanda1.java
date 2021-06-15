/* WAVE TRAVERSAL
The historic state of Wakanda has various monuments and souvenirs which are visited by many travelers every day. The guides follow a prescribed route of visiting the monuments which improve them understand the relevance of each monument. 

The route of the monument is fixed and expressed in a 2-d matrix where the travelers visit the prescribed next monument. For example

1  2  3
4  5  6
7  8  9

is the prescribed route and the visitors travels this path: 1->2->3->4->5->6->7->8->9

However, a certain visitor decides to travel a different path as follows: 
1. He first travels southwards till no further south places are available.
2. He then moves only 1 place eastwards.
3. He starts to move again towards north till any further north moves are available. 
This continues till all the places are covered. 

For example, the monuments are named as follows:
1  2  3      |     | ---- |
4  5  6      |     |      |
7  8  9      | ___ |      |

Path followed by traveler: 1->4->7->8->5->2->3->6->9

You are required to print the path that this traveler follows to visit all places.


1. You will be given a number n, representing the number of rows.
2. You will be given a number m, representing the number of columns.
3. You will be given n*m numbers, representing elements of 2d arrays.


APPROACH-> What we see here is that columns are incresing everytime(0,1,2) but rows are increasing for even cols(0,2) and 
 decreasing for odd columns(1).
*/




import java.util.Scanner;

public class WaveTraversal_or_StateofWakanda1 {
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

        for(int j=0;j<m;j++){
            if(j%2==0){
                for(int i=0;i<n;i++){
                   System.out.println(arr[i][j]);
                }

            }else{
                for(int i=n-1;i>=0;i--){
                    System.out.println(arr[i][j]);
                }



            }

        }


        scn.close();
    }
    
}
