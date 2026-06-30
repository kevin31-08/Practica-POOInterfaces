/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.baseDeDatos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author katherine
 */
public class Autor extends Persona {

    private String nacionalidad;
    private String generoLiterario;
    private String bibliografia;

    public Autor() {

    }

    public Autor(String nacionalidad, String generoLiterario, String bibliografia, ArrayList<Autor> autores, String cedula, String nombre, String apellido, String telefono, Date fechaNacimiento) {
        super(cedula, nombre, apellido, telefono, fechaNacimiento);
        this.nacionalidad = nacionalidad;
        this.generoLiterario = generoLiterario;
        this.bibliografia = bibliografia;
        
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public void actualizarDatos(Autor nuevo) {
        this.setNombre(nuevo.getNombre());
        this.setApellido(nuevo.getApellido());
        this.setTelefono(nuevo.getTelefono());
        this.nacionalidad = nuevo.nacionalidad;
        this.generoLiterario = nuevo.generoLiterario;
        this.bibliografia = nuevo.bibliografia;
    }

}
