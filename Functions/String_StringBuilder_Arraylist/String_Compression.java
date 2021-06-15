import java.util.Scanner;

public class String_Compression {

    public static String compression1(String str){
           String s = str.charAt(0) + "";

           for(int i=1;i<str.length();i++){
               char curr = str.charAt(i);
               char prev = str.charAt(i-1);
               if(curr!=prev){
                   s += curr;
               }
           }
           return s;

    }

    public static String compression2(String str){
        String s = str.charAt(0) + "";
        int c = 1;

        for(int i=1;i<str.length();i++){
               char curr = str.charAt(i);
               char prev = str.charAt(i-1);
               if(curr==prev){
                   c++;
               }else{
                   if(c>1){
                         s+=c;
                         c = 1;
                   }
                   s+=curr;
                   
               }
        }
        if(c>1){
                s+=c;
                c = 1;
        }

        return s;


    }





    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        System.out.println(compression1(s));
        System.out.println(compression2(s));

        scn.close();
    }
    
}
