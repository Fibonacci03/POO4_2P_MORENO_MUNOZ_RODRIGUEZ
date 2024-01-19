/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Allan Rodriguez
 */
import java.io.*;
import java.util.Date;
import java.util.Random;

public class Reserva implements Pagable, Serializable {
    private static final long serialVersionUID = 1L;

    private String codigoReserva;
    private String cliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private Date fechaSalida;
    private Date fechaRegreso;
    private int numPasajeros;
    private String numVueloIda;
    private String numVueloRegreso;
    private double tarifaIda;
    private double tarifaRegreso;

    public Reserva(String cliente, String ciudadOrigen, String ciudadDestino, Date fechaSalida, Date fechaRegreso,
                   int numPasajeros, String numVueloIda, String numVueloRegreso, double tarifaIda, double tarifaRegreso) {
        this.codigoReserva = generarCodigoReserva();
        this.cliente = cliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.numPasajeros = numPasajeros;
        this.numVueloIda = numVueloIda;
        this.numVueloRegreso = numVueloRegreso;
        this.tarifaIda = tarifaIda;
        this.tarifaRegreso = tarifaRegreso;
    }
    
    
    
    // Métodos Getters
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public String getNumVueloIda() {
        return numVueloIda;
    }

    public String getNumVueloRegreso() {
        return numVueloRegreso;
    }

    public double getTarifaIda() {
        return tarifaIda;
    }

    public double getTarifaRegreso() {
        return tarifaRegreso;
    }

    // Métodos Setters
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public void setNumVueloIda(String numVueloIda) {
        this.numVueloIda = numVueloIda;
    }

    public void setNumVueloRegreso(String numVueloRegreso) {
        this.numVueloRegreso = numVueloRegreso;
    }

    public void setTarifaIda(double tarifaIda) {
        this.tarifaIda = tarifaIda;
    }

    public void setTarifaRegreso(double tarifaRegreso) {
        this.tarifaRegreso = tarifaRegreso;
    }
    
    
    
    
    
    
    

    private String generarCodigoReserva() {
        // Generar código de reserva aleatorio con 6 letras mayúsculas
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            char letra = (char) (random.nextInt(26) + 'A');
            codigo.append(letra);
        }

        return codigo.toString();
    }
    
    

    @Override
    public void realizarPago() {
        // Lógica para generar la transacción de pago
        // En este ejemplo, se crea un objeto Pago con valores ficticios            OJOOOOOOO
        Pago pago = new Pago(1, codigoReserva, tarifaIda + tarifaRegreso, 0.0, FormaPago.T, tarifaIda + tarifaRegreso);

        // Se puede imprimir o manejar el objeto Pago según sea necesario
        System.out.println("Transacción generada para la reserva " + codigoReserva + ": " + pago.toString());
    }
    
    
    

    public void escribirReserva(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write(toString() + "\n");

            System.out.println("Reserva guardada en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void serializarReserva() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(codigoReserva + ".bin"))) {
            outputStream.writeObject(this);

            System.out.println("Reserva serializada en el archivo: " + codigoReserva + ".bin");
        } catch (IOException e) {
            System.err.println("Error al serializar la reserva: " + e.getMessage());
        }
    }

    // Otros métodos, getters y setters según sea necesario

    @Override
    public String toString() {
        return "Reserva{" +
                "codigoReserva='" + codigoReserva + '\'' +
                ", cliente='" + cliente + '\'' +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                ", fechaSalida=" + fechaSalida +
                ", fechaRegreso=" + fechaRegreso +
                ", numPasajeros=" + numPasajeros +
                ", numVueloIda='" + numVueloIda + '\'' +
                ", numVueloRegreso='" + numVueloRegreso + '\'' +
                ", tarifaIda=" + tarifaIda +
                ", tarifaRegreso=" + tarifaRegreso +
                '}';
    }
}
