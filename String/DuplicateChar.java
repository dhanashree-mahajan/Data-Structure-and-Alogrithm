public class DuplicateChar {
    public static String duplicateChar(String str) {
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch)!=str.lastIndexOf(ch)){
                if(res.indexOf(ch)==-1){
                    res+=ch;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(duplicateChar("abacb"));
    }

}
