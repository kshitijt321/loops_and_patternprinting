public class pp_3 {
    public static void main(String[] args) {
     /*   int n = 6;

        for(int row = 1 ; row <= n ; row ++){
            for(int coloum = 1 ; coloum <= n- row ; coloum ++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

      */
        int n = 5 ;
        for (int row =1   ; row <= n ; row ++ ){
            for(int coloum = 1 ; coloum <= n-row +1 ; coloum++ ){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
