/*Butterfly pattern
     *             *
     * *         * *
     * * *     * * *
     * * * * * * * *
     * * *     * * *
     * *         * *
     *              *
     
 */


public class Butterflypatt {
    public static void main(String[] var0) {
       int n = 4;

// upper half patt

       for(int i=0 ; i<=n ;i++){
        // star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //space
        int space=2*(n-i);     
           for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         System.out.println();
       }

       //lower half part

       for(int i=n ; i>=1 ;i--){
        // star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //space
        int space=2*(n-i);     
           for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         System.out.println();
       }
       }
 
    }
