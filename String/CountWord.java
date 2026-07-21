public class CountWord {

    public static int countWord(String str){
        str=str+" ";
        String res="";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                res+=ch;
            }else {
                count++;
                res="";
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countWord("Hello World"));
    }

}
