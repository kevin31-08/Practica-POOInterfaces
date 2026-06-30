/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.DAO;

import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Autor;
import java.util.ArrayList;

/**
 *
 * @author katherine
 */
public class AutorDAO implements SistemaDAO<Autor> {

    private ArrayList<Autor> autores;

    public AutorDAO() {
        autores = new ArrayList<>();
    }
    

    @Override
    public Autor agregar(Autor datos) {
        autores.add(datos);
        return datos;
    }

    @Override
    public void eliminar(String cedula) {
        for (int i = 0; i < autores.size(); i++) {
            if (autores.get(i).getCedula().equals(cedula)) {
                autores.remove(i);
                break;
            }
        }

    }

    @Override
    public Autor buscar(String cedula) {
        for (Autor a : autores) {
            if (a.getCedula().equals(cedula)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public Autor actualizar(Autor datos) {
        for(Autor a : autores){
            if(a.getCedula().equals(datos.getCedula())){
                a.setNombre(datos.getNombre());
                a.setApellido(datos.getApellido());
                a.setTelefono(datos.getTelefono());
                a.setFechaNacimiento(datos.getFechaNacimiento());
                a.setNacionalidad(datos.getNacionalidad());
                a.setGeneroLiterario(datos.getGeneroLiterario());
                a.setBibliografia(datos.getBibliografia());
                return a;
            }
        }
        return null;
    }

}
