package day04_datacastingwrapperclasses;

import java.util.Scanner;

public class ornk {
    public static void main(String[] args) {
        //kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin.
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt(); //456
        int birlerbasamagi=girilenSayi%10;//6
        System.out.println(birlerbasamagi);
        int rakamlarToplami=birlerbasamagi;//6
        int sonbasamakHaricSayiminTamami=girilenSayi/10;
        System.out.println(sonbasamakHaricSayiminTamami);//45
         int onlarbasamagi=sonbasamakHaricSayiminTamami%10;
        System.out.println(onlarbasamagi);//5
        int sonKisim= sonbasamakHaricSayiminTamami/10;
        System.out.println(sonKisim);//4
        int yüzlerBasamagi =sonKisim;
        rakamlarToplami=birlerbasamagi+onlarbasamagi+yüzlerBasamagi;
        System.out.println(rakamlarToplami); //15
        System.out.println("verilen 3 basamaklı pozitif bir tam sayinin rakamlar toplamı:"+rakamlarToplami);

















    }
}
