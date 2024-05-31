package day05_MethodOlusturma_Overloading;

public class C01_MethodKullanma {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'i buyuk harflerle yazdirin

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir


        // Method'lar ikiye ayrilir
        // 1- verdigimiz isi yapip kod dunyasina hic bir sey dondurmeyen method'lar
        //    (yazdirma dis dunyaya verilen mesajdir, kod dunyasina donen birsey yoktur)
        //    bu tur method'lari void olarak olustururuz

        // 2- verdigimiz isi yapip kod dunyasina bir sonuc donduren method'lar
        //    bu method'lar calistiginda sonucu mutlaka kod dunyasina dondurur
        //    bu sonucu ne yapacagimiz kodu yazan bize kalir
        //    sonucu direk yazdirabiliriz
        //    veya sonucu ilerde kullanabilmek icin kaydederiz

        //  Biz method'lari nicin kullaniriz
        //  1- her seferinde tekrar tekrar kod yazmamak icin
        //  2- Kodumuzu daha anlasilir ve kisa hale getirmek icin


    }
}
