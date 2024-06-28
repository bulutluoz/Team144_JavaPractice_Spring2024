package day10_Lists_Exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {
        // 1- Verilen bir String’deki karakter sayisini donduren uzunluk( ) method’umuzu olusturun.

        System.out.println(uzunluk("Java Candir")); // 11

        System.out.println(uzunluk("")); // 0

        System.out.println(uzunluk("   "));

        String str = null;
        System.out.println(uzunluk(str));

    }



    public static int uzunluk(String str){

        int uzunluk = 0 ;

        //1.yol array'e cevirip or-each loop ile elementleri sayabiliriz
        /*
        String[] kelimeArrayi = str.split("");

        if (str.equalsIgnoreCase("")){
            uzunluk = 0;
        }else {
            for (String eachKarakter : kelimeArrayi
            ) {
                uzunluk++;
            }
        }
         */

        //2.yol exception'i kullanalim

        try {

            while (uzunluk < 1000000){

                char a = str.charAt(uzunluk);
                uzunluk++;

            }

        } catch (StringIndexOutOfBoundsException e) {

        }


        return uzunluk;
    }
}
