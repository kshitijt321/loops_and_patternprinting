public class pattern_printing {
    public static void main(String[] args) {
        System.out.println("solid square ");
        int n = 5;
        for(int row = 1; row <=n ; row++ ){     //OUTER LOOP CONTROL ROWS
            for(int coloum = 1; coloum <=n ; coloum++){  // INNER LOOP CONTROLS WHAT WILL GET PRINTED IN ROWS
                System.out.print("* ");    //USED PRINT SO THAT 5 STAR GET PRINTED IN SAME LINE
            }
            System.out.println(" ");//GAVE SPACE BTW ROWS OR LINES

        }
        System.out.println("" +
                "" +
                "");

// second
        System.out.println("solid rectangle ");
        for(int row = 1 ; row<=3 ; row++){
            for( int coloum = 1 ; coloum <= 5 ; coloum ++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
