package day16_scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        ADoktor dok1=new ADoktor();
        System.out.println(dok1.askerlikYaptıMı);
        dok1.isim ="Doktor Kemal";
        dok1.soyIsim ="Yilmaz";
        dok1.dogumYılı =1980;
       // System.out.println(isim); //başına bulundugu class ı yazmazsak bulundugu alandaki scop a bakar
        System.out.println(dok1.isim);//"Doktor Kemal"

        ADoktor dok2= new ADoktor();
        System.out.println(dok2.isim);//null
        dok2 .soyIsim="celik";
        System.out.println(dok2.soyIsim);//celik
        System.out.println(dok1);//referansını yazdırır.
        System.out.println(dok1.fakulte); //Tip
        System.out.println(dok2.fakulte);//Tip

        dok1.isim ="burcu";
        System.out.println(dok2.isim);//null
        dok1.fakulte ="Tip fakultesi";
        System.out.println(dok2.fakulte);//"Tip fakultesi"
        //29.satirdan itibrn hpsi tip fakultsi olur hastan örngi gibi düsün.

        ADoktor dok3 =new ADoktor();
        System.out.println(dok3.dogumYılı);//0
        System.out.println(dok3.fakulte);//Tip fakultesi

        System.out.println(ADoktor.fakulte);//Tip fakultesi
        //static variabl lar icin tavsiy diln risim yöntmi
        //classIsmi.staticUyeIsmi seklinde yazilir.
        //bu kullanim bicimine static yontem dnir.
        



















    }
}
