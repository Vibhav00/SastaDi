package fieldinjectiono;

import util.BaseClass;
import util.SastaInjection;

public class MyClass extends BaseClass {
    @SastaInjection
    private String myString;

    @SastaInjection
    private int myInt;

    public int getMyInt() {
        return myInt;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
}
