package day09_switch_stringmanipulation;

import java.util.Scanner;

public class C01_Switchornk {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ay numarasini giriniz");
        int ayNo= scan.nextInt();
        switch (ayNo){
            case 1: System.out.println("ocak");
                break;

            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("gecersiz ay");
































        }






















    }





}
