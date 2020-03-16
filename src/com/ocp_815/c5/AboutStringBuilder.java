package com.ocp_815.c5;

public class AboutStringBuilder {
    private static void print(Object string) {
        System.out.println(string);
    }

    public static void main(String[] args) {

        /* TODO:
            StringBuilder
        */

//        String string_1 = "";
//        for (char current = 'a'; current <= 'z'; current++) {
//            string_1 += current;
//        }
//        print(string_1);    // abcdefghijklmnopqrstuvwxyz | 27 strings were instantiated most of them for GC


//        StringBuilder string_2 = new StringBuilder();
//        for (char current = 'a'; current <= 'z'; current++) {
//            string_2.append(current);
//        }
//        print(string_2);    // abcdefghijklmnopqrstuvwxyz | 1 instance | StringBuffer (it has threads)

        /* TODO:
            append()
        */
//        StringBuilder string_3 = new StringBuilder("start");
//        string_3.append("+middle");
//        string_3.append("+end");
//        print(string_3);            // start+middle+end


        /* TODO:
            chartAt(), indexOf(), length(), and substring()
        */
//        StringBuilder string_4 = new StringBuilder("animals");
//        String string_5 = string_4.substring(string_4.indexOf("a"), string_4.indexOf("al"));
//
//        int len_1 = string_4.length();
//        char ch_1 = string_4.charAt(6);
//        print(string_5 + " " + len_1 + " " + ch_1);     // anim 7 s

        /* TODO:
            insert()
            StringBuilder insert(int offset, String str)
        */
//        StringBuilder string_6 = new StringBuilder("animals");
//        string_6.insert(7, "-");            // animals-
//        string_6.insert(0, "-");            // -animals-
//        string_6.insert(4, "-");            // -ani-mals-
//        print(string_6);


        /* TODO:
            delete() and deleteCharAt()
            StringBuilder delete(int startIndex, int endIndex)
            StringBuilder deleteCharAt(int index)
        */

//        StringBuilder string_7 = new StringBuilder("abcdef");
//        string_7.delete(1, 3);              // adef
//        string_7.deleteCharAt(5);          // exception
//        string_7.delete(1, 1000);           // a (no exception)
//        print(string_7);

        /* TODO:
            replace()
            StringBuilder replace(int startIndex, int endIndex, String newString)
        */
//        StringBuilder string_8 = new StringBuilder("pigeon dirty");
//        string_8.replace(3, 6, "sty");
//        print(string_8);            // pigsty dirty
//
//        string_8.replace(3, 100, "");
//        print(string_8);            // pig
    }
}
