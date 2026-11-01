public class pp_2 {
    public static void main(String[] args) {
        int n = 5 ;
        /*    * * * * *
            * * * * *
          * * * * *
        * * * * *
      * * * * *
      so for outer loop
      * row wil go from 1 to 5 as we have to print 5 rows
      * for inner loop
      * n = 5 , row 1 has 4 space and 5 stars
      * n = 5 , row 2 has 3 space and 5 stars
      * n = 5 , row 3 has 2 space and 5 stars
      * n = 5 , row 4 has 1 space and 5 stars
      * n = 5 , row 5 has 0 space and 5 stars
      * so we will divide this into 2 parts ( star part and print part )



         */
        for(int row=  1 ; row <=n ; row++ ){ // outer loop kyuki hum 5 row print karwani


            // space loop formula -> coloum = n - row
            for(int coloum = 1 ; coloum<= n - row; coloum++ ){
                System.out.print(" ");
            }

            // star loop
            for (int coloum = 1; coloum <= n ; coloum++){
                System.out.print("* ");
            }
            //next row me move kRNE  ke lie
            System.out.println(  );
        }
    }
}
