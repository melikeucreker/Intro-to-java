package day07_GenelTekrar_if_elseif;

public class C01_DATACASTING {
    public static void main(String[] args) {
        //Java'da bazi data turleri asla baska data turlerine cevrilemez.

        /* String st1=false;
           String str2=20;
           boolean bl1='a';
           int sayi='merhaba';
        */
        //ozellikle sayisal data turundeki degerler,baska sayisal data turundeki variable'lara atanabilir.
         double dbl1=23;
         short sh1=12;
         int sayi2=sh1; // daha dar data turundeki degeri daha genis data turune atamaya auto widening denir.Java bunu
       // otomatik yapar.
        sh1=(short) sayi2;
        sayi2=(int) dbl1;
        //daha genis data turundeki degeri,daha dar data turundeki variable'a atamaya explict narrowing denir.Java bunu
        //otomatik yapmaz.Bizden onay ister.
        sayi2='k';
        if(sayi2>'d'){} //char data turundeki degerler,sayisal islemlerde kullanilabilirler.
        //bir char matematiksel islemde kullanilirsa ascii table degerleri ile isleme girer.
        System.out.println('k'+1);//108
        //eger bu degerin char olarak degerini yazdırmak istersek
        //sayisal degerler char'a cast edilebilir.

        System.out.println((char)('k'+1));//l'yi verir.
        dbl1=3987876765d;
        int sayi3=(int)dbl1;
        System.out.println("sayi3:"+sayi3);
        short sh2=(short)dbl1;
        System.out.println("sh2:"+sh2);
        String str5="112";
        short sh3=Short.parseShort(str5);//Wrapper kullandık.NON primitive data turu şeklinde yaptık.

        System.out.println("sh3 un iki kati:"+sh3*2);





    }
}
