package day14_methodoverloading_whileLoop;

public class C01_asalSayiYazdir {
    public static void main(String[] args) {
        //verilen pozitif bir tamsayinin
        //asal sayi olup olmadigini yazdiran bir method olusturun.
        asalMiYazdir(20);
        asalMiYazdir(35);
        asalMiYazdir(154);
        asalMiYazdir(5);
        asalMiYazdir(2);


    }

    public static void asalMiYazdir(int sayi){

      int flag =0;
        for (int i = 2; i<sayi; i++) {
            if(sayi%i==0){
                flag++;
                break;
            }



        }
        if(sayi==2){
            System.out.println("Girilen 2 sayisi ASAL bir sayidir.");
        }

        if(flag==0){
            System.out.println("Girilen"+sayi+"sayisi ASAL bir sayidir.");
        }else {
            System.out.println("Girilen"+sayi+"sayisi ASAL bir sayi degildir.");
        }





    }
}
