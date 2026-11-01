public class pp_11 {
    public static void main(String[] args) {
        int n = 3 ;
        for ( int row =1 ; row <= n ; row ++ ){
            //space
            for (int col = 1 ; col <= row ; col ++){
                System.out.print("  ");
            }
            if(row == n ){
                System.out.print("   * ");
            }
           else {
                System.out.print(" * ");

                for (int col = 1; col <= 2 *( n -  row) + 1; col++) {
                    System.out.print("  ");
                }
                System.out.print(" * ");
            }



           System.out.println(  "  ");
        }

    }
}
