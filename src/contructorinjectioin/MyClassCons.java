package contructorinjectioin;

import util.BaseClassTwo;
import util.SastaConstructorInjection;

public class MyClassCons extends BaseClassTwo {
    private final String myString;
    private final int myInt;

    // Constructor with @SastaConstructorInjection annotations
    public MyClassCons(@SastaConstructorInjection String myString, @SastaConstructorInjection int myInt) {
        this.myString = myString;
        this.myInt = myInt;
    }

    // Getters
    public int getMyInt() {
        return myInt;
    }

    public String getMyString() {
        return myString;
    }
}