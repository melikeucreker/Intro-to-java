package day04_datacastingwrapperclasses;

public class c01_Asciitable {

    public static void main(String[] args) {
        /*
        24==>1100
        a==>97==>10100010
        b==>98
        ahmet
         */
        //char data turundeki variable ve degerler
        //sayisal data turlerine atanirsa veya
        //sayisal data turlerindeki datalarla işleme sokulurlarsa
        //ASCII table'daki degerleri ile isleme girer.
        System.out.println(5+'a');//5+97=102
        char ilkHarf=101;
        System.out.println(ilkHarf);//e
        //kullanicinin verdigi harften bir sonraki harfi yazdirin.
        char girilenchar='f';

        System.out.println(girilenchar+1);//102+1=103
        //biz 103 ü degil 103 ün karsiliği olan char ifadeyi yazdirmak istersek explicit casting yapariz.
        System.out.println("Girilen harfin bir sonrasi:"+(char)(girilenchar+1));//g

        //verilen bir harften 2 önceki harfi yazdırın

        girilenchar='M';
        System.out.println(girilenchar-2);//77-2=75
        System.out.println("Girilen harften 2 önceki harf:"+(char)(girilenchar-2));










    }
}
