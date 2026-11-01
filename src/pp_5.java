public class pp_5 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1 ; row <= n ; row ++){
            //space
            for(int coloum = 1 ; coloum <= row-1; coloum ++){
                System.out.print(" ");
            }
            //star
            for(int coloum = 1 ; coloum <= 3* n - 2*row - 3 ; coloum++){
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
}
