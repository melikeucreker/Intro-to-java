package day04_datacastingwrapperclasses;

import java.util.Scanner;

public class c05_sayininrakamlartoplaminibulma {
    public static void main(String[] args) {
        //kullanicidan 3 basamakli bir sayi alin
        //ve sayinin rakamlar toplamini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üc basamaklı bir sayi giriniz.");
        int girilenSayi=scan.nextInt(); //135
        int rakam=girilenSayi%10; // rakam=5
        int rakamlarToplami=rakam; //toplayacagim rakamlardan birisi 5 onu sepetime koydum.
        girilenSayi=girilenSayi/10; // sayi=13 // bize son basamak haric sayiyi verir

        rakam=girilenSayi%10;//rakam=3 // son basamagi zaten bulmustum geriye diger iki basamak kalmıstı onları da
        //buldum modunu aldım.ki son rakamı bulabileyim o da tamam bana 3 ü verdi

        rakamlarToplami=rakamlarToplami+rakam;// rt=8 //sepetimin icine elimde olanları bir koydum 8 buldum
        girilenSayi=girilenSayi/10; //13/10= sayi =1
        rakam=girilenSayi%10;//rakam=1
        rakamlarToplami=rakamlarToplami+rakam;//9




    }
}

