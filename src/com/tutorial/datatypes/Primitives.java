package com.tutorial.datatypes;

public class Primitives {
    public static void run() {
        // byte
        byte byteValue; // default 0
        System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE); // 127
        System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE); // -128
        // short
        short shortValue; // default 0
        System.out.println("Short.MAX_VALUE: " + Short.MAX_VALUE); // 32767
        System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE); // -32767
        // int
        int intValue; // default 0
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE); // 2147483647
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE); // -2147483648
        // long
        long longValue; // default 0L
        System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE); // -9223372036854775808
        // float
        float floatValue; // default 0.0f
        // double
        double doubleValue; // default 0.0d
        // boolean
        boolean boolValue; // default false
        // char
        char charValue; // default '\u0000'

        // Literals are represented directly in your code without requiring computation
        boolean res = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        // Integer literals
        int decVal = 26; // The number 26, in decimal
        int hexVal = 0x1a; // The number 26, in hexadecimal
        int binVal = 0b11010; // The number 26, in binary
        // Floating-points literals
        double d1 = 123.4;
        // Scientific notation
        double d2 = 1.234e2;
        float f1 = 123.4f;

        // Underscore characters in Numeric literals
        long creditCardNumber = 1234_1234_1234_1234L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long bytes = 0b11010010_01101001_10010100_10010010;
    }
}
