public class Method_overloading {
    static int add (int a , int b ){
        return a + b;
    }
    static int add (int a , int b ,int c ){
        return a + b+ c ;
    }

    public static void main(String[] args) {
        int ans1 = add(1,2);// ye wali fuction call 2 arguments ke sath he to isne
        //uss function ko call kiya jaha 2 para meters he
        int ans2 = add(1,2,3 );// ye wali fucntion call me 3 arguments he to ismne
        //uss function ko call kiya jisme 3 parameters he
        System.out.println("ans1 "+ ans1);
        System.out.println("ans2  " + ans2);
    }

}
