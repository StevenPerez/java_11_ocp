package com.ocp_815.c5;

public class AboutString {
    private static void print(Object string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        /* TODO:
            CharAt()
            charAt(int index)
        */

//        String string_1 = "animals";
//        print(string_1.charAt(0)); // a
//        print(string_1.charAt(6)); // s
//        print(string_1.charAt(7)); // throws exception

        /* TODO:
            indexOf()
            int indexOf(int ch)
            int indexOf(int ch, int fromIndex)
            int indexOf(String str)
            int indexOf(String src, int fromIndex)
        */
//        String string_2 = "animals";
//        print(string_2.indexOf('a'));   // 0
//        print(string_2.indexOf("al"));  // 4
//        print(string_2.indexOf('a', 4));   // 4
//        print(string_2.indexOf("al", 5));  // -1

        /* TODO:
            substring()
            String substring(int beginIndex)
            String substring(int beginIndex, int endIndex)
        */
        // |0|a|1|n|2|i|3|m|4|a|5|l|6|s|7|
//        String string_3 = "animals";
//        print(string_3.substring(3));                       // mals
//        print(string_3.substring(string_3.indexOf('m')));   // mals
//        print(string_3.substring(3, 4));                    // m
//        print(string_3.substring(3, 7));                    // mals
//
//        print(string_3.substring(3, 3));                    // empty string
//        print(string_3.substring(3, 2));                    // exception
//        print(string_3.substring(3, 8));                    // exception

        /* TODO:
            equals() and equalsIgnoreCase()
            boolean equals(Object obj)
            boolean equalsIgnoreCase(String str)
        */
//        print("abc".equals("ABC"));                         // false
//        print("ABC".equals("ABC"));                         // true
//        print("abc".equalsIgnoreCase("ABC"));    // true

        /* TODO:
            replace()
            String replace(char oldChar, char newChar)
            String replace(CharSequence target, CharSequence replacement)
        */
//        print("abcabc".replace('a', 'A'));      // AbcAbc
//        print("abcabc".replace("a", "A"));     // AbcAbc

        /* TODO:
            contains()
            String contains(CharSequence charSeq)
        */
//        print("abc".contains("b"));             // true
//        print("abc".contains("B"));             // false

        /* TODO:
            trim(), strip() [includes unicode '\u2000'], stripLeading(), and stripTrailing()
        */
//        String string_4 = " abc\t ";
//        print(string_4.trim().length());                // 3
//        print(string_4.strip().length());               // 3
//        print(string_4.stripLeading().length());        // 5
//        print(string_4.stripTrailing().length());       // 4

        /* TODO:
            String Pool
        */
//        String x_1 = "Hello World";         // String literal
//        String y_1 = "Hello World";         // String literal
//        print(x_1 == y_1);                  // true

        // Note: Strings are immutable

//        String x_2 = "Hello World";         // String literal
//        String y_2 = " Hello World".trim(); // String Computed at runtime
//        print(x_2 == y_2);                  // false
//
//
//        String x_3 = "Hello World";                     // string pool normally
//        String y_3 = new String("Hello World");  // force JVM to create a new string
//        print(x_3 == y_3);                              // false
//
//
//        String x_4 = "Hello World";                              // string pool normally
//        String y_4 = new String("Hello World").intern();         // force JVM to create a new string
//        print(x_4 == y_4);                                      // true


//        String first = "rat" + 1;
//        String second = "r" + "a" + "t" + "1";
//        String third = "r" + "a" + "t" + new String("1");
//
//        print(first == second);             // true
//        print(first == second.intern());    // true
//        print(first == third);              // false
//        print(first == third.intern());     // true
    }
}
