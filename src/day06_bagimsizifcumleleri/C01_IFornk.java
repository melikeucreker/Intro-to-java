package day06_bagimsizifcumleleri;

import java.util.Scanner;

public class C01_IFornk {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");
        int yas=scan.nextInt();


        if(yas>=65){System.out.println("Emekli olabilirsiniz");}
        else {System.out.println((65-yas)+" " +" yıl daha çalışmalısınız");}

    }
}
