package day22_constructor;

import day21_arrayList_forEachLoop.C04_KarelerinToplami;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_constructor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String>isimler=new ArrayList<>();

        C04_KarelerinToplami obje = new C04_KarelerinToplami();
        // Her classdan obje olusturabiliriz.
        Random rnd =new Random();
        String str= new String("Ali");

        C02_Hemsire hemsire1=new C02_Hemsire();
        System.out.println(hemsire1.mesaiUcretiHesapla(5)); //100


        // constructor her classın icinde olan ama obje uretmemizi saglayan yöntemdir.
        /*
        Bir obje ancak bir classdan olusturulabilir.
        bir objyi olusturdugumuz class aynı zamanda o objenin data turudur.

        Her obje olusturuldugu classin özelliklerini tasir.
        eger bir programda ortak özlliklr sahip objlr urtmk uzr tasarladginx bir class varsa main mthod sart dgildir.
        bu classlar kalıphan gibi calisir.
        yani o classtan ayni özlliklre sahip objlr urtmmizi saglar.

        biz de istdigimiz paramtrlre sahip,istdigimiz kadar constructor olusturabiliriz.
        Cok ONEMLİ: eger biz bir constructor olusturursak yani class'da gözle görünn bir cons varsa java
        default constructor'i siler.
        bizim olsturdugumuz hicbir constructor'a default constructor denemez.


       */

    }
}
