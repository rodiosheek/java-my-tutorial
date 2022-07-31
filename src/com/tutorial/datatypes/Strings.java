package com.tutorial.datatypes;

import java.util.stream.IntStream;

public class Strings {
    public static void run() {
        String str = new String("Hello");
        System.out.println(str);
        System.out.println("str.equals(\"Hello\") -> " + str.equals("Hello")); // true
        System.out.println("str.equalsIgnoreCase(\"heLlO\") -> " + str.equalsIgnoreCase("heLlO")); // true
        String str1 = "  Hello    ";
        System.out.println("\"  Hello    \" strip -> " + str1.strip()); // Hello
        System.out.println("\"  Hello    \" trim -> " + str1.trim()); // Hello
        System.out.println("\"  Hello    \" stripLeading -> |" + str1.stripLeading() + "|"); // Hello____
        System.out.println("\"  Hello    \" stripTrailing -> |" + str1.stripTrailing() + "|"); // ____Hello
        System.out.println("\"  Hello    \" stripTrailing -> |" + str1.stripIndent() + "|"); // Hello
        System.out.println("str.getBytes(StandardCharsets.UTF_8) -> " + str.getBytes());
        System.out.println("str.getBytes(StandardCharsets.UTF_8) -> " + str.chars());
        IntStream strChars = str.chars();
        strChars.mapToObj(i -> (char) i)
                .forEach(System.out::println);
        String[] strStringArr = str.split("");
        System.out.println("str.split(\"\")" + strStringArr);
        for(String s: strStringArr) {
            System.out.println(s);
        }

        String blankStr = "    ";
        System.out.println("isBlank -> " + blankStr.isBlank()); // true
        System.out.println("isEmpty -> " + blankStr.isEmpty()); // false

        System.out.println(str.getClass()); // class java.lang.String
    }
}
