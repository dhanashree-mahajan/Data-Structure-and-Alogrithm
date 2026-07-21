/*  solid Rhombus pattern
    
        * * * * *  4sp 5str
       * * * * *   3   5
      * * * * *    2   5
     * * * * *     1   5
    * * * * *      0   5

 */



public class Rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
