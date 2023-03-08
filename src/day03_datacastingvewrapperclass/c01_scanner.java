package day03_datacastingvewrapperclass;

import java.util.Scanner;

public class c01_scanner {
    public static void main(String[] args) {
        //kullanicidan ismni,soyismini ve yasini alip,asagidaki formatta yazdirin.
        //Isminiz:john
        //Soyisminiz:Doe
        //Yasiniz:44
        //Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Isminizi Giriniz.");
        String kullaniciIsmi=scan.nextLine();
        System.out.println("Lutfen Soyisminizi Giriniz.");
        String kullaniciSoyisim=scan.nextLine();
        System.out.println("Lutfen Yasinizi Giriniz.");
        double kullaniciYasi=scan.nextDouble();
        System.out.println("Isminiz: "+kullaniciIsmi+"\nSoyisminiz:  "+kullaniciSoyisim+"\nYasiniz: "+kullaniciYasi+"\n Kaydiniz basariyla tamamlanmistir.");




    }
}
