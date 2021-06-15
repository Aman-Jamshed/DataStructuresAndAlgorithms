import java.util.Scanner;

public class Intro2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //String s1 = "hello";
        // String s1 = scn.nextLine();//read spaces
        // String s2 = scn.next();// not read space
        // System.out.println(s1);
        // System.out.println(s2);
        // String s = scn.nextLine();
        // System.out.println(s);
        // System.out.println(s.length());

        // char ch = s.charAt(0);
        // System.out.println(ch);
        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     System.out.println(ch);
        // }
        
        // s.charAt(0)='z'; won't work

        // String s = "abcd";
        // System.out.println(s.substring(1,3));
        // System.out.println(s.substring(1));

        // for(int i=0;i<=s.length()-1;i++){
        //     for(int j=i+1; j<=s.length();j++){
        //         System.out.println(s.substring(i,j));
        //     }
        // }

        // String s1 = "hello";
        // s1 += ' ';
        // s1 += 'w';
        // s1 += 'w';
        // s1 += 10;
        // String s2 = "world";
        // String s3 = s1 + " " + s2;
        // System.out.println(s1 + 10 + 20);
        // System.out.println(10 + 20+ s1);

        String s = "abc def ghi klm mno";
        String[] parts = s.split(" ");
        for(int i=0; i<parts.length;i++){
            System.out.println(parts[i]);
        }






        scn.close();
    }
    
}
