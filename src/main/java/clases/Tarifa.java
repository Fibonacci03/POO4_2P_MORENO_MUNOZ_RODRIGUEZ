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
import java.util.List;

/**
 *
 * @author jlmor
 */
public class Tarifa {
    private String nombre;
    private String descripcion;
    private ArrayList<String> caracteristicas;

    public Tarifa(String nombre, String descripcion, ArrayList<String> caracteristicas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
    }
    
    public ArrayList<String> leerTarifa(String nombreArchivo){//Devuelve una lista con el contenido de la tarifa
        ArrayList<String> infoTarifa = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo, StandardCharsets.UTF_8))) {
                String linea;       
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                     
                    infoTarifa.add(linea.trim());
                      
                }
        }catch(IOException e){
            e.printStackTrace();
        }
        return infoTarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
//    public static void main(String args[]){
//        Tarifa d1 = new Tarifa("ombre","descripccion",new ArrayList<>(List.of("s","d","e")));
//        ArrayList <String> hola=d1.leerTarifa("tarifas.txt");
//        System.out.println(hola);
//    }
}
