package day07_GenelTekrar_if_elseif;

import java.util.Scanner;

public class C03_ifelseif {
    public static void main(String[] args) {
        //kullanicidan pozitif bir tam sayi alin.
        //sayi 3 ile bolunebiliyorsa "3 ün kati"
        //sayi 5 ile bolunebiliyorsa "5 in kati"
        // sayi hem 3 ile bölünebiliyor hem de 5 ile bölünebiliyorsa "3 ve 5'in katı"
        //her ikisine de bölünemiyorsa ne 3'ün ne de 5 'in katı yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayi girin:");
        int sayi=scan.nextInt();
        if(sayi%3==0 && sayi%5==0){
            System.out.println("\"3 ve 5'in katı\"");
        } else if (sayi%5==0) {
            System.out.println("\"5 in kati\"");
        } else if (sayi%3==0) {
            System.out.println("\"3 ün kati\"");

        }
        else {
            System.out.println("ne 3'ün ne de 5 'in katı");
        }


    }
}
