public class scoping {
   static int sum = 50 ; // ye abb global varibale he to koi bhi function isse acsees kar sakta
    static void table (){
        int num = 20 ;
        //table function ke andar andar hi hum int num ko acsess akr sakte he
        //kyuki humne isse iss function ke andar create kiya he

        System.out.println(sum);
        for(int i = 1 ; i <=10 ; i ++){
            System.out.println(2*i);
        }


    }

    public static void main(String[] args) {
        int num =20;
        // hume int num ko wapis create karna pada coz upar wale int num ka scope
        // table function tak hi rahega

        System.out.println(sum);
    }
}
