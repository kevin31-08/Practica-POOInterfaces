/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.DAO;

import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class UsuarioDAOMemoria implements SistemaDAO<Usuario> {

    private List<Usuario> usuarios;

    public UsuarioDAOMemoria() {
        usuarios = new ArrayList<>();
    }

    @Override
    public void agregar(Usuario datos) {
        usuarios.add(datos);
    }

    @Override
    public void eliminar(String cedula) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCedula().equals(cedula)) {
                usuarios.remove(i);
                break;
            }
        }

    }

    @Override
    public Usuario buscar(String cedula) {
        for (Usuario u : usuarios) {
            if (u.getCedula().equals(cedula)) {
                return u;
            }
        }
        return null;
    }
    
    @Override
    public void actualizar(Usuario datos) {
        for (Usuario u : usuarios) {
            if(u.getCedula().equals(datos.getCedula())){
                u.setNombre(datos.getNombre());
                u.setApellido(datos.getApellido());
                u.setTelefono(datos.getTelefono());
                u.setFechaNacimiento(datos.getFechaNacimiento());
                u.setCorreoElectronico(datos.getCorreoElectronico());
                u.setDireccion(datos.getDireccion());
            }
        }
    }

    @Override
    public List<Usuario> listar() {
        return usuarios;
        
   }

    @Override
    public int contar() {
        return usuarios.size();
    }
}
