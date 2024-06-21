package day09_arrays;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        // array 2 sekilde olusturulabilir

        int[] arr1 = {3,5,6,7};

        String[] arr2 = new String[5];

        // Bir array olusturulurken 2 seyi mutlaka belirlemeliyiz
        // 1- icine koyacagimiz elementlerin data turu
        //    Array kendisi non-primitive bir data turudur,
        //    ancak icine koyacagimiz data turunu de belirtmeliyiz,
        //    arr1 in elementleri int, arr2'nin elementleri String OLMAK ZORUNDADIR
        // 2- icine kac element konulacagi, yani length'i

        // Array'leri yazdirmak icin Arrays class'indan toString() kullaniriz
        System.out.println(Arrays.toString(arr1)); // [3, 5, 6, 7]

        // Array 2.yontemle olusturulmussa yani element atamasi yapilmamissa
        // Java HER ELEMENT icin belirlenen default degerleri atar ve onlari yazdirir
        // default deger non-primitive'ler icin null'dir
        System.out.println(Arrays.toString(arr2));
        // [null, null, null, null, null]


        // herhanfi bir elementi yazdirmak veya elemente deger atamak istersek
        // index kullanmaliyiz

        System.out.println( arr1[2] ) ; // 6
        arr1[1] = 10 ;

        System.out.println(Arrays.toString(arr1)); // [3, 10, 6, 7]

        // arr1[0] = false;
        // arr1[0] = 10.2;
        // arr1[0] = "Java";
        arr1[0] = 'a';

        System.out.println(Arrays.toString(arr1)); // [97, 10, 6, 7]


        // Bir array'in tum elementlerini yazdirmak istersek
        // for loop
        for (int i = 0; i < arr1.length ; i++) {

            System.out.print(arr1[i] + " ");
        }

        // veya for-each loop kullaniriz
        System.out.println("");

        for (int each : arr1
             ) {
            System.out.print(each + " ");
        }

    }
}
