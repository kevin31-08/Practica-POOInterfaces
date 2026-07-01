/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.service;

import ec.edu.ups.sistemabibliotecaview.DAO.PrestamoDAO;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Libro;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Prestamo;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class PrestamoService {

    private PrestamoDAO prestamoDAO;

    public PrestamoService() {
        prestamoDAO = new PrestamoDAO();
    }

    public Prestamo agregarPrestamo(Prestamo prestamo) {

        if (prestamo == null) {
            return null;
        }

        if (prestamo.getCodigoPrestamo() == null || prestamo.getCodigoPrestamo().isEmpty()) {
            return null;
        }

        Usuario usuario = prestamo.getUsuario();
        Libro libro = prestamo.getLibro();

        if (usuario == null || usuario.getCedula() == null) {
            return null;
        }

        if (libro == null || !libro.isDisponible()) {
            return null;
        }

        if (prestamoDAO.buscar(prestamo.getCodigoPrestamo()) != null) {
            return null;
        }

        libro.setDisponible(false);

        return prestamoDAO.agregar(prestamo);
    }

    public Prestamo buscarPrestamo(String codigo) {

        if (codigo == null || codigo.isEmpty()) {
            return null;
        }

        return prestamoDAO.buscar(codigo);
    }

    public Prestamo actualizarPrestamo(Prestamo prestamo) {

        if (prestamo == null) {
            return null;
        }

        if (prestamo.getCodigoPrestamo() == null || prestamo.getCodigoPrestamo().isEmpty()) {
            return null;
        }

        if (prestamoDAO.buscar(prestamo.getCodigoPrestamo()) == null) {
            return null;
        }

        return prestamoDAO.actualizar(prestamo);
    }

    public void eliminarPrestamo(String codigo) {

        if (codigo == null || codigo.isEmpty()) {
            return;
        }

        prestamoDAO.eliminar(codigo);
    }

    public List<Prestamo> listarPrestamo() {

        if (prestamoDAO == null) {
            return null;
        }

        List<Prestamo> lista = prestamoDAO.listar();

        if (lista == null) {
            return new ArrayList<>();
        }

        return lista;
    }

    public int contarPrestamos() {
        return prestamoDAO.contar();
    }
}
