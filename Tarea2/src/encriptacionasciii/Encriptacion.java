/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacionasciii;

import javax.swing.JOptionPane;

/**
 *
 * @author Zero
 */
public class Encriptacion {
    
    public static void main(String[] args) 
    
    {
        
        String mjs = null;
        String mjsencrip;
        String mjsdesemcriptado;
        char  array[];
        
        mjs = JOptionPane.showInputDialog("Ingrese su mensaje a encriptar");
        
        array=mjs.toCharArray();
        
        for (int i = 0; i < array.length; i++) 
        { 
             array[i]=(char)(array[i]+(char)6+(char)3);
             
        }
        mjsencrip = String.valueOf(array);
        System.out.println(mjs);
        System.out.println(mjsencrip);
        
        for (int i = 0; i < array.length; i++) 
        {
            array[i]=(char)(array[i]-(char)6-(char)3);
            
            mjsdesemcriptado = String.valueOf(array);
            System.out.println(mjsdesemcriptado);
        }
    }
    
}
