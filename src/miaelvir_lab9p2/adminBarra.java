/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaelvir_lab9p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author Usuario
 */
public class adminBarra extends Thread{    
    protected JProgressBar barra; 
    protected boolean vive; 
    protected boolean avanza; 
    protected File archivo;
    protected JTextArea area; 
    

    public adminBarra(JProgressBar barra, File archivo, JTextArea a) {
        this.barra = barra;
        this.vive = true; 
        this.avanza = true; 
        this.archivo = archivo;
        this.area = a; 
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
                    Thread.sleep(40);
                } catch (InterruptedException ex) {
                }
            
        }
        String area = ""; 
        if (vive == false) {
            
                            
                FileReader fr = null; 
                BufferedReader br = null; 
                try {
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    String temp = ""; 
                    while ((temp = br.readLine()) != null) {                        
                        area+=temp;
                        area+="\n";
                    }
                    this.area.setText(area);
                    
                } catch (Exception e) {
                }
            
     

        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
