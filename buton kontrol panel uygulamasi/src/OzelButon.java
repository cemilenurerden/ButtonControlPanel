import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OzelButon extends JButton {   //JButton miras alınır
    private boolean aktifmi = false;  //değişken buton etkin mi değil mi durumunu izler

    public OzelButon(String text) {  //kurucu metod
        super(text);  //JButtonun kurucu metodunu çağırır
        setPreferredSize(new Dimension(100, 50)); // Butonun boyutunu ayarlar
        setPasif(); // pasif metodu çağırılarak butonun önce pasif olması sağlanır

        addActionListener(new ActionListener() {   //butona tıklandığında işlem yapılır butonundurumunudegiştir metodu çalışır butona basıldığında
            public void actionPerformed(ActionEvent e) {
                butonunDurumunuDegistir();

            }
        });
    }

    public void setPasif() {
        setBackground(Color.RED); // Pasif rengi kırmızı ayarlanır
        aktifmi = false; //aktif degil demek
    }

    public void setAktif() {
        setBackground(Color.GREEN); // Aktif rengi yeşil ayarlanır
        aktifmi = true;  //aktif oldugunu söyler
    }

    public boolean isAktifmi() {
        return aktifmi;
    }

    public void butonunDurumunuDegistir() {  //butonun durumunu değiştiren metod
        if (isAktifmi()) {  //butuon aktifse
            setPasif();  //butonu pasif yap
        } else {
            // zaten pasifse
            Container pencere = getParent(); //pencereyi alır
            if (pencere != null) {
                for (Component bilesen : pencere.getComponents()) {  //bileşenleri alır
                    if (bilesen instanceof OzelButon) { // eger bilesen ozelbuton ise
                        ((OzelButon) bilesen).setPasif();  // pasif hale getirir
                    }
                }
            }
            setAktif(); // basılan butonu aktif hale getirir
        }
    }

}


