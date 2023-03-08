package day04_datacastingwrapperclasses;

import java.util.Scanner;

public class c02_asciitable {
    public static void main(String[] args) {
        //soru2-kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen bir harf giriniz");
        char girilenHarf=scan.next().charAt(0);
        System.out.println("Girilen harf:"+girilenHarf+ "\nGirilen harften sonraki 3 harf:"+
                        (char) (girilenHarf+1) + " " +(char)(girilenHarf+2) + " " +  (char)(girilenHarf+3)  );


    }
}
