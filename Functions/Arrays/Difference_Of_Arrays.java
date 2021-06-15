import java.util.Scanner;
public class Difference_Of_Arrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter elements " + n1 + " of array: ");
        for(int i=0;i<a1.length;i++){
            a1[i]= scn.nextInt();
        }

        System.out.println("Enter size of second array: ");
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter elements " + n2 + " of array: ");
        for(int i=0;i<a2.length;i++){
            a2[i]= scn.nextInt();
        }

        int[] diff= new int[n2];
        int c = 0;

        int i= a1.length -1;
        int j= a2.length -1;
        int k= diff.length -1;

        while(k>=0){
            int d=0;
            int a1v = i>=0? a1[i]:0;

            if(a2[j]+c >= a1v){
                d = a2[j]+c - a1v;
                c=0;

            }else{

                d= a2[j]+c+10 - a1v;
                c=-1;


            }

            diff[k]= d;

            i--;
            j--;
            k--;
        }

        int idx=0;
        while(idx<diff.length){
            if(diff[idx]==0){
                idx++;
            }else{
                break;
            }
        }
        System.out.println("The idx is " + idx);

        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }


        scn.close();
    }
    
}
