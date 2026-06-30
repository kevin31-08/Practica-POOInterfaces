/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.baseDeDatos;

/**
 *
 * @author katherine
 */
public class Devolucion {
    private Prestamo prestamo; 
    private String isbnLibro;
    private Date fechaDevolucion;

    public Devolucion() {
    }

    public Devolucion(Prestamo prestamo, String isbnLibro, Date fechaDevolucion) {
        this.prestamo = prestamo;
        this.isbnLibro = isbnLibro;
        this.fechaDevolucion = fechaDevolucion;
    }
    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }
    
    
    
}
