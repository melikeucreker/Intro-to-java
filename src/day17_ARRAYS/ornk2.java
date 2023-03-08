package day17_ARRAYS;

import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

public class ornk2 {
    public static void main(String[] args) {
       // Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
       // Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int[] arr1={4,5,6,7};
        int temp= arr1[arr1.length-1];


        for (int i = 0; i < arr1.length-1 ; i++) {

            arr1[arr1.length-1-i] = arr1[arr1.length-2-i];

        }

        arr1 [0]=temp;
        System.out.println(Arrays.toString(arr1));









    }
}
