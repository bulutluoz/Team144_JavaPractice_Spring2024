package day09_arrays;

public class C07_SonElementlerinToplami {

    public static void main(String[] args) {

        //7- Verilen iki katli bir array’de
        //   her inner array’in son elementlerinin toplamini yazdirin.

        int[][] sayilar = { {2,3,4},{1,5},{7,9,0},{2} };

        int toplam = 0 ;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i][sayilar[i].length-1];
        }


        System.out.println(toplam);

    }
}
