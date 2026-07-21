public class MaxLengthOfWord {

    public static String maxLengthWord(String str){
        str=str+" ";
        String res="";
        String max="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                res+=ch;
            }else {
                if(max.length()<res.length()) {
                    max = res;
                    res = "";
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxLengthWord("Helloo Worldddd"));
    }
}
