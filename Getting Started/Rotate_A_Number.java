import java.util.Scanner;

public class Rotate_A_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int nod=0;
        int temp=n;
        while(temp!=0){
            nod++;
            temp=temp/10;
        }

        k = k%nod;   //this case will manage greaters number of rotations than nod
        if(k<0){
            k=k+nod;   //this will handle -ve rotations case
        }
        int div=1;
        int mult = 1;


        for(int i=1; i<=nod; i++){
            if(i<=k){
                div=div*10;
            }else{
                mult = mult*10;

            }

        }
        int q=n/div;
        int r= n%div;

        int rot = r*mult + q;
        System.out.println(rot);


        scn.close();
    }
    
}
