/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconexionyimi;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author andrealaris
 */
public class Archivo {
     private String texto="";
        
    public String leerTxt(String direccion){//recibe dirccion de archivo
        try{
            BufferedReader bf=new BufferedReader(new FileReader(direccion));//recibe la direccion de nuestro archivo
            String temp="";
            String bfRead;
            while((bfRead=bf.readLine()) != null){
                temp=temp+bfRead;//se concatena el archivo y se guarda
            }
            texto=temp;
            
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        
        return texto;
        
        
    }
    
    public void separarCadena(){
        Character letra;
        String v[]=texto.split(" ");
        
        
        for(int i=0; i<v.length; i++){
            System.out.print(v[i]+"-");
        }
        
    }
    
}
