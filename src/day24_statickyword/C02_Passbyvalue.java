package day24_statickyword;

public class C02_Passbyvalue {
    public static void main(String[] args) {
        double fiyat=200;
        //Java ayni method içerisinde aynı isimde birden fazla variable olusturulmasına izin vermez.
        indirimYap10(fiyat);
        System.out.println("method calldan sonra fiyat "+fiyat);
        indirimYap25(fiyat);
        indirimliFiyatGetir10(fiyat); // cünkü bu fiyatı döndürür yazdırmamız lazım ögrnmk icin
        System.out.println(indirimliFiyatGetir10(fiyat));

    }
    public static void indirimYap10(double fiyat){
        fiyat=fiyat*0.9;
        System.out.println("%10 indirimli fiyat: "+fiyat);
        /*
        main mthoddaki fiyatı kalıcı olarak dgistrmk istrsk main mthod icrisind atama yapmalıyız.
         */
        fiyat=indirimliFiyatGetir10(fiyat);
        System.out.println("Main method'da atama yapıldıktan sonra fiyat:"+fiyat);


    }
    public static void indirimYap25(double fiyat){
        fiyat*=0.75;
        System.out.println("%25 indirimli fiyat: "+fiyat);
    }
    public static double indirimliFiyatGetir10(double fiyat){
        fiyat*=0.9;
        return fiyat;
    }
}
