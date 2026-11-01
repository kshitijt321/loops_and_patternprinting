

public class no_void_2 {


  static  int add (int a , int b){
        System.out.println("heelo");


                 int sum =  a+b;
        System.out.println("kshitj");

         return sum;

    }
    static void solve  (){
        System.out.println("hey again ");
        int ans = add(3,5);
        System.out.println(ans );
        System.out.println("bye ");
    }


    public static void main(String[] args) {
        System.out.println("hey 3 ");
        solve(); // agr me yaha pe slove function ko call nahi karta to
        //kbel HEY 3 AUR BYE 2 PRINT hota baki dono function useless rhete coz they are not called
        System.out.println("bye 2");

    }
}
