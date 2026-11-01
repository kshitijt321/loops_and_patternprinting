public class return_keyword {
    static void multiadd(int a ,int b){
        System.out.println(a*b);
        return;
      //  System.out.println(a+b);   This is unreachable statement due to return keyword
    }
    public static void main(String[] args) {
        multiadd(4,6);


    }
}
