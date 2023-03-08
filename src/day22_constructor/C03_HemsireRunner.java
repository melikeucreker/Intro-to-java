package day22_constructor;

public class C03_HemsireRunner {
    public static void main(String[] args) {

        C02_Hemsire hemsire1=new C02_Hemsire();

        System.out.println(hemsire1.isim);//null
        System.out.println(hemsire1.evliMİ);// hiclik
        System.out.println(hemsire1.yas);//0
        System.out.println(hemsire1.izindeMi);//false

        //eger biz hicbir özlelligini belirtmezsek özllikle söylemdiysek,hemsie classında bi deger atanmıssa onu alır
        //paramtrsiz constructor alır.
        //yoksa default olan degerleri alır.

        hemsire1.isim="Tuba";
        hemsire1.yas=29;
        System.out.println(hemsire1.isim);// tuba
        System.out.println(hemsire1.yas);// 29




}
}