public class pp_10 {
    public static void main(String[] args) {
        int n = 4 ;
        for(int row = 1 ; row <= n ; row ++){
            //space for part 1
            for(int col = 1 ; col<=n-row ; col++){
                System.out.print(" ");
            }
            //star for part 1
            System.out.print("*");
            if(row> 1) {
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print(" ");
                }
                System.out.print("* ");
            }
            System.out.println(" ");

        }

    }
}
