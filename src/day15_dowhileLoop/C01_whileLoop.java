package day15_dowhileLoop;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {
        //while loop kullanarak kullanicdan alinan sayinin rakamlar toplamını bulun
        Scanner scan=new Scanner(System.in);

        System.out.println("Rakamlari toplanacak pozitif tamsayi giriniz:");
        int girilenSayi= scan.nextInt();

        int sayi= girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;


        while(sayi>0){

            birlerBasamagi= sayi%10;
            rakamlarToplami +=birlerBasamagi;
            sayi /=10;

        }

        System.out.println("Girilen " + girilenSayi +"'nin rakamlar toplami : " + rakamlarToplami);












    }

















}
