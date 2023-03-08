package day14_methodoverloading_whileLoop;

public class C04_methodOverloading {
    public static void main(String[] args) {

        /* java overloading kuralları:
        1-isim ve parametreleri ayni olan birden fazla method olusturulamaz.
        2-java yeni bir method olarak kabul eder.(int,double yerine double,int kabul eder.)



         Overloading olan class'larda

            Java hangi method'un calistirilacagina su sekilde karar verir

            1- cagrilan isimde method var mi ?
            2- method call'da kullanilan arguments ile method'lardaki
               parametrelerin %100 uyumlu oldugu var mi ?
            3- argument ile parametre ayni olmasa bile
               verilen argumentleri kabul edecek parametre var mi ?
            4- Casting ile birden fazla method'u kullanabiliyorsa
               daha az casting ile calisacak method'u kullanir.


        */

        topla(3,5);
        topla(3.5,4.5);

        // topla("ali","veli");  CTE bu argument'leri kabul edebilecek parametre yok

        topla('a','b'); // iki int 195 // char data trund paramtr yok ama itiraz etmiyor
        // ascii kodlarını alarak yaptı.

        topla(3f , 4f); // iki double 7.0 //float i double kabul edecegi icin oluyor.

        topla(3f , 4); // double ve int 7.0 // burada 1 casting yaptigi icin bunu kabul etti.






    }

    public static void topla(int a,int b){
        System.out.println("İki tamsayinin toplami: "+(a+b));


    }
    public static void topla(double a,double b){
        System.out.println("İki tamsayinin toplami: "+(a+b));

    }
    public static void topla(int sayi1,double sayi2){
        System.out.println("int ve double sayilarin toplami:"+(sayi1+ sayi2));

    }
    public static void topla(double sayi1,int sayi2){
        System.out.println("int ve double sayilarin toplami:"+(sayi1+ sayi2));



    }
}
