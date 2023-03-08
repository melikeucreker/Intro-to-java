package day13_methodolusturma;

public class C03_faktoryelMethodu {
    public static void main(String[] args) {
        // verdigimiz bir sayinin faktoryelini hesaplayip
        // sonucu bize donduren bir method olusturun


       int sonuc= faktoryelHesapla(5); // biz çağırırkn bize döndürdügü dgri kaydttk.aldık.
        System.out.println(sonuc);

        //suanda cagiriyorum ama olusturdugum birsy yok hnüz
    /*
                Method olusturma asamalari
                1- public static standart (simdilik)
                2- olusturdugumuz method bize bir sonuc dondurecekse
                   dondurecegi sonucun data turunu yaz
                3- method ismi
                4- method parantezi () icine method'a gondermemiz gereken bilgileri
                   hangi variable ile gonderecegimizi yaz (parametre)
                5- dondurulmesi istenen islemi yap
                6- return keyword kullanarak dondurulmesi istenen degeri dondur
         */


    }





 public static int faktoryelHesapla(int sayi){
     //5
 int faktoryel=1;
     for (int i =sayi; i>=1; i--) {

         faktoryel*=i;
         
     }


return faktoryel;


 }




}


