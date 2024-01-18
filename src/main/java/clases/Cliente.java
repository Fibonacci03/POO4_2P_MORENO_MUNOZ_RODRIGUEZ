package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;

    public Cliente(String cedula, String nombre, String apellido, String usuario, String contrasena) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public ArrayList<Cliente> leerClientes(String nombreArchivo){
        ArrayList<Cliente> listaclientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo, StandardCharsets.UTF_8))){
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                Cliente cliente = new Cliente(datos[0],datos[1],datos[2],datos[3],datos[4]);
                listaclientes.add(cliente);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return listaclientes;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
