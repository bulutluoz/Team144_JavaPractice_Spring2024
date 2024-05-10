package day02_ifElse_wrapperClass;

import java.util.Scanner;

public class C01_Casting {

    public static void main(String[] args) {

        //1- Kullanicidan bir harf isteyin, kullanici kucuk harf verirse harfi buyuk harfe cevirin,
        //   Buyuk harf verirse kucuk harfe cevirin.
        //   Eger harf disinda farkli bir karakter girerse “Harf girmelisiniz” diyerek uyarin.
        //   Soruyu 3 farkli sekilde cozun
        //   - Casting kullanarak
        //   - Wrapper class hazir method’larla
        //   - String manipulasyon kullanarak


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        char harf = scanner.nextLine().charAt(0); // kullanici uzun bir metin de girse
                                                  // biz ilk harfe odaklanip, onu aliyoruz

        //   - Casting kullanarak
        if (harf>='a' && harf<='z') { // char ozel bir data turudur, matematiksel islemle karsilasirsa
                                      // ASCII table'daki degeri ile isleme girer
            // eger bu if ile yakaliyabiliyorsak girilen harf kucuk harftir
            harf = (char) (harf-32) ;
            System.out.println("Girdiginiz harfin yeni hali : " + harf);

        }else if (harf >= 'A' && harf <= 'Z'){

            // eger bu if ile yakaliyabiliyorsak girilen harf buyuk harftir
            harf = (char) (harf+32) ;
            System.out.println("Girdiginiz harfin yeni hali : " + harf);

        }else {
            System.out.println("Harf girmelisiniz");
        }



    }
}
