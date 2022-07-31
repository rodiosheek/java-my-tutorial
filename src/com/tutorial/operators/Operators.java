package com.tutorial.operators;

/**
 * Unary
 * - postfix: i++, i--
 * - prefix:  ++i, --i, +i, -i, ~, !
 * Arithmetic: *, /, %, +, -
 * Shift: <<, >>, >>>
 * Relational: <, >, <=, >=, ==, !=
 * Bitwise:
 * - AND: &
 * - exclusive OR: ^
 * - inclusive OR: |
 * Logical:
 * - AND: &&
 * - OR: &&
 * Ternary: ? :
 * Assignment: =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=
 */
public class Operators {
    public static void run() {
        int x = 10;
        System.out.println("x++ -> " + x++); // 11
        System.out.println("++x -> " + ++x); // 12
        System.out.println("x-- -> " + x--); // 12
        System.out.println("--x -> " + --x); // 10

        // ~ operator -> ~x = (-x) - 1;
        // inverts the bits ie a 0-bit becomes 1-bit and vice versa
        System.out.println("~-1 -> " + ~-1); // 0
        System.out.println("~10 -> " + ~10); // -11
        System.out.println("~-11 -> " + ~-11); // 10
        System.out.println("~-1222 -> " + ~-1222); // 1221
        // !
        System.out.println("!true -> " + !true); // false
        System.out.println("!false -> " + !false); // true

        // Left Shift operator <<
        // is used to shift all bits in a value to the left side
        // x << y = x * 2 ^ y;
        System.out.println("10<<2 -> " + (10 << 2)); // 40
        System.out.println("10*2^2 -> " + shiftPositive(10, 2, "left"));
        System.out.println("10<<3 -> " + (10 << 3)); // 80
        System.out.println("10*2^3 -> " + shiftPositive(10, 3, "left")); // 80
        System.out.println("10<<3 -> " + (20 << 2)); // 80
        System.out.println("20*2^2 -> " + shiftPositive(20, 2, "left")); // 80
        System.out.println("15<<4 -> " + (15 << 4)); // 240
        System.out.println("15*2^4 -> " + shiftPositive(15, 4, "left")); // 240
        System.out.println("1<<1 -> " + (1<<1)); // 240
        System.out.println("1*2^1 -> " + shiftPositive(1, 1, "left")); // 2

        // Right Shift operator >>
        // is used to shift all bits in a value to the right side
        // x >> y = |x / 2 ^ y|;
        System.out.println("10>>2 -> " + (10 >> 2)); // 2
        System.out.println("10 / 2^2 -> " + shiftPositive(10, 2, "right")); // 2
        System.out.println("20>>2 -> " + (20 >> 2)); // 5
        System.out.println("20 / 2^2 -> " + shiftPositive(20, 2, "right")); // 5
        System.out.println("50>>4 -> " + (50 >> 4)); // 3
        System.out.println("50 / 2^4 -> " + shiftPositive(50, 4, "right")); // 3
        // >>> Shit operator
        System.out.println("20>>>2 -> " + (10 >>> 2)); // 2
        System.out.println("-10>>>2 -> " + (-10 >>> 2)); // System.out.println("20>>>2 -> " + (-10 >>> 2));
        System.out.println("50>>>4 -> " + (50 >>> 4)); // 3

        // Logical && and Bitwise &
        // Bitwise & ALWAYS check both condition
        int a1 = 10;
        int b1 = 5;
        int c1 = 20;
        boolean res1 = a1 < b1 && a1++ < c1;
        System.out.println("a < b && a++ < c -> " + res1 + "; a1 = " + a1); // 10

        int a2 = 10;
        int b2 = 5;
        int c2 = 20;
        boolean res2 = a2 < b2 & a2++ < c2;
        System.out.println("a < b & a++ < c -> " + res2 + "; a1 = " + a2); // 11

        // Adding short types
        short a3 = 10;
        short b3 = 10;
        short res3 = (short) (a3 + b3);
    }

    public static int shiftPositive(double num, double times, String direction) {
        double pow = Math.pow(2, times);
        double result = num;
        if (direction.equals("left")) {
            result = num * pow;
        }
        if (direction.equals("right")) {
            result = num / pow;
        }

        return (int)result;
    }
}
