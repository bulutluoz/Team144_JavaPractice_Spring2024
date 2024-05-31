package day05_MethodOlusturma_Overloading;

import java.util.Scanner;

public class C04_MetniSifreliOlarakKaydet {

    public static void main(String[] args) {
        // Verilen bir cumleyi sifrelememiz isteniyor.
        // Metni sifrelemek icin her harf kucuk harfe cevrilecek
        // ve kendisinden 5 sonraki harfle degistirilecektir (a->f, b->g… gibi),
        // eger 5 harf sayarken z’ye gelindiyse basa a harfine donulecektir. (u->z, w->a, x->b.. gibi),
        // harf disinda sayi, ozel karakter varsa onlar degistirilmeyecektir.

        // Kullanicidan bir metin isteyin, aldiginiz metni sifreli hale cevirip
        // o haliyle kaydedin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        // C03_SifreliYazdirma.sifreliYazdir(metin);

        // Bir method void ise urettigi sonucu baska bir class'da KAYDETME sansimiz olmaz
        // BU sebeple GENELDE return kullanan method'lar tercih edilir

        // method calisip sifreli halini bize getirir
        // EGER sadece YAZDIRMAK istiyorsak, kod dunyasinda gelen sonucu yazdirmaliyiz
        // System.out.println(sifreliMetniDondur(metin)); // ofaf

        // EGER method'un sonucuyla bir islem yapmamiz isteniyorsa
        // kod dunyasinda istenen islemi yapmaliyiz

        metin = sifreliMetniDondur(metin);

        System.out.println( "Girilen metnin son hali : " + metin);
    }

    // metni sifreleyip, sifreli halini kod dunyasina donduren bir method olusturalim
    public static String sifreliMetniDondur(  String metin ){

        // Metni sifrelemek icin her harf kucuk harfe cevrilecek
        metin = metin.toLowerCase();
        String sifreliMetin = "";

        // her bir karakteri alip, sifreleme mantigiyla degistirip,
        // sifreliMetin'e ekleyelim

        for (int i = 0; i <metin.length() ; i++) {

            char karakter = metin.charAt(i);

            if (Character.isLetter(karakter)){ // harf olanlar bu suzgecle yakalanir

                if (karakter <= 'u'){
                    sifreliMetin += (char)(karakter+5) ;
                }else {
                    sifreliMetin += (char)(    karakter+5-26      ) ;
                    // 26 z->122 'den sonra a->97 ye gecmek icin
                }

            } else { // harf olmayanlar bu suzgecle yakalanir

                sifreliMetin += karakter;
            }

        }

        return sifreliMetin;
    }

}
