
package Kontroller;

import gs.Companent;
import gs.Veri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import view.Anasayfa;


public class Baglanti {

   Companent nesne;

    public Baglanti(Companent nesne) {
        this.nesne = nesne; 
    }
    
    Socket soket; 
    ObjectOutputStream out;
    
   public void kontrol(){
       try {
           soket = new Socket(nesne.getTxtIPBilgisi().getText(),Integer.valueOf(nesne.getTxtPortBilgisi().getText()));
           olayYukle("Sunucuya Bağlanıldı");
           out=new ObjectOutputStream(soket.getOutputStream()); 
           Veri veri = new Veri();
           veri.setName("yeni kullanıc");
           out.writeObject(veri);
           out.flush();
       } catch (IOException ex) {
           System.out.println(ex);
       }
       
   }
   
   public void secGonder()
   {
       try {
           JFileChooser dosyaAc = new JFileChooser();
           int x = dosyaAc.showOpenDialog(Anasayfa.burasi);
           if (x == JFileChooser.APPROVE_OPTION) {
               File dosya = dosyaAc.getSelectedFile();
               FileInputStream in = new FileInputStream(dosya);
               byte dizi[] = new byte[in.available()];
               in.read(dizi);
               Veri veri = new Veri();
               veri.setName(dosya.getName());
               veri.setFile(dizi);
               out.writeObject(veri);
               out.flush();
               olayYukle("Veri Gönderildi.");
               
               
           }
           
       } catch (Exception e) {
       }
   }
   
   void olayYukle(String mesaj)
   {
       String olaylar = nesne.getTxtAOlaylar().getText();
       nesne.getTxtAOlaylar().selectAll();
       nesne.getTxtAOlaylar().replaceSelection("");
       nesne.getTxtAOlaylar().append(mesaj + "\n" + olaylar);
   }
}
