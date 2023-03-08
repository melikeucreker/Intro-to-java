package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String[] isimler={"Nurefsan","Berke","Mustafa"};
        int [] sayilar={3,4,5,6,7,8,5,4,3,3,5,6,6};
        char karakterler [] ={'e','4',','};

        //Array non-primitive data turlerindendir.
        //eger array2i liste seklinde olusturmayip
        //new keyword kullaniyorsak
        //uzunlugunu yazmak zorundayız.

        String [] arr =new String[5];
        //bir array tanimlanan uzunluktan daha fazla veya az eleman alamaz.
        //bir array'i yazdirmak istersek
        //Array'ler direk yazdirilaöaz
        System.out.println(isimler);// [Ljava.lang.String;@3b6eb2ec
        System.out.println(Arrays.toString(sayilar));// [3, 4, 5, 6, 7, 8, 5, 4, 3, 3, 5, 6, 6]
        System.out.println(Arrays.toString(arr)); // [null, null, null, null, null]
        int [] a = new int[7];
        System.out.println(Arrays.toString(a));// [0, 0, 0, 0, 0, 0, 0]

        // array'deki elementlere nasil ulasiriz ? index ile
        a[0] = 4; // [4, 0, 0, 0, 0, 0, 0]
        a[3] = 7; // [4, 0, 0, 7, 0, 0, 0]
        //a[7] = 8; // ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(a));

        // sayilar array'inin 4.index'indeki elementi yazdirin

        System.out.println(sayilar[4]); // 7

        // isimler array'inin 1.index'indeki ismi yazdirin
        System.out.println(isimler[1]); // Berke








    }
}
