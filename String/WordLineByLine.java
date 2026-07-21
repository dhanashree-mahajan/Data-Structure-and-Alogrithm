public class WordLineByLine {
    public static void wordlineByLine(String str){
        str=str+" ";
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                res+=ch;
            }else {
                System.out.println(res);
                res="";
            }
        }
    }
    public static void main(String[] args) {
        wordlineByLine("Hello World");
    }
}
