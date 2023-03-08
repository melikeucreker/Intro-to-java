package day03_datacastingvewrapperclass;

import java.util.Scanner;

public class c03_scannr {

    public static void main(String[] args) {
      //kullanicidan bir cemberin yaricapini alip,cevresini ve alanini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricaipini girin.");
        //Kullanicinin girdigi bilgiyi kaydedebilecek data turunde bir variable olusturun.
        //kullanicidan bilgi almak icin scan objesini ve ilgili next methodunu kullanının.

        double yaricap=scan.nextDouble();
        //cevresini ve alanini yazdirin.
        System.out.println("cemberin cevresi:"+2*3.14*yaricap);
        System.out.println("Dairenin alani:"+3.14*yaricap*yaricap);

    }

}
