
import java.util.Scanner;

public class whilee {
    public static void main(String[] args) {
        Scanner kut = new Scanner(System.in);
        System.out.println("enter the num");
        int num = kut.nextInt();          //initialization

        //  if(num<=30){
        //      System.out.println("you have entered num more then 30");
        //   }

        if (num <= 30) {
            while (num <= 30) {           //conditin
                if(num==24) {
                    num++;                   // updation
                    continue;

                }
                System.out.println(num);
                num ++;

            }



        }
        else {
            System.out.println("you have enter num more then 30");
        }

        int rum = 100;
        do{ // do will run atleast one time even if the conditon is wrong
            System.out.println(rum);
            rum++;
        } while (rum < 120);


    }
}