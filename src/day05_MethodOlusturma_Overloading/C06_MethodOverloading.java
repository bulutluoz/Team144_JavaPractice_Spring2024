package day05_MethodOlusturma_Overloading;

public class C06_MethodOverloading {

    public static void main(String[] args) {
        // Asagidaki kod calistiginda konsolda neler yazdirir?

        /*
        islem(5);
        islem('s');
        islem(2.3f);
        islem(4,5);
        islem(4.4,5);
        islem(4,5.5f);
        islem(4,5.5);
        islem(4.1,5.2f);
        islem(4.1,5.2);2
         */

    }


    public static void islem(int a){
        System.out.println(a+a);
    }//method 1

    public static void islem(char a){
        System.out.println( (char)(a+3) );
    }//method 2

    public static void islem(double a){
        System.out.println(a+2);
    }//method 3

    public static void islem(double a, int b){
        System.out.println(a+2-b);
    }//method 4

    public static void islem(int a, int b){
        System.out.println(a+b);
    }//method 5

    public static void islem(double a, float b){
        System.out.println(a);
    }//method 6




}
