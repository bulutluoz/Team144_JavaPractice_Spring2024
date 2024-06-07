package day05_MethodOlusturma_Overloading;

public class C06_MethodOverloading {

    /*

        Method overloading bir method'u farkli farkli kullanabilmektir.

        Biz bir method'u overload etmek istersek, nasil yapabiliriz ?

        Bir class'da herseyi ayni olan iki method OLUSTURULAMAZ
        EGER bir class'da ayni isimde birden fazla method olusturmak isterseniz
        SIGNATURE'i farkli olmalidir

        signature = method adi + parametrelerin DATA TURU

        signature'i nasil farklilastirabiliriz ?
        1- ismini degistirmek (o zaman overloading olmaz)
        2- parametre sayisini degistirmek
        3- parametrelerin data turunu degistirmek
        4- farkli data turundeki parametrelerin yerini degistirmek

        Eger bir class'da overloading yani
        ayni isimde farkli farkli method'lar varsa
        Java hangisinin calisacagina
        argument == parametre eslesmesine gore karar verir

        - Eger %100 uyumlu method varsa onu kullanir
        - %100 uyumlu yoksa, casting ile calistirabilecegi method varsa onu kullanir
        - Eger casting ile calistirabilecegi birden fazla method varsa
          EN AZ casting ile calistiracagini tercih eder

     */

    public static void main(String[] args) {

        String str = "java candir";
        System.out.println(str.replace('a', 'b')); // jbvb cbndir
        System.out.println(str.replace("java", "Java")); // Java candir

        System.out.println(str.substring(2)); // 2.indexden baslayip sona kadar  va candir

        System.out.println(str.substring(2,4));  // 2.indexden basla ama 4.index'e kadar va


        // Asagidaki kod calistiginda konsolda neler yazdirir?


        islem(5); // argument 5 / argumentin data turu int
        // method 1 calisir ve 10 yazdirir

        islem('s'); // 1 tane char parametresi olan method var mi ?
        // method 2 calisir ve v yazdirir

        islem(2.3f);
        // 1 tane float parametresi olan method var mi ?  YOK
        // casting ile kullanabilecegim bir method var mi ? method3 4.3 yazdirir

        islem(4,5); // islem int int
        // method5 calisir 9 yazdirir

        islem(4.4,5); // islem double int
        // method 4 calisir 1.4 yazdirir

        islem(4,5.5f); // islem int float %100 uyumlu yok
        // casting ile calistirabilecegimiz var mi ?
        // method6 calisir ve 4.0 yazdirir

        // islem(4,5.5); // islem int double %100 uyumlu yok
        // casting ile calistirabilecegimiz var mi ? YOK
        // CTE verir

        islem(4.1,5.2f); // islem double float 6.method ==> 4.1

        // islem(4.1,5.2); // islem double double
        // %100 uyumlu yok
        // casting ile calistirilabilecek yok
        // CTE

        short c = 3;
        islem(5,3); // islem int short
        // %100 uyumlu yok
        // casting ile calistirilabilecek var mi ?  4,5 ve 6 casting ile calisir
        // EGER casting ile calistiran birden fazla method varsa,
        // Java en az casting yapacagini tercih eder method 5 calisir 8 yazdirir

    }


    public static void islem(int a){
        System.out.println(a+a);
    }//method 1
    // signature ==> islem int

    public static void islem(char b){
        System.out.println( (char)(b+3) );
    }//method 2
    // signature ==> islem char

    public static void islem(double a){
        System.out.println(a+2);
    }//method 3
    // signature ==> islem double

    public static void islem(double a, int b){
        System.out.println(a+2-b);
    }//method 4
    // signature ==> islem double int

    public static void islem(int a, int b){
        System.out.println(a+b);
    }//method 5
    // signature ==> islem int int

    public static void islem(double a, float b){
        System.out.println(a);
    }//method 6
    // signature ==> islem double float




}
