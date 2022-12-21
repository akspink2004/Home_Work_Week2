//        2.1 Declare two static variables
//        2.2 Declare one static method
//        2.3 Call both static variables into the static method inside the print
//        statement. 2.4 Declare the Main method.
//        2.5 Call the static method into the Main method and Run the programme.

package instance1;

public class Static1 {
    static  double c = 25.25d; //Declared static variable
    static String name = "akshit";  //Declared static variable

    void e1()  //Declared Instance method
    {

        System.out.println(c);     //Called static variable to static method Directly
        System.out.println(name);  //Called static variable to static method Directly
    }

    public static void main(String_1[] args) {
        Static1 a = new Static1();

        a.e1();  //Called Instance method to Static method using object name
    }
}
