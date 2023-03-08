package day05_IncrementDecrementConcatenation;

public class C02_PreIncrement_PostIncrement{
    public static void main(String[] args) {
        /*eger sayinin degeri sadece 1 artacak veya azalacaksa arttirip sonra yazdirma/atama
        yazdirip sonra artirma/atama
        islemlerini tek satirda yapabiliriz.
         */
        //anin degerini 1 arttirin ve yeni degerini olusturacaginiz b variableına atayin
        int a=20;
        int b =++a;//önce arttır sonra ata demek
        /*
        a++;
        int b =a;
         */

        System.out.println("a:"+a+",b"+b);//a:21 b:21
        //a'nin degerini b'ye atayin,sonra a'nin degerini 1 arttirin.
        a=20;
        b=a++;//önce atama yapar,sonra arttirir.
        /*
        b=a;
        a++;
         */
        System.out.println("a:"+a+",b"+b);//a:21 b:20
        //anin degerini yazdirin ve sonra a'yi 1 arttirin.
        a=20;
        System.out.println("a:"+a);//a:20
        a++;
        System.out.println("=========");
        a=20;
        System.out.println("a:"+a++);//a:20
        System.out.println("Bir sonraki satirda a:"+a);//bir sonraki satirda a:21
        //anin dgrini 1 azaltin ve dgrini yazdirin.
        a=20;
        System.out.println(--a);////a:19
        System.out.println("Bir sonraki satirda a:"+a);//bir sonraki satirda a:19










    }

}
