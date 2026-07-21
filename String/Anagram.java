import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static Boolean checkAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;

    }
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1");
        String str1 = sc.nextLine();
        System.out.println("Enter the String2");
        String str2 = sc.nextLine();
        System.out.println(checkAnagram(str1, str2));

    }

}
