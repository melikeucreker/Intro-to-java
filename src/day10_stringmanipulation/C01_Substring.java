package day10_stringmanipulation;

public class C01_Substring {
    public static void main(String[] args) {
        String str="Java guzeldir.";
        System.out.println(str.substring(5));// burada kücük harflrlr guzeldir yazdirdi
        str=str.toUpperCase(); //manipulation ın kalıcı olması için atama yapmak gerekir.
        System.out.println(str.substring(5));// burada ise buyuk harflerle guzeldir yazdirdi.
        System.out.println(str.substring(5,6));
        System.out.println(str.substring(str.length() - 3));
        System.out.println(str.substring(str.length() - 1));
        str=str.toLowerCase();
        System.out.println(str.substring(str.length() - 1));
        System.out.println(str.substring(0, str.length() - 3));
        System.out.println(str.substring(3, str.length() - 1));//sondan belirlenen index i istersek length kullanabilrz.
        System.out.println(str.substring(2, 3).toUpperCase());
        System.out.println(str.startsWith("java", 0));

    }
}
