public class UniqueChar {
    public static String UniqueString(String str){

        String res="";
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(res.indexOf(ch)==-1){
                res+=ch;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str="baba";
        System.out.println(UniqueString(str));
    }
}
