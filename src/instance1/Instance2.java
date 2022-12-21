//        3.1 Declare one instance and one static variable.
//        3.2 Declare one instance method.
//        3.3 Declare one static method.
//        3.4 Call both instance and static variables into
//         both instance and static methods inside the print statement.
//        3.5 Declare the Main method.
//        3.6 Call both instance and static methods into the Main method and run the programme.
package instance1;

public class Instance2 {
    int n = 30; //Declared Instance variable
    static String name = "Dhriti";  //Declared static variable
   public void m1() //Declared Instance method
    {
        System.out.println(n);  //called Instance Variable Directly
        System.out.println(name); //called Static Variable Directly
    }
static void m2( ){
Instance2 f = new Instance2();    // Declared Static method
    System.out.println(f.n);    //Called Instance Variable to static method using object name
    System.out.println(name);   //Called static variable to static method Directly

}

    public static void main(String_1[] args) {
      Instance2 s = new Instance2();
        s.m1();
        m2();
    }

}
