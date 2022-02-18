// package example.types;
// java -p example.types main.java

// rm -f *.{class,jar}
// javac *.java
// mkdir META-INF && echo "Main-Class: Main" > META-INF/MANIFEST.MF
// jar cfm MainManifest.jar META-INF/MANIFEST.MF *.class
// java -jar MainManifest.jar


import java.lang.*;
import java.util.*;
import java.io.*;
import java.math.*;

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

import static java.lang.System.*;

// without public (import Main) will succeede, but access will raise exception
// note: when class is made public, then filename shall be uppercase
public class Main {
    public static void main(String[] args) {
    // static public void main(String[] args) {
    // static public void main(String args[]) {
    // static public void main() {     // not allowed
        System.out.println("main");

        var app = new Main();
        // app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();

    }

    // (Main/Data)
    // (set! Main/Data 100)
    public static int Data = 4321;

    // (Main/data)
    public static int data() {
        return 1234;
    }

    // (Main/data 1)
    public static int data(int i) {
        return i;
    }

    // (def m (Main.))
    // (.ID m)
    //
    // (set! (.ID m) 1000)
    // (.ID m)
    public int ID = 4321;

    // (.id m)
    public  int id() {
        return 1234;
    }

    // (.id m 1)
    public int id(int i) {
        return i;
    }

    // create from clojure
    public Main() {}

    public void test1() {
        System.out.println("test1\n");

         outer: for(int i=0; i<10; i+=1) {
            System.out.printf("\ni=%d => ", i);
            inner: for(int j=0; j<10; j++) {
                System.out.printf("j=%d, ", j);


                if(i + j >= 18) {
                    break inner;
                }

                if(i + j >= 17) {
                    break outer;
                }

                if(i + j >= 16) {
                    continue inner;
                }

                if(i + j >= 15) {
                    continue inner;
                }
                
                System.out.printf("(%d,%d)\n", i, j);
            }
         }
    }

    public void test2() {
        byte b = 0;
        // b = b + 1;           // compile error => expression b + 1 is of type int
        // b = (byte)b + 1;     // compile error => cast binds with higher precedence
        b = (byte)(b + 1);

        short s = 0;
        // s = s + 1;           // compile error => expression s + 1 is of type int
        // s = (short)s + 1;    // compile error => cast binds with higher precedence
        s = (short)(s + 1);

        // underflow and overflow have defined behaviour

        int i = 127;
        b = (byte)i;
        out.printf("%s\n", b);  // 127

        i = 128;
        b = (byte)i;
        out.printf("%s\n", b);  // -128

        i = 128+128;
        b = (byte)i;
        out.printf("%s\n", b);  // 0

        // float f = 0.1;       // compile error => 0.1 literal of type double
        float f = 0.1f;
        double d1 = 0.1;
        double d2 = 0.1d;
        b = (byte)d2;
        out.printf("%s\n", b);  // 0

        // left and right shift have defined behaviour for int
        //
        // << shift left always inserts 0 from the right
        //
        // shift right in two versions
        // >> sign extends => 1 if negative, 0 if positive
        // >>> inserts 0 from the side left

        //  1 = 0000.0001
        //  0 = 0000.0000
        // -1 = 1111.1111
        // -2 = 1111.1110
        // -3 = 1111.1101
        // -4 = 1111.1100

        // note, that negative and positive numbers are shifted towards 0 with >>
        // >>
        i = -4;
        out.printf("%s\n", i);  // -4
        i >>= 1;
        out.printf("%s\n", i);  // -2
        //
        i = 4;
        out.printf("%s\n", i);  // 4
        i >>= 1;
        out.printf("%s\n", i);  // 2

        // >>>
        i = -4;
        out.printf("%s\n", i);  // -4 == -2**31 + 0b_01111111_11111111_11111111_11111100
        i >>>= 1;
        out.printf("%s\n", i);  // 2147483646 == 0b_01111111_11111111_11111111_11111110
        //
        i = 4;
        out.printf("%s\n", i);  // 4
        i >>>= 1;
        out.printf("%s\n", i);  // 2

        // note, that absolute value increases with <<
        // <<
        i = -4;
        out.printf("%s\n", i);  // -4 == -2**31 + 0b_01111111_11111111_11111111_11111100
        i <<= 1;
        out.printf("%s\n", i);  // -8 == -2**31 + 0b_01111111_11111111_11111111_11111000
        //
        i = 4;
        out.printf("%s\n", i);  // 4
        i <<= 1;
        out.printf("%s\n", i);  // 8

    }

    public void test3() {
    }

    public void test4() {
    }

    public void test5() {
    }

}

