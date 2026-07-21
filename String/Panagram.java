
import java.util.Arrays;
import java.util.Scanner;

public class Panagram {

    public static boolean checkPnagram(String str){
        str=str.toLowerCase();
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (res.indexOf(ch) == -1) {
                    res += ch;
                }
            }
        }
        char[] arr = res.toCharArray();
        Arrays.sort(arr);
        return new String(arr).equals("abcdefghijklmnopqrstuvwxyz");



    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println(checkPnagram(str));
    }
}
