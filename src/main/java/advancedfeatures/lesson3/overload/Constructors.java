package advancedfeatures.lesson3.overload;

import com.sun.org.apache.xerces.internal.impl.xs.util.XInt;
import com.sun.org.apache.xerces.internal.impl.xs.util.XIntPool;

import java.util.concurrent.LinkedTransferQueue;

public class Constructors {

    private int num = 0;
    private String text = "";

    public Constructors() {
    }

    public Constructors(int num) {
        this();     //chained constructor - calls Constructor()
        this.num = num;
    }

    public Constructors(int num, String text) {
        this(num);     // chained constructor, paprastai savyje kviecia konstruktoriu, turinti maziau parametru
        this.text = text;

    }

    public Constructors(int num2, String otherText, int num3) {
        this(num2, otherText);
        this.num += num3;
    }

}
