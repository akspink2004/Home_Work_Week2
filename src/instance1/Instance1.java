
//1.1 Declare two instance variables.
  //      1.2 Declare one instance method.
   //     1.3 Call both instance variables into the instance method inside the print
     //   statement. 1.4 Declare the Main method.
       // 1.5 Call the above instance method into the Main method and Run the programme.

package instance1;

public class Instance1{
    int a = 10; //Declared Instance variable
        int b = 20; //Declared Instance variable

     void m1() //Declared Instance method
    {
        System.out.println(a);  //called Instance Variable Directly
        System.out.println(b);  //called Instance Variable Directly


    }

    public static void main(String_1[] args) {
        Instance1 c = new Instance1();
   c.m1();  //Called static method to Static method Directly
        System.out.println(c.a + c.b);
     }
}
