/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO;

import javax.swing.JButton;
import javax.swing.JProgressBar;



/**
 *
 * @author FerSotox
 */
public class HiloProgreso extends Thread{

    JProgressBar Progreso;
    JButton salir;
    
    HiloProgreso(JProgressBar progreso1, JButton salir1) {
         super();
        this.Progreso=progreso1;
       this.salir=salir1;
        
    }
    
     public void run()
    {
      int i;  
        for(i=0;i<=100;i=i+10)
        {
            Progreso.setValue(i);
            pausa(100);
        }
        
       
        salir.doClick();
            
        
        Inicio ini=new Inicio();
        
        ini.setResizable(false);
        ini.setLocationRelativeTo(null);
        ini.setVisible(true);
        
         
        } 
   
     
    
      public void pausa(int mcSeg)
    {
        try
        {
            // pausa para el splash
            Thread.sleep(mcSeg);
        
            
        }catch(Exception e){}
    }
     
}
