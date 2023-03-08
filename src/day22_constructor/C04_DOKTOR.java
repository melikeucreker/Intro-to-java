package day22_constructor;

public class C04_DOKTOR {



    C04_DOKTOR(){

    }
    String isim = "isim atnmamış";
    String soyİsim;
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMİ;
    int ekMesaiUcreti = 30;


    public int mesaiUcretiHesapla(int mesaiSaati) {

        return mesaiSaati * ekMesaiUcreti;

    }
}