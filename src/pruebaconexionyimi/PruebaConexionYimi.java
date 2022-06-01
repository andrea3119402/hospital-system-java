/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconexionyimi;


public class PruebaConexionYimi {

   
    public static void main(String[] args) {
        //archivo de texto
        Archivo a=new Archivo();
        a.leerTxt("/Users/andrealaris/Desktop/reporte.txt");
        a.separarCadena();
        
        Ventana1 v=new Ventana1();
        v.setVisible(true);
        
        
       
        
        
       
      
    }   
    
}
