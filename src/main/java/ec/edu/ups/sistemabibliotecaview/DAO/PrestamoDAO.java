/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.DAO;

import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Prestamo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class PrestamoDAO implements SistemaDAO<Prestamo>{
    private ArrayList<Prestamo> prestamos;

    public PrestamoDAO() {
        prestamos = new ArrayList<>();
    }
    
    
    @Override
    public Prestamo agregar(Prestamo datos) {
        prestamos.add(datos);
        return datos;
    }

    @Override
    public void eliminar(String codigo) {
        for(int i = 0 ; i < prestamos.size(); i++){
            if(prestamos.get(i).getCodigoPrestamo().equals(codigo)){
                prestamos.remove(i);
                break;
            }
        }
        
   }

    @Override
    public Prestamo buscar(String codigo) {
        for(Prestamo p : prestamos){
            if (p.getCodigoPrestamo().equals(codigo)) {
                return p;
            }
        }
        return null;
   }

    @Override
    public Prestamo actualizar(Prestamo datos) {
                for (Prestamo p : prestamos) {
            if (p.getCodigoPrestamo().equals(datos.getCodigoPrestamo())) {

                p.setUsuario(datos.getUsuario());
                p.setLibro(datos.getLibro());
                p.setBibliotecario(datos.getBibliotecario());
                p.setFechaPrestamo(datos.getFechaPrestamo());
                p.setFechaDevolucion(datos.getFechaDevolucion());

                return p;
            }
        }
        return null;
    }

    @Override
    public List<Prestamo> listar() {
        return prestamos;
   }
}
    
    

