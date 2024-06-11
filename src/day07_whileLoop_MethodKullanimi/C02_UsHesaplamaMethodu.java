package day07_whileLoop_MethodKullanimi;

public class C02_UsHesaplamaMethodu {

    public static void main(String[] args) {
        //2- Verilen bir sayi icin
        //   istenen üs değerini hesaplayip yazdiran bir method olusturun

        usYazdir(3,4); // islem sonucu : 81
        usYazdir(2,5); // islem sonucu : 32
        usYazdir(3,2); // islem sonucu : 9


    }

    public static void usYazdir(int sayi , int us){

        int sonuc = 1;

        while (us > 0){

            sonuc *= sayi;
            us--;
        }

        System.out.println("islem sonucu : " + sonuc);

    }
}
