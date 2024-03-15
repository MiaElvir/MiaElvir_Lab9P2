/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaelvir_lab9p2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class hiloHora extends Thread{    
    protected JLabel label; 

    public hiloHora(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
         while(true){
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
            label.setText( f.format(h) );
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
        }
         
    }
    
    
}
