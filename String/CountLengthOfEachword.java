public class CountLengthOfEachword {

    public static void countLengthWord(String str){
        str=str+" ";
        String res="";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                res+=ch;
            }else {
                count=res.length();
                System.out.println(res+" = "+count);
                count=0;
                res="";
            }
        }
    }
    public static void main(String[] args) {
        countLengthWord("Hello World");
    }
}
