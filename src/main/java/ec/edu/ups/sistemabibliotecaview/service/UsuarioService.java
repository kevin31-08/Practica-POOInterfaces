/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.service;

import ec.edu.ups.sistemabibliotecaview.DAO.UsuarioDAO;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Autor;
import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class UsuarioService {

    private UsuarioDAO usuarioDAO;

    public UsuarioService() {
        usuarioDAO = new UsuarioDAO();
    }

    public Usuario agregarUsuario(Usuario usuario) {
        if (usuario == null) {
            return null;
        }

        if (usuario.getCedula() == null || usuario.getCedula().isEmpty()) {
            return null;
        }

        if (usuario.getNombre() == null || usuario.getNombre().isEmpty()) {
            return null;
        }

        if (usuarioDAO.buscar(usuario.getCedula()) != null) {
            return null;
        }
        return usuarioDAO.agregar(usuario);
    }

    public Usuario buscarUsuario(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            return null;
        }

        return usuarioDAO.buscar(cedula);
    }

    public Usuario actualizarUsuario(Usuario usuario) {
        if (usuario == null) {
            return null;
        }

        if (usuario.getCedula() == null || usuario.getCedula().isEmpty()) {
            return null;
        }

        if (usuarioDAO.buscar(usuario.getCedula()) == null) {
            return null;
        }
        return usuarioDAO.actualizar(usuario);
    }

    public void eliminarUsuario(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            return;
        }
        usuarioDAO.eliminar(cedula);
    }

    public List<Usuario> listarUsuarios() {

        if (usuarioDAO == null) {
            return null;
        }

        List<Usuario> lista = usuarioDAO.listar();

        if (lista == null) {
            return new ArrayList<>();
        }

        return lista;
    }

    public int contarUsuarios() {
        return usuarioDAO.contar();
    }

}
