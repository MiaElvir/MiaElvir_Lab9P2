/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaelvir_lab9p2;

import javax.swing.JProgressBar;

/**
 *
 * @author Usuario
 */
public class adminBarra extends Thread{    
    protected JProgressBar barra; 
    protected boolean vive; 
    protected boolean avanza; 

    public adminBarra(JProgressBar barra) {
        this.barra = barra;
        this.vive = true; 
        this.avanza = true; 
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanza() {
        return avanza;
    }

    public void setAvanza(boolean avanza) {
        this.avanza = avanza;
    }

    @Override
    public void run() {
        
        while (vive) {            

                barra.setValue(barra.getValue()+5);
                System.out.println(barra.getValue());
                if(barra.getValue()==120){
                    vive=false;
                    System.out.println(isVive());
                }  
                try {
                    Thread.sleep(80);
                } catch (InterruptedException ex) {
                }
            
        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
