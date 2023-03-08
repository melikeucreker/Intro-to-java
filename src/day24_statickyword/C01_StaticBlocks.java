package day24_statickyword;

public class C01_StaticBlocks {

    C01_StaticBlocks(){
        System.out.println("Constructor calisti.");
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti.");}
    C01_StaticBlocks obj1=new C01_StaticBlocks();

         static{
        /*
        static blocklar class ilk calısmaya basladıgında calısır.
        genel olarak class icin gerekli olan ayarlamalrı yapmak icin kullanılır.

        birden fazla static block varsa yukaridan asagi dogru sırali olarak calisir.

         */


            System.out.println("Static block çalıştı.");
        }
    static {
        System.out.println("Alttaki static block calisti.");
    }

    {
        /*
        static olmayan bloklar ise,obje olusturulurken constructordan önce calisir.
        obje icin yapılması gereken ön ayarlamalar yapmak icin kullanilir.
         */


        System.out.println("Static olmayan blok çalıştı.");
    }


    }

