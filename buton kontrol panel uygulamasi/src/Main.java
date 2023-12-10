import javax.swing.*;  //swing kütüphanesinin özelliklerini içeren java paketlerini kullanmamızı sağlar
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Buton Paneli");  //JFrame sınıfından bir pencere oluşturdum
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //pencere kapatıldığında uygulamanın çalışmasını durdudur
        frame.setLayout(new GridLayout(4, 4, 5, 5)); // bileşenlerin 4*4 lük yerleşmesini sağlar

        OzelButon[][] butonlar = new OzelButon[4][4];  //OzelButon sınıfından dizi oluşturduk

        for (int i = 0; i < 4; i++) {    //her satırda 4 buton oluşmasını sağlayan döngü.
            for (int j = 0; j < 4; j++) {
                OzelButon buton = new OzelButon("Buton " + (i * 4 + j + 1));
                frame.add(buton);   // buton pencereye eklenir
                butonlar[i][j] = buton;  // butonun referansını diziye atar
            }
        }

        frame.pack();  //boyut ayarlanır
        frame.setVisible(true);  // pencere görünür olur
    }
}

