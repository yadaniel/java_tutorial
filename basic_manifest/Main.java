// package example.types;
// java -p example.types main.java

// create jar file from class file and run it
//
// jar cf Main.jar Main.class
// java -jar Main.jar
//    will not work, because manifest file is missing => workaround
// java -cp Main.jar Main
//    call main from Main class
//
// mkdir META-INF && echo "Main-Class: Main" > META-INF/MANIFEST.MF
// jar cfm MainManifest.jar META-INF/MANIFEST.MF Main.class
// java -jar MainManifest.jar

// import types wildcard
import java.lang.*;
import java.util.*;
import java.io.*;
import java.math.*;

// import static
import static java.lang.Math.*;
import static java.lang.System.*;

// import type
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Short;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Double;
//
import java.math.BigInteger;
import java.math.BigDecimal;
//
import java.lang.String;
import java.lang.Character;

// without public (import Main) will succeed, but access will raise exception
// note: when class is made public, then filename shall be uppercase
public class Main {
    public static void main(String[] args) {
    // static public void main(String[] args) {
    // static public void main(String args[]) {
    // static public void main() {     // not allowed
        System.out.println("main");

        var app = new Main();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();

    }

    public static int data() {
        return 1234;
    }

    // create from clojure
    public Main() {}
    public Main(int x) {}
    public Main(double x) {}

    public void test1() {
        System.out.println("test1\n");

         outer: for(int i=0; i<10; i+=1) {
            System.out.printf("\ni=%d => ", i);
            inner: for(int j=0; j<10; j++) {
                System.out.printf("j=%d, ", j);
                if(i + j >= 15) {
                    break outer;
                }
            }
         }
    }

    public void test2() {
        System.out.println("test1\n");

        // boolean
        System.out.printf("%b,%b\n", true, false);

        System.out.printf("%d\n", 1234);
        System.out.printf("%x\n", 1234);
        System.out.printf("%X\n", 1234);

        // floating point
        System.out.printf("%f\n", 1.0f);
        System.out.printf("%.2f\n", 1.123d);
        System.out.printf("%e\n", 1.1234567d);
        System.out.printf("%g\n", 1.1234567d);

        // character
        System.out.printf("%c,%c,%c,%c\n", 'A', 'B', 'C', 'D');

        // string
        System.out.printf("%s\n", "12345");
        System.out.printf("%s\n", new String("123456"));
        System.out.printf("%s\n", new String("123456") + 7);    // overloaded +

        // biginteger
        System.out.printf("%d\n", new BigInteger("1"));

        // bigdecimal
        System.out.printf("%1.1f\n", new BigDecimal("111.234567"));     // MissingFormatWidthException when "%0.1f" or "%.1f"
        System.out.printf("%f\n", new BigDecimal("1.234567"));
        System.out.printf("%e\n", new BigDecimal("1.234567"));
        System.out.printf("%g\n", new BigDecimal("1.234567"));

        var tmp = String.format("%d != %d", 1, 2);
        System.out.println(tmp);
    }

    public void test3() {
        var b = Byte.parseByte("123");              // 8 bit
        var s = Short.parseShort("1234");           // 16 bit
        var i = Integer.parseInt("1234");           // 32 bit
        var l = Long.parseLong("1234");             // 64 bit
        var f = Float.parseFloat("1234.5678");      // 32 bit
        var d = Double.parseDouble("1234.5678");    // 64 bit
        var bool = Boolean.parseBoolean("true");
        // var c = Character.parseChar("A");

        System.out.printf("%s == %s\n", Byte.class, Byte.valueOf((byte)1).getClass());
        System.out.printf("%s == %s\n", Integer.class, Integer.valueOf(1).getClass());
        System.out.printf("%s == %s\n", Double.class, Double.valueOf(1.0d).getClass());
        System.out.printf("%s == %s\n", Float.class, Float.valueOf(1.0f).getClass());

        var input = System.in;      // 0
        var output = System.out;    // 1
        var error = System.err;     // 2
    }

    public void test4() {
        var s1 = "1234";
        var s2 = new String("5678");
        var s3 = s1.concat(s2);
        System.out.println(s3);
    }

    // import static
    public void test5() {
        err.printf("sin(0.0f) = %s\n", sin(0.0f));
        err.printf("sin(0.0d) = %s\n", sin(0.0d));
    }

}

