/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.baseDeDatos;

import java.util.Date;

/**
 *
 * @author katherine
 */
public class Usuario extends Persona {

    private String correoElectronico;
    private String direccion;

    public Usuario() {
    }

    public Usuario(String correoElectronico, String direccion, String cedula, String nombre, String apellido, String telefono, Date fechaNacimiento) {
        super(cedula, nombre, apellido, telefono, fechaNacimiento);
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

   
}
