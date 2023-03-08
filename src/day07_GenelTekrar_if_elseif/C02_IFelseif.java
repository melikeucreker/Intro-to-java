package day07_GenelTekrar_if_elseif;

import java.util.Scanner;

public class C02_IFelseif {
    public static void main(String[] args) {


       Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz:");

        double not=scan.nextDouble();

        if (not>100 || not<0 ){
            System.out.println("Yanlis not girdinizLütfen tekrar giriniz:");
        } else if (not>=85) {
            System.out.println("Tebrikler AA ile gectiniz.");}

            else if (not>=65){
                System.out.println("Tebrikler BB ile gectiniz.");
            } else if (not>=50) {
            System.out.println("CC ile gectiniz.");
            }
            else {
            System.out.println("DD-> Maalesef kaldınız.");
            }
}
}

