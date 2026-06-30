/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.controller;

import ec.edu.ups.sistemabibliotecaview.DAO.AutorDAO;
import ec.edu.ups.sistemabibliotecaview.DAO.BibliotecarioDAO;
import ec.edu.ups.sistemabibliotecaview.DAO.DevolucionDAO;
import ec.edu.ups.sistemabibliotecaview.DAO.LibroDAO;
import ec.edu.ups.sistemabibliotecaview.DAO.PrestamoDAO;
import ec.edu.ups.sistemabibliotecaview.DAO.UsuarioDAO;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Autor;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Bibliotecario;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Devolucion;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Libro;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Prestamo;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Usuario;

/**
 *
 * @author katherine
 */
public class BibliotecaController {

    private UsuarioDAO usuarioDAO;
    private LibroDAO libroDAO;
    private PrestamoDAO prestamoDAO;
    private AutorDAO autorDAO;
    private BibliotecarioDAO bibliotecarioDAO;
    private DevolucionDAO devolucionDAO;

    public BibliotecaController(UsuarioDAO usuarioDAO, LibroDAO libroDAO, PrestamoDAO prestamoDAO, AutorDAO autor, BibliotecarioDAO bibliotecario, DevolucionDAO devolucion) {
        this.usuarioDAO = usuarioDAO;
        this.libroDAO = libroDAO;
        this.prestamoDAO = prestamoDAO;
        this.autorDAO = autor;
        this.bibliotecarioDAO = bibliotecario;
        this.devolucionDAO = devolucion;
    }

    public Usuario agregarUsuario(Usuario usuario) {
        return usuarioDAO.agregar(usuario);
    }

    public Usuario buscarUsuario(String cedula) {
        return usuarioDAO.buscar(cedula);
    }

    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarioDAO.actualizar(usuario);
    }

    public void eliminarUsuario(String cedula) {
        usuarioDAO.eliminar(cedula);
    }

    public Autor agregarAutor(Autor autor) {
        return autorDAO.agregar(autor);
    }

    public Autor buscarAutor(String id) {
        return autorDAO.buscar(id);
    }

    public Autor actualizarAutor(Autor autor) {
        return autorDAO.actualizar(autor);
    }

    public void eliminarAutor(String id) {
        autorDAO.eliminar(id);
    }

    public Libro agregarLibro(Libro libro) {
        return libroDAO.agregar(libro);
    }

    public Libro buscarLibro(String codigo) {
        return libroDAO.buscar(codigo);
    }

    public Libro actualizarLibro(Libro libro) {
        return libroDAO.actualizar(libro);
    }

    public void eliminarLibro(String codigo) {
        libroDAO.eliminar(codigo);
    }

    public Bibliotecario agregarBibliotecario(Bibliotecario bibliotecario) {
        return bibliotecarioDAO.agregar(bibliotecario);
    }

    public Bibliotecario buscarBibliotecario(String cedula) {
        return bibliotecarioDAO.buscar(cedula);
    }

    public Bibliotecario actualizarBibliotecario(Bibliotecario bibliotecario) {
        return bibliotecarioDAO.actualizar(bibliotecario);
    }

    public void eliminarBibliotecario(String cedula) {
        bibliotecarioDAO.eliminar(cedula);
    }

    public Prestamo agregarPrestamo(Prestamo prestamo) {
        return prestamoDAO.agregar(prestamo);
    }

    public Prestamo buscarPrestamo(String codigo) {
        return prestamoDAO.buscar(codigo);
    }

    public Prestamo actualizarPrestamo(Prestamo prestamo) {
        return prestamoDAO.actualizar(prestamo);
    }

    public void eliminarPrestamo(String codigo) {
        prestamoDAO.eliminar(codigo);
    }

    public Devolucion agregarDevolucion(Devolucion devolucion) {
        return devolucionDAO.agregar(devolucion);
    }

    public Devolucion buscarDevolucion(String codigo) {
        return devolucionDAO.buscar(codigo);
    }

    public Devolucion actualizarDevolucion(Devolucion devolucion) {
        return devolucionDAO.actualizar(devolucion);
    }

    public void eliminarDevolucion(String codigo) {
        devolucionDAO.eliminar(codigo);
    }
}
