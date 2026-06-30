/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.DAO;

/**
 *
 * @author katherine
 */
public interface SistemaDAO<T> {
    T agregar(T datos);
    void eliminar(String cedula);
    T buscar(String cedula);
    T actualizar(T datos);
    
}
