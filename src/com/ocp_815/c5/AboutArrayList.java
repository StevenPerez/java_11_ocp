package com.ocp_815.c5;

import java.util.ArrayList;
import java.util.List;

public class AboutArrayList {
    private static void print(Object string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        /* TODO:
            add()
            boolean add(E element)
            void add(int index, E element)
            --
            import java.util.*;
            import java.util.ArrayList;
            import java.util.List;
        */

//        var list_1 = new ArrayList<String>();
//        list_1.add("a");
//        for (String s: list_1) print(s);  // a
//
//        var list_2 = new ArrayList<>();
//        list_2.add("a");
//        for (String s: list_2) print(s);  // DOES NOT COMPILE ArrayList<Object>


//        ArrayList list_3 = new ArrayList();
//        list_3.add("hank");                 //[hank]
//        list_3.add(Boolean.TRUE);           //[hank, true]
//        print(list_3);                      //[hank, true]


//        ArrayList<String> list_4 = new ArrayList<>();
//        list_4.add("hank");                 //[hank]
//        list_4.add(Boolean.TRUE);           // DOES NOT COMPILE

//        List<String> list_5 = new ArrayList<>();
//        list_5.add("hank");                 // [hank]
//        list_5.add(1, "robin");        // [hank, robin]
//        list_5.add(0, "blue jay");     // [blue jay, hank, robin]
//        print(list_5);                      // [blue jay, hank, robin]

       /* TODO:
            remove()
            boolean remove(Object object)
            E remove(int index)
        */
//        List<String> list_6 = new ArrayList<>();
//        list_6.add("hank");                  // [hank]
//        list_6.add("hank");                  // [hank, hank]
//        list_6.remove("cardinal");        // false
//        list_6.remove("hank");            // true
//        list_6.remove(0);                 // hank
//        print(list_6);                      // []


       /* TODO:
            set()
            E set(int index, E newElement)
        */
//        List<String> list_7 = new ArrayList<>();
//        list_7.add("hank");                  // [hank]
//        print(list_7.size());                // 1
//        list_7.set(0, "robin");              // [robin]
//        print(list_7.size());                // 1
//        list_7.set(1, "robin");              // IndexOutOfBoundsException


       /* TODO:
            equals()
            boolean equals(Object object)
        */
//        List<String> list_8 = new ArrayList<>();
//        List<String> list_9 = new ArrayList<>();
//        print(list_8.equals(list_9));               // true
//        list_8.add("a");                            // [a]
//        print(list_8.equals(list_9));               // false
//        list_9.add("a");                            // [a]
//        print(list_8.equals(list_9));               // true
//        list_8.add("b");                            // [a, b]
//        list_9.add(0, "b");                    // [b, a]
//        print(list_8.equals(list_9));               // false


       /* TODO:
            Wrapper Classes
        */

//       int primitive_1 = Integer.parseInt("123");
//       Integer wrapper_1 = Integer.valueOf("123");
//
//        int primitive_2 = Integer.parseInt("a");       // throws NumberFormatException
//        Integer wrapper_2 = Integer.valueOf("123.45");   // throws NumberFormatException
    }
}
