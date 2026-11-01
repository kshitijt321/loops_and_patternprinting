public class pp_12 {
    public static void main(String[] args) {
        int n = 4 ;
        for(int row = 1 ; row <= n ; row ++){
            //star
            for (int col =  1; col <= row ; col ++ ){
                System.out.print("* ");
            }

            // hum space ka code yahi type kar rahe he kyuki space hume inhi 4 row
            // me chaiye
            for(int col = 1 ; col <= 2 * (n - row);col++){
                System.out.print("  ");
            }
            // for next star
            for (int col =  1; col <= row ; col ++ ){
                System.out.print("* ");
            }
            System.out.println( );




            }
        int m = 4 ;
        for (int roww = 1 ; roww<=m ; roww++){
            for(int coll = 1 ; coll<=n - roww +1 ; coll++){
                System.out.print("* ");
            }
            for(int coll =1 ; coll<= (roww-1)* 2; coll++){
                System.out.print("  ");
            }
            for(int coll = 1 ; coll<=n - roww +1 ; coll++) {
                System.out.print("* ");
            }
            System.out.println();



        }


        }


    }

