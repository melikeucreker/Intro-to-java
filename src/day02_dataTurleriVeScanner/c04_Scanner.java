package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {

        //1.adim:scanner objesi oluşturun.
        //2.adim:kullaniciya ne istediginizi sorun

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");

        //3.adim:girilen bilgiyi icine koyabileciginiz bir variable olusturun
        //olusturdugumuz scanner objesi ile uygun method'u kullanarak bilgi alin.
        String kullaniciIsmi=scan.next();
        System.out.println("Girilen isim:"+kullaniciIsmi);



    }

}
