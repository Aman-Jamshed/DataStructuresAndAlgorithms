public class StringDiffOfEveryTwoConsecutiveChar {
    public static void main(String[] args) {
        String s = "abecd";
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for(int i=1;i<s.length();i++){
            char cur = s.charAt(i);
            char prev = s.charAt(i-1);

            int diff = cur - prev;
            


            sb.append(diff);
            sb.append(cur);

        }
        
        System.out.println(sb.toString());

        

        
    }
    
}
