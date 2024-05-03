package day01_variables_scanner;

import javax.swing.*;
import java.util.Scanner;

public class C05_PopupKullanma {

    public static void main(String[] args) {

        // 4.soruyu JOptionPane kullanarak prompt seklinde cozun

        String isim = JOptionPane.showInputDialog("lutfen isminizi giriniz...");

        System.out.println();

        String soyisim = JOptionPane.showInputDialog("lutfen soyisminizi giriniz...");

        System.out.println("Gunde kac cay iciyorsunuz ve kac seker atiyorsunuz");

        String caySayisiStr = JOptionPane.showInputDialog("Gunde kac cay iciyorsunuz?");
        int caySayisi = Integer.parseInt(caySayisiStr);

        String sekerSayisiStr = JOptionPane.showInputDialog("Her caya kac seker atiyorsunuz?");
        double sekerSayisi = Double.parseDouble(sekerSayisiStr);

        // once hesabi yapalim

        double yillikSekerMiktari = caySayisi * sekerSayisi * 365 * 0.004;

        JOptionPane.showMessageDialog(null,"isim : " + isim.charAt(0) + " " + soyisim +
                "\ngunluk cay adedi : " + caySayisi +
                "\nyillik tuketilen seker miktari : " + yillikSekerMiktari + " Kg");

    }
}
