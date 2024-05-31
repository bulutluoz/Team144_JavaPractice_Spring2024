package day05_MethodOlusturma_Overloading;

public class C02_KendiContainsMethodumuz {

    public static void main(String[] args) {

        //  Verilen bir String’de, verilen bir char karakterin bulunup bulunmadigini kontrol edip
        //  varsa true, yoksa false donduren kendiContains( ) method’umuzu  olusturun

        // Ornek : metin -> Java Candir , arananKarakter : a

        String str = "Java Candir";

        System.out.println(kendiContains(str, 'a'));  // true
        System.out.println(kendiContains(str, 'b'));  // false


        // verilen metinde aranan char varsa "Gorev tamamlandi",
        // char yoksa "yeniden denemelisin" yazdirin

        if (   kendiContains(str, 'k')    ){  // kendiContains(str,'k') == true
            System.out.println("Gorev tamamlandi");
        } else {
            System.out.println("yeniden denemelisin");
        }

    }



    public static boolean kendiContains(String metin , char arananKarakter){

        boolean sonuc = false;

        for (int i = 0; i <metin.length() ; i++) {

            if (metin.charAt(i) == arananKarakter){
                sonuc = true;
            }

        }

        return sonuc;
    }
}
