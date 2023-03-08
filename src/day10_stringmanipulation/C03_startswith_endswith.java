package day10_stringmanipulation;

public class C03_startswith_endswith {
    public static void main(String[] args) {
        String str="Java harika";
        System.out.println(str.startsWith("java"));//false
        System.out.println(str.startsWith("J"));//true
        System.out.println(str.startsWith(str));//true
        System.out.println(str.startsWith(""));//true


        System.out.println("===============");

        System.out.println(str.endsWith("a"));//true
        System.out.println(str.endsWith("ka"));//true
        System.out.println(str.endsWith(str));//true
        System.out.println(str.endsWith(str.substring(str.length()-1)));//true
        System.out.println(str.substring(str.length() - 1));


    }
}
