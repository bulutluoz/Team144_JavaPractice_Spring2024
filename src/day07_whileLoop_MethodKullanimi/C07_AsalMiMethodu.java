package day07_whileLoop_MethodKullanimi;

public class C07_AsalMiMethodu {

    public static void main(String[] args) {
        // 6- Verilen bir sayinin asal olup olmadigini kontrol edip,
        //    asal ise true, degilse false donduren bir method olusturun.

        System.out.println(asalMi(23)); // true
        System.out.println(asalMi(34)); // false
        System.out.println(asalMi(234435)); // false

    }

    public static boolean asalMi(int sayi){

        boolean sonuc = true;
        int bolunecekSayi = 2;

        while ( bolunecekSayi < sayi){

            if (sayi % bolunecekSayi == 0){
                sonuc = false;
                break;
            }

            bolunecekSayi++;
        }

        return sonuc;
    }

}
