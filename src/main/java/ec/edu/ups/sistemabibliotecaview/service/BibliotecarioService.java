/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.service;

import ec.edu.ups.sistemabibliotecaview.DAO.BibliotecarioDAO;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Bibliotecario;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class BibliotecarioService {

    private BibliotecarioDAO bibliotecarioDAO;

    public BibliotecarioService() {
        bibliotecarioDAO = new BibliotecarioDAO();
    }

    public Bibliotecario agregarBibliotecario(Bibliotecario bibliotecario) {
        if (bibliotecario == null) {
            return null;
        }

        if (bibliotecario.getCedula() == null || bibliotecario.getCedula().isEmpty()) {
            return null;
        }

        if (bibliotecarioDAO.buscar(bibliotecario.getCedula()) != null) {
            return null;
        }

        return bibliotecarioDAO.agregar(bibliotecario);
    }

    public Bibliotecario buscarBibliotecario(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            return null;
        }
        return bibliotecarioDAO.buscar(cedula);
    }

    public Bibliotecario actualizarBibliotecario(Bibliotecario bibliotecario) {
        if (bibliotecario == null) {
            return null;
        }

        if (bibliotecario.getCedula() == null || bibliotecario.getCedula().isEmpty()) {
            return null;
        }

        if (bibliotecarioDAO.buscar(bibliotecario.getCedula()) == null) {
            return null;
        }
        return bibliotecarioDAO.actualizar(bibliotecario);
    }

    public void eliminarBibliotecario(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            return;
        }
        bibliotecarioDAO.eliminar(cedula);
    }

    public List<Bibliotecario> listarBibliotecarios() {

        if (bibliotecarioDAO == null) {
            return null;
        }

        List<Bibliotecario> lista = bibliotecarioDAO.listar();

        if (lista == null) {
            return new ArrayList<>();
        }

        return lista;
    }
}
