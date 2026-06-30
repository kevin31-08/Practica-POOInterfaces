/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.DAO;

import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Bibliotecario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class BibliotecarioDAO implements SistemaDAO<Bibliotecario> {

    private ArrayList<Bibliotecario> bibliotecarios;

    @Override
    public Bibliotecario agregar(Bibliotecario datos) {
        bibliotecarios.add(datos);
        return datos;
    }

    @Override
    public void eliminar(String cedula) {
        for (int i = 0; i < bibliotecarios.size(); i++) {
            if (bibliotecarios.get(i).getCedula().equals(cedula)) {
                bibliotecarios.remove(i);
            }
        }
    }

    @Override
    public Bibliotecario buscar(String cedula) {
        for (Bibliotecario b : bibliotecarios) {
            if (b.getCedula().equals(cedula)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public Bibliotecario actualizar(Bibliotecario datos) {
        for (Bibliotecario b : bibliotecarios) {
            if (b.getCedula().equals(datos.getCedula())) {
                b.setNombre(datos.getNombre());
                b.setApellido(datos.getApellido());
                b.setTelefono(datos.getTelefono());
                b.setFechaNacimiento(datos.getFechaNacimiento());
                b.setCargo(datos.getCargo());
                b.setTurno(datos.getTurno());
                
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Bibliotecario> listar() {
        return bibliotecarios;
    }

}
