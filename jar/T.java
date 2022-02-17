// package example.types;
// java -p example.types main.java

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

// (import T)
// (import T$TT)
// ;;
// (T/f0_static)
// (T/f1_static 1)
// (T/TT/f0_static)
// (T/TT/f1_static 1)
// ;;
// (def t (T.))
// (.f0 user/t)
// (.f0 (T.))
// (.f1 user/t 1)
// (.f1 (T.) 1)
// ;;
// (def tt (T$TT.))
// (.f0 user/tt)
// (.f0 (TT.))

public class T {
    public T() {}
    public T(int x) {}
    public T(int x,int y) {}

    public static int f0_static() {
        System.out.printf("T.f0_static()\n");
        return 1;
    }

    public static int f1_static(int x) {
        System.out.printf("T.f0_static(int)\n");
        return 1;
    }

    public int f0() {
        System.out.printf("T.f0()\n");
        return 1;
    }

    public int f1(int x) {
        System.out.printf("T.f1(int)\n");
        return 1;
    }

    public class TT {
        public TT() {}
        public TT(int x) {}
        public TT(int x,int y) {}

        public static int f0_static() {
            System.out.printf("TT.f0_static()\n");
            return 1;
        }

        public static int f1_static(int x) {
            System.out.printf("TT.f1_static(int)\n");
            return 1;
        }

        public int f0() {
            System.out.printf("TT.f0()\n");
            return 1;
        }

        public int f1(int x) {
            System.out.printf("TT.f1(int)\n");
            return 1;
        }

    }

}

