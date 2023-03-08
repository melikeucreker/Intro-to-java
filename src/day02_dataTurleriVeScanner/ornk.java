package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class ornk {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");
        String kullaniciAdi=scan.next();
        System.out.println("isminiz:"+kullaniciAdi);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("lütfen soyisminizi giriniz");
        String kullaniciSoyismi=scan2.next();
        System.out.println("soyisminiz:"+kullaniciSoyismi);

        Scanner scan3=new Scanner(System.in);
        System.out.println("lütfen yasinizi giriniz");
        int yas=scan3.nextInt();
        System.out.println("yasiniz:"+yas);
        System.out.println("adiniz:"+" " + kullaniciAdi+" " + "soyadiniz:"+" " + kullaniciSoyismi + " " + "yasiniz:"+" "+yas);


    }
}
