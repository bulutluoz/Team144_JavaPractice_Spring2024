package day09_arrays;

import java.util.Arrays;

public class C04_ArraydenElemanSilme {

    public static void main(String[] args) {
        // 3- Verilen bir array’den istenen elemani silip,
        //    kalani bir array olarak bize donduren bir method olusturun.
        //    NOT : silinecek element birden fazla kullanilmissa hepsi silinmeli

        int[] arr = {7,3,5,9,2,3,5,5,9,1,4};
        int silinecekSayi = 3;  // bize array olarak [7, 5, 9, 2] dondurecek

        System.out.println(Arrays.toString(arraydenElemanSil(arr,3))); // [7, 5, 9, 2, 5, 5, 9, 1, 4]
        System.out.println(Arrays.toString(arraydenElemanSil(arr,5))); // [7, 3, 9, 2, 3, 9, 1, 4]
        System.out.println(Arrays.toString(arraydenElemanSil(arr,6))); // [7, 3, 5, 9, 2, 3, 5, 5, 9, 1, 4]




    }


    public static int[] arraydenElemanSil( int[] arr , int silinecekEleman   ){
        // once silinecek eleman disinda kac eleman var oldugunu bulalim
        int yeniArrLength = 0 ;

        for (int each : arr
             ) {

            if (each != silinecekEleman) {
                yeniArrLength++;
            }

        }

        int[] yeniArr = new int[yeniArrLength];

        int yeniArrAtamaIndexi = 0 ;

        for (int eachEski : arr
             ) {
            // eski array'deki tum elementleri tek tek getirecek
            // biz de gelen elementi kontrol edip
            // silinecek sayiya esit degilse

            if (eachEski != silinecekEleman){

                // yeni array'e element olarak ekleyecegiz

                yeniArr[yeniArrAtamaIndexi] = eachEski;
                yeniArrAtamaIndexi++;

            }

        }

        return yeniArr;
    }
}
