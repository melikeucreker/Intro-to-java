package day09_switch_stringmanipulation;

import java.util.Locale;

public class C04_StringManipulation {
    public static void main(String[] args) {
        String str= "Java Candir";
        // str'i buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str); // Java Candir
        // String manipulation yaptiktan sonra, asil variable'a atama yapilmazsa
        // asil variable degismez
        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDIR
        System.out.println(str.toLowerCase()); // java candir
        // str'i turkce karakterleri gozonunde bulundurarak kucuk harfe cevirin
        str = str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str); // java candır
        System.out.println(str.charAt(1));
    }
}
