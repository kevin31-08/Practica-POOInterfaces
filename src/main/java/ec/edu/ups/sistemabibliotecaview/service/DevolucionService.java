/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.service;

import ec.edu.ups.sistemabibliotecaview.DAO.DevolucionDAO;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Devolucion;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class DevolucionService {

    private DevolucionDAO devolucionDAO;

    public DevolucionService() {
        devolucionDAO = new DevolucionDAO();
    }

    public Devolucion agregarDevolucion(Devolucion devolucion) {
        if (devolucion == null) {
            return null;
        }

        if (devolucion.getIsbnLibro() == null || devolucion.getIsbnLibro().isEmpty()) {
            return null;
        }

        if (devolucionDAO.buscar(devolucion.getIsbnLibro()) != null) {
            return null;
        }
        return devolucionDAO.agregar(devolucion);
    }

    public Devolucion buscarDevolucion(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
        return devolucionDAO.buscar(codigo);
    }

    public Devolucion actualizarDevolucion(Devolucion devolucion) {
        if (devolucion == null) {
            return null;
        }

        if (devolucion.getIsbnLibro() == null || devolucion.getIsbnLibro().isEmpty()) {
            return null;
        }

        if (devolucionDAO.buscar(devolucion.getIsbnLibro()) == null) {
            return null;
        }
        return devolucionDAO.actualizar(devolucion);
    }

    public void eliminarDevolucion(String isbn) {
        if (isbn == null || isbn.isEmpty()) {
            return;
        }
        devolucionDAO.eliminar(isbn);
    }

    public List<Devolucion> listarDevolucions() {

        if (devolucionDAO == null) {
            return null;
        }

        List<Devolucion> lista = devolucionDAO.listar();

        if (lista == null) {
            return new ArrayList<>();
        }

        return lista;
    }
}
