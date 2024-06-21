package day09_arrays;

import day07_whileLoop_MethodKullanimi.C07_AsalMiMethodu;

public class C03_AsallarinToplami {

    public static void main(String[] args) {
        //2- Verilen bir array’deki asal sayilari toplayin

        int[] arr = {13,6,8,5,17,21,23,25,37,39};

        int asallarinToplami = 0;

        for ( int each : arr
             ) {

            if (  C07_AsalMiMethodu.asalMi(each)  ){ // C07_AsalMiMethodu.asalMi(each) == true

                asallarinToplami += each;
            }
        }

        System.out.println("Asal sayilarin toplami : " + asallarinToplami);
    }
}
