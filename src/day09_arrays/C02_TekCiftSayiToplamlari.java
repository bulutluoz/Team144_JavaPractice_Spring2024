package day09_arrays;

public class C02_TekCiftSayiToplamlari {

    public static void main(String[] args) {
        // 1- Verilen bir array’deki tek sayilari ve cift sayilari ayri ayri toplayip,
        //    hangi toplam daha buyukse “Tekler kazandi” veya “Ciftler kazandi” seklinde yazdirin.

        int[] arr = {1,4,6,7,8,9,5,3,6,9,1,3,5,7,6,8,1,3,4,6,7,8};

        int teklerinToplami = 0;
        int ciftlerinToplami = 0;


        for (int each : arr
             ) {

            if (each  % 2 == 0){
                ciftlerinToplami += each;
            }else {
                teklerinToplami += each;
            }
        }

        System.out.println("Teklerin toplami : " + teklerinToplami +
                            ", ciftlerin toplami : " + ciftlerinToplami);

        if (teklerinToplami > ciftlerinToplami) System.out.println("Tekler kazandi");
        else if (ciftlerinToplami > teklerinToplami) System.out.println("Ciftler kazandi");
        else System.out.println("Berabere");

    }
}
