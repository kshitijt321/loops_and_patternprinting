public class break_loop {
    public static void main(String[] args) {
        for(int i = 1 ; i <=10; i++){
            if(i== 6){
                break;//
            }
            System.out.println(i);//we stooped the loop at 6 by break keyword
            //so java will only print from 1 to 5 and exit from THE CURRENT LOOP
        }
        for(int j = 4 ; j>0; j-- ){
            System.out.println(j);
        }


        //continue
        // MEANS SKIP THE ITREATION break me jiss itreation ko meantion
        //karte uske aage continue nahi karpate where as continue me
        // hum uss itreation ko skip karte


        for(int k= 1 ; k<10; k++){
            if(k==6){
                continue;//ye 6 pe aate hi wapis k++ ( updation ) pe chala jayega to 6 print hi nahi
                //hoga aur skip hojayega

            }
            System.out.println(k);
        }
    }
}
