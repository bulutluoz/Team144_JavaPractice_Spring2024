package day02_ifElse_wrapperClass;

public class C04_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        // Asagidaki islemler sonrasinda a, b ve c degerleri ne olur ?

        /*
            a++ ve ++a ikisi de a'nin degerini 1 artirir

            int a = 5;

        System.out.println( a); // 5

        a++;

        System.out.println( a); // 6

        ++a;

        System.out.println( a); // 7

        Aralarindaki fark bu islemin yapildigi satirda olur
        eger bu islemin yapildigi satirda iki islem ayni anda yapiliyorsa
        ++a  artirma islemi once yapilir
        a++ artirma islemi sonra yapilir

         */



        int a = 5;


        a++;

        System.out.println("40.satirda a :" + a); // 5

        int b = 2 *  --a;

        System.out.println("44.satirda a :" + a); // 5
        System.out.println("45.satirda b :" + b); // 10

        int c = ++b + ++a ;


        System.out.println("a : " + a + ", b : " + b + ", c : " + c);







    }
}
