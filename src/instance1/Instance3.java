
//        4.1 Declare two instance and two static variables.
//        4.2 Declare one instance method.
//        4.3 Declare one static method.
//        4.4 Call all four instance and static variables into both instance and static methods inside the
//        print statement.
//        4.5 Declare the Main method.
//        4.6 Call both instance and static methods into the Main method and run the programme.

package instance1;

public class Instance3 {
        int n = 30; //Declared Instance variable
        double m = 40.44;   //Declared Instance variable
        static String name = "Dhriti";  //Declared static variable
        static String name1 = "Patel";   //Declared static variable
        public void m1() //Declared Instance method
        {
            System.out.println(n);  //called Instance Variable Directly
            System.out.println(m);   //called Instance Variable Directly
            System.out.println(name); //called Static Variable Directly
            System.out.println(name1); //called Static Variable Directly
        }
        static void m2( ){
            Instance3 f = new Instance3();    // Declared Static method
            System.out.println(f.n);    //Called Instance Variable to static method using object name
            System.out.println(f.m);    //Called Instance Variable to static method using object name
            System.out.println(name);   //Called static variable to static method Directly
            System.out.println(name1);   //Called static variable to static method Directly
        }
        public static void main(String_1[] args) {
            Instance3 s = new Instance3();
            s.m1();
            m2();
        }

    }
