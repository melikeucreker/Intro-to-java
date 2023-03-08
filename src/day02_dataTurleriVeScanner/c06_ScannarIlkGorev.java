package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class c06_ScannarIlkGorev {
    public static void main(String[] args) {
        //kullancidan biri sayi alin
        // ve sayinin karesini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi girin");
        double girilenSayi=scan.nextInt();
        System.out.println("Girilen sayinin karesi"+girilenSayi*girilenSayi);



    }

}
