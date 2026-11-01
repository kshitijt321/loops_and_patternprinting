public class call_by_value {
    static int solve(int num){

        System.out.println(num);
        num = num * 10;
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        int num = 5 ;
        System.out.println(num);
        solve(num);
        System.out.println(num);
        // for understaing look at copy 

    }
}
