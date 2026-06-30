/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.DAO;

import java.util.List;

/**
 *
 * @author katherine
 */
public interface SistemaDAO<T> {
    T agregar(T datos);
    void eliminar(String cedula);
    T buscar(String id);
    T actualizar(T datos);
    List<T> listar();
}
