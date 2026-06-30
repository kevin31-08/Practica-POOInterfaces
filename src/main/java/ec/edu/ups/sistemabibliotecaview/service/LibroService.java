/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.service;

import ec.edu.ups.sistemabibliotecaview.DAO.LibroDAO;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Libro;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class LibroService {

    private LibroDAO libroDAO;

    public LibroService() {
        libroDAO = new LibroDAO();
    }

    public Libro agregarLibro(Libro libro) {
        if (libro == null) {
            return null;
        }

        if (libro.getIsbn() == null || libro.getIsbn().isEmpty()) {
            return null;
        }

        if (libro.getTitulo() == null || libro.getTitulo().isEmpty()) {
            return null;
        }

        if (libroDAO.buscar(libro.getIsbn()) != null) {
            return null;
        }

        return libroDAO.agregar(libro);
    }

    public Libro buscarLibro(String ISBN) {
        if (ISBN == null || ISBN.isEmpty()) {
            return null;
        }
        return libroDAO.buscar(ISBN);
    }

    public Libro actualizarLibro(Libro libro) {
        if (libro == null) {
            return null;
        }

        if (libro.getIsbn() == null || libro.getIsbn().isEmpty()) {
            return null;
        }

        if (libroDAO.buscar(libro.getIsbn()) == null) {
            return null;
        }

        return libroDAO.actualizar(libro);
    }

    public void eliminarLibro(String ISBN) {
        if (ISBN == null || ISBN.isEmpty()) {
            return;
        }
        libroDAO.eliminar(ISBN);
    }

    public List<Libro> listarLibro() {

        if (libroDAO == null) {
            return null;
        }

        List<Libro> lista = libroDAO.listar();

        if (lista == null) {
            return new ArrayList<>();
        }

        return lista;
    }

}
