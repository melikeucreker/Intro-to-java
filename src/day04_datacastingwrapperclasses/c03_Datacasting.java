package day04_datacastingwrapperclasses;

public class c03_Datacasting {
    public static void main(String[] args) {
        int a =20;
        int b=6;
        System.out.println(a/b); //20/6=3
        //java bölünen iki sayi tamsayi ise sonucun da tamsayi kismini verir.
        double c=6;
        System.out.println(a/c); // 20/6=3.3333333335
        //int/double ==>double
        //bölünen sayıların data turleri farklı ise sonucu daha genis olanin cinsinden verir.
        float d =6f;
        System.out.println(a/d); //20/6=3.333333

        //a/b isleminin sonucunu ondalıklı olarak nasıl yazdırabiliriz?
        System.out.println((double) (a/b)); //3.0
        //islem önceligi (a/b) dedir.
        //java öncelikle (a/b) islemini yapar ve sonucu 3 bulur
        //sonra (double) oldugundan 3'ü double'a cast eder.3.0 bulur
        //bölme isleminin double olması için
        //isleme girenlerden birinin double olması gerekir.
        System.out.println((double) a/b); //3.3333333333333335
        System.out.println(a/(double)b ); //3.3333333333333335


    }





}
