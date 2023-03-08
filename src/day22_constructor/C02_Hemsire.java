package day22_constructor;

public class C02_Hemsire {
    /*
    örnegin bir hastne programında hastane calisacak hemsirelerin hangi bilgilerini tutmak istiyorsak
    hangi methodları hemsireler icin kullanmak istiyorsak bir hemsire classı olusturup,tum bu özllikleri yani variable
    ve methodları o class da olustururuz.
    programda n zaman bir hemsriye ihtiyac olsa bu hemsire classından obje olstururuz.Otomatik olarak tüm özllklre
    sahip olur.

    Default constructor görünmez,parametresi yoktur,cons. bodysi boştur.
    C02-Hemsire(){
    }

    */

    String isim="isim atnmamış";
    String soyİsim;
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMİ;
    int ekMesaiUcreti=20;


    public int mesaiUcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;

    }

}
