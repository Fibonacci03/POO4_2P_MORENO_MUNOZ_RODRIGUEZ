package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Vuelo {
    
    private String origen;
    private String destino;
    private int duracion;
    private String horaSalida;
    private String horaLlegada;
    private String numVuelo;
    private String codAvion;
    private float precio;

    public Vuelo(String origen, String destino, int duracion, String horaSalida, String horaLlegada, String numVuelo, String codAvion, float precio) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.numVuelo = numVuelo;
        this.codAvion = codAvion;
        this.precio = precio;
    }
    
    public ArrayList<Vuelo> leerVuelo(String nombreArchivo){
        ArrayList<Vuelo> listavuelos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo, StandardCharsets.UTF_8))){
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                Vuelo vuelo = new Vuelo(datos[0],datos[1],Integer.parseInt(datos[2]),datos[3],datos[4],datos[5],datos[7],Float.parseFloat(datos[7]));
                listavuelos.add(vuelo);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return listavuelos;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(String numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getCodAvion() {
        return codAvion;
    }

    public void setCodAvion(String codAvion) {
        this.codAvion = codAvion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
