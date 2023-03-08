package day05_IncrementDecrementConcatenation;

public class c01_Incrementdecrement {
    public static void main(String[] args) {
        int a =20;
        //a'nin degerini 3 artirin ve yeni degerini olusturacaginiz b variable'ina atayin.

        //a=a+3;
        a +=3;
        //a++;
        //a++;
        //a++;

        int b=a;
        System.out.println("a:"+a+",b:"+b);//a:23 b:23

        a=20;
        //a'nin degerini b'ye atayin,sonra a'nin degerini 3 arttirin.
        b=a;
        a+=3;
        System.out.println("a:"+a+",b:"+b);//a:23 b:20
        System.out.println("===============");
        a=20;
        //a'nin degerini yazdirin ve sonra a'yi 5 arttirin.
        System.out.println("a:"+a);
        a+=5;
        //burada a'yi yazdırsaydık 25 yazardi.



    }

}
