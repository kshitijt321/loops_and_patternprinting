public class pp_1 {
    public static void main(String[] args) {
        // we had to print
     /*  *
        * *
        * * *
        * * * *
        * * * * *
        to isme n =5 and
        row 1 had 1 star and 4 space
        * row 2 has 2 star and 3 space
        * row 3 has 3 star and 2 space
        * row 4 has 4 star and 1 space
        * row 5 has 5 star and 0 space
        so outer loop ( row loop ) will go from 1-> n ( 5) coz thier are 5 rows
        * as each row has variable coloum data we find formula
        * now row number is equal to no of stars to be printed  ( formula -> row <= coloum)

      */
        int n = 5 ;
        for(int row = 1 ; row<=n ; row++){
            for (int cloloum = 1 ; cloloum <=row ; cloloum++){
                System.out.print("* ");
            }
            System.out.println(  );
        }
    }
}