/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.DAO;

import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class LibroDAO implements SistemaDAO<Libro> {

    private ArrayList<Libro> libros = new ArrayList<>();

    public LibroDAO() {
        libros = new ArrayList<>();
    }

    
    @Override
    public Libro agregar(Libro libro) {
        libros.add(libro);
        return libro;
    }

  
    @Override
    public Libro buscar(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    
    @Override
    public Libro actualizar(Libro libro) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(libro.getIsbn())) {

                l.setTitulo(libro.getTitulo());
                l.setAutor(libro.getAutor());
                l.setEditorial(libro.getEditorial());
                return l;
            }
        }
        return null;
    }

  
    @Override
    public void eliminar(String isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)) {
                libros.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Libro> listar() {
        return libros;
    }

}
