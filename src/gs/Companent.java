/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gs;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author playr
 */
public class Companent {
    
    JTextField TxtIPBilgisi;
    JTextField TxtPortBilgisi;
    JButton btnSec;
    JButton btnGonder;
    JTextArea txtAOlaylar;

    public JTextField getTxtIPBilgisi() {
        return TxtIPBilgisi;
    }

    public void setTxtIPBilgisi(JTextField TxtIPBilgisi) {
        this.TxtIPBilgisi = TxtIPBilgisi;
    }

    public JTextField getTxtPortBilgisi() {
        return TxtPortBilgisi;
    }

    public void setTxtPortBilgisi(JTextField TxtPortBilgisi) {
        this.TxtPortBilgisi = TxtPortBilgisi;
    }

    public JButton getBtnSec() {
        return btnSec;
    }

    public void setBtnSec(JButton btnSec) {
        this.btnSec = btnSec;
    }

    public JButton getBtnGonder() {
        return btnGonder;
    }

    public void setBtnGonder(JButton btnGonder) {
        this.btnGonder = btnGonder;
    }

    public JTextArea getTxtAOlaylar() {
        return txtAOlaylar;
    }

    public void setTxtAOlaylar(JTextArea txtAOlaylar) {
        this.txtAOlaylar = txtAOlaylar;
    }
}
