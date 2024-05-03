package day01_variables_scanner;

public class C02_Variables {

    public static void main(String[] args) {

        /*
            Java RunTime programdir
            Calistigi surece yapilan tum atamalari kalici olarak tutar
            ama calisma bittigi anda hersey sifirlanir

            tekrar calistirdigimizda hersey sanki ilk defa calismis gibi sifirdan baslar
         */

        //System.out.println(yas);


        int yas;

        // System.out.println(yas);
        // Variable 'yas' might not have been initialized
        // method icinde bir variable olustururken deger atamak zorunlu degildir
        // ANCAK yazdirmak gibi herhangi bir islemde variable'i kullanabilmemiz icin
        // deger atanmis olmasi zorunludur

        yas = 12 ;
        System.out.println(yas); // 12


        // int yas = 15 ;
        // short yas = 23;
        // String yas = "ali";
        System.out.println(yas);
        // Java bir variable'i kullanmak istedigimizde, neyi kullanacagini net bilmelidir
        // birden fazla variable ayni isimde OLAMAZ


        int sayi = 20 ;

                      sayi                    =                   sayi + 3;
        //     esitligin sol tarafi        esittir              esitligin sagi
        //           variable         asignment(atama)               deger


        System.out.println(sayi); // 23
    }
}
