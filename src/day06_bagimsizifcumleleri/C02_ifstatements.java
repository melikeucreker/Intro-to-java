package day06_bagimsizifcumleleri;

public class C02_ifstatements {
    public static void main(String[] args) {

        /*
            Buradaki sartlar birbirinden bagimsizdir
            uygun sayilar olursa 3 if body'si de calisabilir
            bazen de hicbir if body'si devreye girmeyebilir

            kodumuz konsolda hicbir sey yazdirmadi
            ancak
            Process finished with exit code 0
            yazmasindan kodun hicbir sorun olmadan calistigini anliyoruz

            sadece degerler sartlari saglamadigi icin
            konsolda bir sey yazdirilmadi
         */

        int a = 13;

        int b = 97;

        if (a>b){
            System.out.println("a b'den buyuk");
        }

        if (a%2==0){
            System.out.println("a cift sayidir");
        }

        if (b>100){
            System.out.println("b 100'den buyuktur");
        }


    }
}


