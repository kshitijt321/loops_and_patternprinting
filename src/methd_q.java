public class methd_q {
    // method that greets people
  /*  static void greeting (){
        System.out.print("you are very welcome for our event ");
    }

    public static void main(String[] args) {
        greeting();
        System.out.println("kshitj ");
        greeting();
        System.out.println("kutta");
        greeting();
        System.out.println("randu");
    }

   */

    //return
  /*  static  int  add( int a , int b ){

        return a + b ;
    }

    public static void main(String[] args) {
        int sum = add(2,3);
        System.out.println(sum);
    }

   */


    // create a method is even (int num) that returns true if number is even
 /*   static boolean isEven(int num ){

        return num%2==0;// ye return kara result true if 0 , flase if 1

        //not valid
        if (num % 2 == 0 )
        { String e = " true " ; return e ; }
         else { String r = "false"; return r ;

    }

    public static void main(String[] args) {
        boolean ans = isEven(31);
        System.out.println(ans );


    }

  */


    // create a MEthod Get maximum ( int a ,  int b ) that returns larger number

  /*  static int GetMaximum (int a ,   int b ){
        if (a>b){
            return a;
        }
        else{
            return b;
        }


        // ISSE IF ELSE KI JAGAH ASE BHI LIKH SAKTE THE
        // 1) return Math.max(a, b);
        //2) return a > b ? a : b;

    }

    public static void main(String[] args) {
       int ans = GetMaximum(6,3);
        System.out.println(ans);

    }

   */

    static int display (int age ){
        return age ;
    }

    static String  display (String name ){

        return name ;

    }

    public static void main(String[] args) {
        int ans1 = display(21);
        String ans2 = display("kshitj ");
        System.out.println(ans1);
        System.out.println(ans2);

    }
}

