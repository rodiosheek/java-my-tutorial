package com.tutorial.datatypes.primitive;

public class Primitives {
    public static void main() {
        // byte
        byte byteValue; // default 0
        // short
        short shortValue; // default 0
        // int
        int intValue; // default 0
        // long
        long longValue; // default 0L
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
