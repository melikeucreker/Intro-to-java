package day10_stringmanipulation;

public class C02_Contains {
    public static void main(String[] args) {
        String str="Java ogren,isi kap";
        System.out.println(str.contains("Java"));// true
        String s="ka";
        System.out.println(s.contains(s));//ture
        System.out.println(str.contains("a"));//true
        System.out.println(str.contains(" "));//true
        System.out.println(str.contains(""));//true
        System.out.println(str.contains("java"));//false


    }
}
