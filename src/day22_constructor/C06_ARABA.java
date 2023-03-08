package day22_constructor;

public class C06_ARABA {

    /*
     Bir obj olusuturulurkn dfault constructor vya paramtrsiz gorunur constructor kullanılırsa obj ilk atanan dgrlr
     sahip olur.İstdginiz dgrlri atamak icin tk tk tüm variablllara atama yapmamız grkir.
     Bunun yerine
      atamak istdigimiz degerleri paramtre olarak,constructor'a yollayalım
      ve atamaları constructor icinde yapalim.


     */
    public C06_ARABA(String mrk,String mdl,boolean hmi,int yl,int fyt){
        yil=yl;
        marka=mrk;
        model=mdl;
        hasarliMI=hmi;
        fiyat=fyt;
    }

    public C06_ARABA(){

    }

   int yil;
   String marka ="Marka Belirtilmemis.";
   String model="Model Belirtilmemis";

   boolean hasarliMI;

    @Override
    public String toString() {
        return "ARABA OZELLIKLERI {" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMI=" + hasarliMI +
                ", fiyat=" + fiyat +
                '}';
    }

    int fiyat;

   public void yakitTuketimi(String yakitTuru){

       switch (yakitTuru){
           case "Benzin:":
               System.out.println("bnzinli araclar icin yakit tuktimi :6l/100km");
               break;
           case  "dizel":
               System.out.println("dizel araclar icin yakıt tuktimi:5l/100km");
               break;
           case "Elektrik":
               System.out.println("elektrikli aracalar icin yakıt tuktimi:5kw/100km" );
               break;
           default:
               System.out.println("gcrsiz yakit türü");
       }
   }

}
