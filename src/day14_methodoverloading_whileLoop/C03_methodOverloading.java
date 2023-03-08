package day14_methodoverloading_whileLoop;

public class C03_methodOverloading {
    public static void main(String[] args) {
        /*
         Bir class'da ayni isme sahip farkli islem yapan method'lar olabilir.
         java bu methodlardan hangisinin calisacagina parametrelere göre karar verir.

         Bir classda ismi ayni,parametreleri farkli methodlar olmasına Method Overloading denir.
         */






        String str="Bu is olcak";
        System.out.println(str.replace("Bu is", "Java guzel"));//java guzel olcak
        System.out.println(str.replace('u', 'e'));//Be is olcak






    }
}
