package day17_ARRAYS;

import java.util.Arrays;

public class c01orngiAzaltma {
    //soru1_verilen bir int array'in tüm elemanlarını 2 azaltıp bize donduren bir method olusturun
    //eski array'i yeni haliyle kaydedin.
    public static void main(String[] args) {

        int arr[]={2,4,6,8};
        arr=arrayElemanlariniAzalt(arr,2);
        System.out.println(Arrays.toString(arr));




    }



        public static int[] arrayElemanlariniAzalt (int[] ilkArr,int azaltıs){
            for (int i = 0; i<ilkArr.length ; i++) {

                ilkArr[i]-=azaltıs;



            }
            return ilkArr;


        }









    }






