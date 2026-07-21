public class ReverseEachWord {

    public static void reverseword(String str) {
        str = str +" ";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                res += ch;
            } else {
                System.out.println(reverseString(res));
                res="";
            }
        }
    }
    public static String reverseString(String s){
        String res="";
        for (int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "I Love Java";
        reverseword(str);
    }
}
