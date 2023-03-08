package day03_datacastingvewrapperclass;

import java.util.Scanner;

public class c02_scanner {
    public static void main(String[] args) {
        //soru5:kullanicidan ismini,soyismini ve yasini alip asagidaki formatta yazdirin.
        //Girilen bilgiler:J Doe, 44
        //İsterseniz tek bir aciklama ile 3 bilgiyi de alabilirsiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi,soyisminizi ve yasinizi giriniz."+"\nHer yeni bilgiden sonra ENTER'a basiniz.");
        char isim=scan.nextLine().charAt(0);
        String soyisim=scan.nextLine();
        double yas=scan.nextDouble();
        System.out.println("Giilen bilgiler :" + isim + " " +soyisim+ "," +" "+ yas);

    }
}
