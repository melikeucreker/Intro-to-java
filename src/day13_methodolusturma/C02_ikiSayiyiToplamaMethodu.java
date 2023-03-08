package day13_methodolusturma;

import java.util.Scanner;

public class C02_ikiSayiyiToplamaMethodu {
    public static void main(String[] args) {
        //kullanicidan 2 syı alıp toplamları yazdıran bir method olusturun.

        ikiSayiTopla();
        ikiSayiTopla();



    }
    public static void ikiSayiTopla(){

        Scanner scan =new Scanner(System.in);
        System.out.println("toplamak üzere 2 sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("iki sayinin toplami: "+(sayi1+sayi2));















    }




}
