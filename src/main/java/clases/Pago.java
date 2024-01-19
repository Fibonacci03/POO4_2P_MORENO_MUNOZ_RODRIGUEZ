/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Allan Rodriguez
 */
public class Pago {
    
    private int id;
    private String codigoReserva;
    private double totalReserva;
    private double descuento;
    private FormaPago formaDePago;
    private double totalPagar;

    public Pago(int id, String codigoReserva, double totalReserva, double descuento, FormaPago formaDePago, double totalPagar) {
        this.id = id;
        this.codigoReserva = codigoReserva;
        this.totalReserva = totalReserva;
        this.descuento = descuento;
        this.formaDePago = formaDePago;
        this.totalPagar = totalPagar;
    }

    // Métodos Getters
    public int getId() {
        return id;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public double getTotalReserva() {
        return totalReserva;
    }

    public double getDescuento() {
        return descuento;
    }

    public FormaPago getFormaDePago() {
        return formaDePago;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    // Métodos Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public void setTotalReserva(double totalReserva) {
        this.totalReserva = totalReserva;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setFormaDePago(FormaPago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    
    public void escribirPago(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write(id + ",");
            writer.write(codigoReserva + ",");
            writer.write(totalReserva + ",");
            writer.write(descuento + ",");
            writer.write(formaDePago + ",");
            writer.write(totalPagar + "\n");

            System.out.println("Información de Pago escrita en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
    
    
    

    // Método toString para facilitar la visualización de la información
    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", codigoReserva='" + codigoReserva + '\'' +
                ", totalReserva=" + totalReserva +
                ", descuento=" + descuento +
                ", formaDePago='" + formaDePago + '\'' +
                ", totalPagar=" + totalPagar +
                '}';
    }
    
}
