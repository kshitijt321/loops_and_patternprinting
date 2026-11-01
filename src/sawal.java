public class sawal {
    public static void main(String[] args) {
        System.out.println("print counting from n to 1 ");


        for(int n = 10; n >= 0 ; n--){
            System.out.println(n );

        }
        System.out.println("  " +
                "  " +
                "  ");

        System.out.println("print the 10 multiples of n ");
        int a;
        for(a= 3; a<= 30 ; a=a+3){
            System.out.println(a);
        }

        System.out.println("  " +
                "  " +
                "  ");

        System.out.println("prime numbers from 1 to 100");

        int b ;
        for (b = 1 ; b <=100 ; b++){
            if(b%2==0){
                continue;
            }
            System.out.println(b);
        }
        System.out.println("  " +
                "  " +
                "  ");

        System.out.println("summ of all the numbers from 1 to n ");
//MOST IMP
        int wow = 0;
        for(int c = 1; c<=10; c++){

           wow = wow + c ; // 0 = 0 + 1 == 1 ( 1 stored in wow ) first itreation
                           // 1 = 1 + 2 == 3 ( 3 stored in wow )
            System.out.println("for showing how each number added up ");
            System.out.println(wow);

        }
        System.out.println("" +
                "" +
                "" );
        System.out.println("for showing direct addtion of 1 to 10 ");
        System.out.println(wow);

        System.out.println("" +
                "" +
                "" );
        System.out.println("divisible by from 50 to 100 ");
        for (int f = 50 ; f<=100 ; f++){
            if(f%7==0){
                System.out.println(f);
            }
        }



    }
}
