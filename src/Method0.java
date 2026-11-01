public class Method0 {

    //A method must be declared within a class. It is defined with the name of the method,
    // followed by parentheses (). Java provides some pre-defined methods,
    // such as System.out.println(),
    // but you can also create your own methods to perform certain actions:


    static void Mymethod(){   //Create a method inside Main class
        //code to be executed
        System.out.println("hello jello ");
        //myMethod() is the name of the method
        //void means that this method does not have a return value
    }

    static void parameters(String name , int num){
        //Information can be passed to methods as a parameter. Parameters act as variables inside the method.
        //
        //Parameters are specified after the method name, inside the parentheses.
        // You can add as many parameters as you want, just separate them with a comma.

        System.out.println(name + " ticket number "+ num);

    }

    //A Method with If...Else
    static void voteChecker(int age ){
        if( age > 18 ){
            System.out.println("vote ");
        }
        else {
            System.out.println("no vote ");
        }

    }

    //In the previous page, we used the void keyword in all examples (like static void myMethod(int x)),
    // which indicates that the method should not return a value.
    //
    //If you want the method to return a value,
    // you can use a primitive data type (such as int, char, etc.) instead of void,
    // and use the return keyword inside the method:
    static int RetrunValue(int a, int b  ){
        return a + b ;  // we can directly write like this or
      // first we can store int z = a + b ; then return z ;


    }


    public static void main(String[] args) {
        //A method is a block of code which only runs when it is called.
        //
        //You can pass data, known as parameters, into a method.
        //
        //Methods are used to perform certain actions, and they are also known as functions.
        //
        //Why use methods? To reuse code: define the code once, and use it many times.

        //To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
        //
        //In the following example, myMethod() is used to print a text (the action), when it is called:

        Mymethod(); //// Outputs "I just got executed!"
        //A method can also be called multiple times:
        Mymethod();
        Mymethod();

        // parameter
        parameters("rahul",3);
        parameters("sohil",9);
        parameters("yuva",11);


        // if else
        voteChecker(13);
        voteChecker(21);

        // return
        System.out.println( RetrunValue(3,2));


    }
}
