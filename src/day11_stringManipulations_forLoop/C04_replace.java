package day11_stringManipulations_forLoop;

public class C04_replace {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println(str.replace('J','H'));//Hava candır
        System.out.println(str.replace("a", ""));//Jv cndir
        System.out.println(str.replace("java", "x"));// x candır
        System.out.println(str.replace("v","yayayaya"));//Jayayayayaa candir

        str.replace("va","lala"); // yapilan degisiklik bu satir icindir
        // yazdirilmadigi icin gormeyiz
        // atama yapilmadigi icin de kalici olmaz

        System.out.println(str);
        System.out.println(str.replaceFirst("a",""));//Jva candir


        // str'daki space'leri yok edin
        str= str.replace(" ","");
        System.out.println(str); //Javacandir

        System.out.println(str.replaceFirst("C", "K")); // JavaKandir









    }
}
