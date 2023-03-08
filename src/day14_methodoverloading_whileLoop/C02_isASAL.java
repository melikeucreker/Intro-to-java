package day14_methodoverloading_whileLoop;

public class C02_isASAL {
    public static void main(String[] args) {
        //vriln birdn büyük tamsayi icin sayi asal is true
        //sayi asal degilse false dönen bir method olusturun.

        System.out.println(isASAL(20));//false
        System.out.println(isASAL(10)); //false

      boolean sonuc= isASAL(57);// bu sonuc variable'ına false degerini atar.


    }

    public static boolean isASAL(int sayi){
        int flag =0;
        for (int i = 2; i<sayi; i++) {
            if(sayi%i==0){
                flag++;
                break;
            }



        }
        if(sayi==2){
            System.out.println("Girilen 2 sayisi ASAL bir sayidir.");
            return true;
        }

        if(flag==0){
            System.out.println("Girilen"+sayi+"sayisi ASAL bir sayidir.");

            return true;
        }else {
            System.out.println("Girilen"+sayi+"sayisi ASAL bir sayi degildir.");
            return false;
        }








    }


}
