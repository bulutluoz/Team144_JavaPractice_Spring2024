package day09_arrays;

import java.util.Arrays;

public class C05_MultiDimensionalArrays {

    public static void main(String[] args) {

        // Cok katli array'ler array'in icinde array kullanilmasidir

        int[][] sayilar = { {2,3,4},{1,5},{7,9,0},{2} };

        // Outer array olan sayilar array'inin 4 tane elementi vardir
        //  {2,3,4}      {1,5}      {7,9,0}      {2}

        System.out.println(Arrays.toString(sayilar[0])); // [2, 3, 4]
        System.out.println(Arrays.toString(sayilar[3])); // [2]

        // int olan elementlere tek tek erismek istersek
        // kat sayisi kadar index belirtmek gerekir
        // sayilar[0][1] ==> 0 inner array'in index'idir {2,3,4}
        //                   1 ise inner array icindeki sayinin index'idir 3

        System.out.println(sayilar[2][2]); // 0

        // tum array'i yazdirmak istersek

        System.out.println(Arrays.deepToString(sayilar)); // [[2, 3, 4], [1, 5], [7, 9, 0], [2]]


        // 2 katli bir array'in tum elementlerini yazdirmak istersek


        for (int i = 0; i < sayilar.length ; i++) { // disardaki loop, outer array'i kontrol eder

            for (int j = 0; j <sayilar[i].length ; j++) { // inner array'leri kontrol eder


                System.out.print(sayilar[i][j] + " ");

            }
        }


    }
}
