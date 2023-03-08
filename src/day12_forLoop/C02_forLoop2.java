package day12_forLoop;

public class C02_forLoop2 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        int bas = 20;
        int bit = 400;
        int sayiToplami = 0;
        if (bit < bas) {
            System.out.println("baslangic degeri bitis degerinden kücük olmalidir.");
        }
        else {
            for (int i = bas; i <=bit ; i++) { //dinamik kod dgskn kullanmaktir.
                //sayiToplami=sayiToplami+i bu profsynl durmuyor
                sayiToplami+=i;

            }
            
            
        }
        System.out.println("sayilarin toplami:"+sayiToplami);






    }
}