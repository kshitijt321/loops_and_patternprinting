public class pp_15 {
    public static void main(String[] args) {
        int n =5;
        for ( int row =1 ; row <= n ; row ++){
            for(int col =1  ; col<= row ; col ++ ){
                int a = col;
                int b =  'E'; // A - 1 mtlb A ki assci value hogi
                //kuch usme se 1 sub kardiya
                // if assci of A is 97 so it will be 96
                int ans = a + b ;
                // now 1 + 96 -1
                char finalAns  = (char ) ans;
                //type cas ting int into char
                System.out.print(finalAns + " ");
                // pheli row me 96 = A
                // second me 96 and 96 + 1 ( B )
            }
            System.out.println();


        }

    }
}
