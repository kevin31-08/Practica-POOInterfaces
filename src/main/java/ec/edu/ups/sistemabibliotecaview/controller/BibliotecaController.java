/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.controller;

import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Autor;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Bibliotecario;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Devolucion;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Libro;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Prestamo;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Usuario;
import ec.edu.ups.sistemabibliotecaview.service.AutorService;
import ec.edu.ups.sistemabibliotecaview.service.BibliotecarioService;
import ec.edu.ups.sistemabibliotecaview.service.DevolucionService;
import ec.edu.ups.sistemabibliotecaview.service.LibroService;
import ec.edu.ups.sistemabibliotecaview.service.PrestamoService;
import ec.edu.ups.sistemabibliotecaview.service.UsuarioService;

/**
 *
 * @author katherine
 */
public class BibliotecaController {

    private UsuarioService usuarioService;
    private LibroService libroService;
    private PrestamoService prestamoService;
    private AutorService autorService;
    private BibliotecarioService bibliotecarioService;
    private DevolucionService devolucionService;

    public BibliotecaController() {
        usuarioService = new UsuarioService();
        libroService = new LibroService();
        prestamoService = new PrestamoService();
        autorService = new AutorService();
        bibliotecarioService = new BibliotecarioService();
        devolucionService = new DevolucionService();
    }

    public Usuario buscarUsuario(String cedula) {
        return usuarioService.buscarUsuario(cedula);
    }

    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarioService.actualizarUsuario(usuario);
    }

    public void eliminarUsuario(String cedula) {
        usuarioService.eliminarUsuario(cedula);
    }

    public Autor agregarAutor(Autor autor) {
        return autorService.agregarAutor(autor);
    }

    public Autor buscarAutor(String id) {
        return autorService.buscarAutor(id);
    }

    public Autor actualizarAutor(Autor autor) {
        return autorService.actualizarAutor(autor);
    }

    public void eliminarAutor(String id) {
        autorService.eliminarAutor(id);
    }

    public Libro agregarLibro(Libro libro) {
        return libroService.agregarLibro(libro);
    }

    public Libro buscarLibro(String isbn) {
        return libroService.buscarLibro(isbn);
    }

    public Libro actualizarLibro(Libro libro) {
        return libroService.actualizarLibro(libro);
    }

    public void eliminarLibro(String isbn) {
        libroService.eliminarLibro(isbn);
    }

    public Bibliotecario agregarBibliotecario(Bibliotecario b) {
        return bibliotecarioService.agregarBibliotecario(b);
    }

    public Bibliotecario buscarBibliotecario(String cedula) {
        return bibliotecarioService.buscarBibliotecario(cedula);
    }

    public Bibliotecario actualizarBibliotecario(Bibliotecario b) {
        return bibliotecarioService.actualizarBibliotecario(b);
    }

    public void eliminarBibliotecario(String cedula) {
        bibliotecarioService.eliminarBibliotecario(cedula);
    }

    public Prestamo agregarPrestamo(Prestamo p) {
        return prestamoService.agregarPrestamo(p);
    }

    public Prestamo buscarPrestamo(String codigo) {
        return prestamoService.buscarPrestamo(codigo);
    }

    public Prestamo actualizarPrestamo(Prestamo p) {
        return prestamoService.actualizarPrestamo(p);
    }

    public void eliminarPrestamo(String codigo) {
        prestamoService.eliminarPrestamo(codigo);
    }

    public Devolucion agregarDevolucion(Devolucion d) {
        return devolucionService.agregarDevolucion(d);
    }

    public Devolucion buscarDevolucion(String codigo) {
        return devolucionService.buscarDevolucion(codigo);
    }

    public Devolucion actualizarDevolucion(Devolucion d) {
        return devolucionService.actualizarDevolucion(d);
    }

    public void eliminarDevolucion(String codigo) {
        devolucionService.eliminarDevolucion(codigo);
    }
}
