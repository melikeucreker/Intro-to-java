package day13_methodolusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 10 dan kucuk iki pozitif tam sayi girin.");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int sonuc = C03_faktoryelMethodu.faktoryelHesapla(sayi1)
                     + C03_faktoryelMethodu.faktoryelHesapla(sayi2);
        System.out.println(sonuc);


    }
}
