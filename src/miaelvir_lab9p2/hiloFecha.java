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
public class hiloFecha extends Thread{
    
    protected JLabel fecha; 

    public hiloFecha(JLabel fecha) {
        this.fecha = fecha;
    }

    @Override
    public void run() {
        while(true){
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("dd/MM/yyyy");
            fecha.setText( f.format(h) );
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
        }
    
    }
    
    
    
}
