package day09_switch_stringmanipulation;

import java.util.Scanner;

public class C02_switchGroupOrnek {
    public static void main(String[] args) {


        // Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ay numarasini giriniz");
        int ayNo = scan.nextInt();
        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
            default:
                System.out.println("Ay numarasi yanlis girildi");



































        }

























    }
}
