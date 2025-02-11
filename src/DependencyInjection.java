import contructorinjectioin.MyClassCons;
import fieldinjectiono.MyClass;

public class DependencyInjection {
    public static void main(String[] args) {

        MyClass myObject = new MyClass(); // Auto-initializes itself via util.BaseClass
        MyClassCons myObj = MyClassCons.create(MyClassCons.class);

        // Print values
        System.out.println("myInt: From Field Injection               = " + myObject.getMyInt());    // Output: 143
        System.out.println("myString: From Field Injection            = " + myObject.getMyString()); // Output: 143


        // Print values
        System.out.println("myInt: From Constructor  Injection        = " + myObj.getMyInt());    // Output: 143
        System.out.println("myString: From Constructor  Injection     = " + myObj.getMyString()); // Output: 143
    }
}
