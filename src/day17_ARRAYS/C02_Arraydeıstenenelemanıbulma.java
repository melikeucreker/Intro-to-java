package day17_ARRAYS;

public class C02_Arraydeıstenenelemanıbulma {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.


    int [] arr1={2,4,5,2,6,4,7,3,5};

    elemansayisiYazdir(arr1,3);//1
    elemansayisiYazdir(arr1,4);//2

        String [] arr2={"E","H","M","H","H","E" };
        elemanSayisiYazdir(arr2,"E");//6


    }

    public static void elemansayisiYazdir(int[]arr,int arananElement){

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananElement){
                sayac++; // bu şu dmk i indksi aranan element variableına eşitse o kadar sayacı arttır

            }

        }
        System.out.println(sayac);

    }
     public  static void elemanSayisiYazdir(String[]arr,String arananElement){
        int sayac=0;
         for (int i = 0; i<arr.length  ; i++) {
             sayac++;


         }
         System.out.println(sayac);
     }


}
