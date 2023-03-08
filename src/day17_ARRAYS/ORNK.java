package day17_ARRAYS;

import java.util.Arrays;

public class ORNK {
    public static void main(String[] args) {
        int [] arr={1,5,8,9,7,21};
        System.out.println(arr.length);
        System.out.println(arr[2]);
        arr[2]=10;//1,5,10,9,7,21
        System.out.println(arr[2]);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"");


        }


    }

}
