public class pp_9 {
    public static void main(String[] args) {
        int n = 4 ;
        for(int row =1 ; row <= n ; row ++ ){
            //space
            for(int col = 1 ; col <= n-row ; col++ ){
                System.out.print("  " );
            }
            //star
            for (int col = 1; col <= 2* row - 1; col ++ ){
                System.out.print("* ");
            }
            System.out.println();

        }
        int m = 3;
        for (int roww = 1 ; roww  <= m; roww ++  ){
            //space for part 2
            for(int coll = 1 ; coll <= roww; coll ++){
                System.out.print("  ");
            }
          //  star for part 2
            for (int coll = 1 ; coll <=3*m- 2*roww -2 ; coll++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
