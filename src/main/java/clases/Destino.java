/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author jlmor
 */
public class Destino {
    private String ciudad;
    private String pais;

    public Destino(String ciudad, String pais) {
        this.ciudad = ciudad;
        this.pais = pais;
    }
    
    public ArrayList<String> leerDestino(String nombreArchivo){//Devuelve una lista con paises y ciudades leidos
        ArrayList<String> ciudadPais = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo, StandardCharsets.UTF_8))) {
                String linea;       
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                     
                    ciudadPais.add(linea.trim());
                      
                }
                
        }catch(IOException e){
             e.printStackTrace();
        }
        return ciudadPais;
        
    }
    
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
//    public static void main(String args[]){
//        Destino d1 = new Destino("Guayaquil","ecuador");
//        ArrayList <String> hola=d1.leerDestino("destinos.txt");
//        System.out.println(hola);
//    }
    
}
