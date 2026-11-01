public class no_void {
    static int add(int a , int b ){//return type int

      int sum = a+b;
        return sum;//mtlb iss function se wapis ( return) to jare ho but jate jate sum lete jao
    }
    public static void main(String[] args) {
        int result = add(10,20);// ye int A + B ke result ko store kara he aur
        // a aur b dono  int he to result bhi int me store hoga
        System.out.println(result);

        // data flow
        //go to main method  java read karna main method se hi start karta he
        //int result
        // int result ke andar ADD function
        // move to add function
        // take values 10 , 20 from from main
        //int sum = 10 + 20
        //return sum = 30 ;
        //move back to main fucntion
        // 30 st0red in int result
        //print 30


      //AGR HUM STATIC INT ADD wale function ko upar ki jagah niche rakte MAIN function ke
      // to bhi koi dikkaat nahi thi


    }
}
