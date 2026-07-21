public class PalindromeString {

    public static boolean palindromeString(String s){
        String res="";
        for (int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return s.equals(res);
    }
    public static void main(String[] args) {
        String str = "maddd";
        System.out.println(palindromeString(str));
    }
}
