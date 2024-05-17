package day03_ifElse_ternary_switch;

import java.util.Scanner;

public class C05_Switch {

    public static void main(String[] args) {

        // 5- Kullanicidan kacinci ayda oldugumuz bilgisini alip, mevsimi yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sayi olarak kacinci ayda oldugumuzu giriniz...");

        int ayNo = scanner.nextInt();


        if (ayNo==1 || ayNo==2 || ayNo==12){
            System.out.println("Kis");
        } else if (ayNo==3 ||ayNo==4 || ayNo==5) {
            System.out.println("Ilkbahar");
        } else if (ayNo==6 || ayNo==7 || ayNo==8 ) {
            System.out.println("Yaz");
        }else if (ayNo==9 || ayNo==10 || ayNo==11){
            System.out.println("Sonbahar");
        }else {
            System.out.println("Ay numarasi 1-12 arasinda olmali");
        }


        switch (ayNo){
            case 1 :
            case 2 :
            case 12 :
                System.out.println("Kis");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Ilkbahar");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Ay numarasi 1-12 arasinda olmali");

        }

    }
}
