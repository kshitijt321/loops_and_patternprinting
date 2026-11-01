public class no_parameter {
    static void fullName(){// () BRACKETS KE ANDAR EMPTY HE SO FUNC haas no parameter
        String firstName = "Kshitij ";
        String middleName = " ";
        String lastName = "Thakur ";
        System.out.println(firstName+middleName+lastName);
    }
    static void add (int x , int y ){//parameter given
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        System.out.print(" hi i am ");
        fullName();
        System.out.println(" i am 21 years old ");

        add(5,9); //argument given by uss



    }
}
