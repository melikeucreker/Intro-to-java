package day04_datacastingwrapperclasses;

public class c04_WrapperClasses {
    public static void main(String[] args) {
        /* Non primitive data turlerinin hazir methodları varken primitive lerin yoktur.
        java pirimitive data turleri icin kolayca gecis yapabilmek icin non-primitive data turleri olsuturmuştur.

        int==> Integer
        char==> Character
        byte ==>Byte
        boolean ==>Boolean
        */
        Integer sayi=10;
        //int variable'a atadigimiz degerleri atayabiliyoruz
        //arti olarak hazir method'ları var
        //variable olusturmadan da bazi methodları kullanabiliyoruz.

        System.out.println(Integer.MIN_VALUE);// -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647

        String sonucstr="345";
        System.out.println(sonucstr+10);//34510 cünkü string bir degerde matematiksel islm olmaz yanyana yazdırır sadece
        //bu degere 10 ekle

        //int sonuc=(int)sonucstr; primitive cevirmedi burada wrapperlar devreye girer.

        int sonuc=Integer.parseInt(sonucstr);
        System.out.println(sonuc+10);//355
        sonuc=Integer.valueOf(sonucstr);
        System.out.println(sonuc+10);//355

        //Stringin sayisal degerler icerdigini biliyorsak bunu parseInt ve valueof ile Integer bir degere cevirebiliriz.
        //Testerlar en cok parsInt i kullanıyor.

         char krk='3';
        System.out.println(Character.isDigit(krk)); //true
        System.out.println(Character.isAlphabetic(krk)); // false
        System.out.println(Character.isLetter(krk)); //false








    }
}
