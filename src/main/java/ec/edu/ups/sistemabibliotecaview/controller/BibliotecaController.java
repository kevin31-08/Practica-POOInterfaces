/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.controller;

import ec.edu.ups.sistemabibliotecaview.DAO.SistemaDAO;
import ec.edu.ups.sistemabibliotecaview.menuview.AutorView.ActualizarAutorView;
import ec.edu.ups.sistemabibliotecaview.menuview.AutorView.AgregarAutorView;
import ec.edu.ups.sistemabibliotecaview.menuview.AutorView.BuscarAutorView;
import ec.edu.ups.sistemabibliotecaview.menuview.AutorView.EliminarAutorView;
import ec.edu.ups.sistemabibliotecaview.menuview.BibliotecarioView.ActualizarBibliotecarioView;
import ec.edu.ups.sistemabibliotecaview.menuview.BibliotecarioView.AgregarBibliotecarioView;
import ec.edu.ups.sistemabibliotecaview.menuview.BibliotecarioView.BuscarBibliotecarioView;
import ec.edu.ups.sistemabibliotecaview.menuview.BibliotecarioView.EliminarBibliotecarioView;
import ec.edu.ups.sistemabibliotecaview.menuview.prestamoview.AgregarPrestamoView;
import ec.edu.ups.sistemabibliotecaview.menuview.prestamoview.BuscarPrestamoView;
import ec.edu.ups.sistemabibliotecaview.menuview.prestamoview.ListarPrestamoView;
import ec.edu.ups.sistemabibliotecaview.menuview.usuarioview.ActualizarUsuarioView;
import ec.edu.ups.sistemabibliotecaview.menuview.usuarioview.BuscarUsuarioView;
import ec.edu.ups.sistemabibliotecaview.menuview.usuarioview.EliminarUsuarioView;
import ec.edu.ups.sistemabibliotecaview.menuview.usuarioview.ListaUsuariosView;
import ec.edu.ups.sistemabibliotecaview.menuview.usuarioview.VentanaUsuarioView;


/**
 *
 * @author katherine
 */
public class BibliotecaController {

    //Dao
    private SistemaDAO sistemaDAO; 
    //Autores
    private AgregarAutorView agregarAutorView;
    private EliminarAutorView eliminarAutorView;
    private BuscarAutorView buscarAutorView;
    private ActualizarAutorView actualizarAutorView;
    //Bibliotecario
    private AgregarBibliotecarioView agregarBibliotecarioView;
    private EliminarBibliotecarioView eliminarBibliotecarioView;
    private BuscarBibliotecarioView buscarBibliotecarioView;
    private ActualizarBibliotecarioView actualizarBibliotecarioView;
    //Prestamo
    private BuscarPrestamoView buscarPrestamoView;
    private AgregarPrestamoView agregarPrestamoView;
    private ListarPrestamoView listarPrestamoView;
    //Devolucion
    private AgregarDevolucionView agregarDevolucionView;
    //Usuario
    private VentanaUsuarioView agregarUsuarioView;
    private EliminarUsuarioView eliminarUsuarioView;
    private BuscarUsuarioView buscarUsuarioView;
    private ActualizarUsuarioView actualizarUsuarioView;
    private ListaUsuariosView listaUsuariosView;
    //Menu
    
    
    public BibliotecaController() {
        
    }

}