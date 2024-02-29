package fpp;

public class StringMethods {

    static void substringEx(String name) {
        System.out.println(name.substring(0, 3));
        System.out.println(name.substring(0, name.length()));
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(0,0));
    }

    static void indexOfEx(String name) {
        System.out.println(name.indexOf('t'));
        System.out.println(name.indexOf("bert"));
    }

    static void startsWithEx(String name) {
        System.out.println(name.startsWith("Rob"));
        System.out.println(name.startsWith("R"));
        System.out.println(name.startsWith("bert"));
    }

    static void concatenationEx(String name) {
        String space = " ";
        String lastName = "Stevens";
        String fullName = name + space + lastName;
        System.out.println(fullName);
    }

    static void equalsEx(String name) {
        System.out.println(name.equals("Robert"));
        System.out.println(name == "Robert");
        String newName = new String("Robert");
        System.out.println(newName == "Robert");
        System.out.println(newName.equals("Robert"));
    }

    static void compareWords(String str1, String str2) {
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1 == str2);
    }

    static void checkCompareMethod() {
        // a = 97, b = 98, c == 99 ...
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("a"));

    }
    public static void main(String[] args) {
        //String name = "Robert";
        //substringEx(name);
        //indexOfEx(name);
        //startsWithEx(name);
        //concatenationEx(name);
        //equalsEx(name);
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = str4;
        compareWords(str1, str2);
        compareWords(str2, str3);
        compareWords(str3, str4);
        compareWords(str4, str5);

    }
}
