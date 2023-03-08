package day17_ARRAYS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_methodIleElementleriArttırma {
    public static void main(String[] args) {
        //soru1_verilen bir int array'in tüm elemanlarını 2 arttirip bize donduren bir method olusturun
        //eski array'i yeni haliyle kaydedin.

        int[] arr={3,4,5,6};
        arr=arrayElementleriniArttir(arr,2);
        System.out.println(Arrays.toString(arr));





    }
    public static int[] arrayElementleriniArttir(int[]ilkArr,int artis){
        for (int i = 0; i <ilkArr.length ; i++) {
            ilkArr[i]+=artis;
                   // ilkArr[i] bu su dmk:bu arrayin indxi artisi da bu indx e ekle
                   //yani sıfırdan basla,ilkArr ın lengthine kadar git(elemanlarına) ona da artısı ekle

        }
        return ilkArr;




    }

}
