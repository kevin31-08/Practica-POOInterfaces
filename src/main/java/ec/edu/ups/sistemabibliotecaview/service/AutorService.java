/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.service;

import ec.edu.ups.sistemabibliotecaview.DAO.AutorDAO;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Autor;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class AutorService {

    private AutorDAO autorDAO;

    public AutorService() {
        autorDAO = new AutorDAO();
    }

    public Autor agregarAutor(Autor autor) {
        if (autor == null) {
            return null;
        }

        if (autor.getCedula() == null || autor.getCedula().isEmpty()) {
            return null;
        }

        if (autor.getNombre() == null || autor.getNombre().isEmpty()) {
            return null;
        }

        if (autorDAO.buscar(autor.getCedula()) != null) {
            return null;
        }

        return autorDAO.agregar(autor);
    }

    public Autor buscarAutor(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            return null;
        }
        return autorDAO.buscar(cedula);
    }

    public Autor actualizarAutor(Autor autor) {
        if (autor == null) {
            return null;
        }

        if (autor.getCedula() == null || autor.getCedula().isEmpty()) {
            return null;
        }

        if (autorDAO.buscar(autor.getCedula()) == null) {
            return null;
        }

        return autorDAO.actualizar(autor);
    }

    public void eliminarAutor(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            return;
        }
        autorDAO.eliminar(cedula);
    }

    public List<Autor> listarAutors() {

        if (autorDAO == null) {
            return null;
        }

        List<Autor> lista = autorDAO.listar();

        if (lista == null) {
            return new ArrayList<>();
        }

        return lista;
    }

}
