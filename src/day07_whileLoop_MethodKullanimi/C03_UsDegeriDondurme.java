package day07_whileLoop_MethodKullanimi;

public class C03_UsDegeriDondurme {
    public static void main(String[] args) {

        // 3- Verilen bir sayi icin
        //    istenen üs değerini hesaplayip döndüren bir method olusturun

        C02_UsHesaplamaMethodu.usYazdir(2,4);  // islem sonucu : 16

        System.out.println(usHesapla(3, 2)); // 9


    }

    public static int usHesapla(int sayi, int us){

        int sonuc = 1;

        while ( us > 0){

            sonuc *= sayi;
            us--;
        }

        return sonuc;
    }
}
