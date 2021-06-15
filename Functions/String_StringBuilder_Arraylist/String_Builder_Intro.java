public class String_Builder_Intro {
    public static void main(String[] args) {
        // Declare
        // StringBuilder sb = new StringBuilder("hello");

        // char ch = sb.charAt(0);//set
        // System.out.println(ch);

        // sb.setCharAt(0, 'd');// update
        // System.out.println(sb);

        // sb.insert(2, 'y');// insert
        // System.out.println(sb);

        // sb.deleteCharAt(2);//remove
        // System.out.println(sb);

        // sb.append('g');
        // System.out.println(sb);

        // System.out.println(sb.length());


        //Proof of that StringBuilder is better than String
        // String take o(n^2) time while stringBuilder do it in very small time hence it is better
        // Bcoz it modify the instance at its own address

        int n = 100000;

        long start = System.currentTimeMillis();
        // String s = ""; // n=100000 time = 3227 ms
        // for(int i=0;i<n;i++){
        //     s+=i;
        // }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){  // n=100000 time = 8 ms
                sb.append(i);
        }

        long end = System.currentTimeMillis();
        long duration = end-start;
        System.out.println(duration);
    }
    
}
