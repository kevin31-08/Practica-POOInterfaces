/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemabibliotecaview.DAO;

import ec.edu.ups.sistemabibliotecaview.baseDeDatos.Devolucion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katherine
 */
public class DevolucionDAO implements SistemaDAO<Devolucion>{
    private ArrayList<Devolucion> devoluciones;
    @Override
    public Devolucion agregar(Devolucion datos) {
        devoluciones.add(datos);
        return datos;
   }

    @Override
    public void eliminar(String isbn) {
          for (int i = 0; i < devoluciones.size(); i++) {
            if (devoluciones.get(i).getIsbnLibro().equals(isbn)) {
                devoluciones.remove(i);
                break;
            }
        }
    }

    @Override
    public Devolucion buscar(String isbn) {
        for (Devolucion d : devoluciones) {
            if (d.getIsbnLibro().equals(isbn)) {
                return d;
            }
        }
        return null;
    }

    @Override
    public Devolucion actualizar(Devolucion datos) {
         for (Devolucion d : devoluciones) {
            if (d.getIsbnLibro().equals(datos.getIsbnLibro())) {
                d.setPrestamo(datos.getPrestamo());
                d.setFechaDevolucion(datos.getFechaDevolucion());               
                return d;
            }
        }
        return null;
    }

    @Override
    public List<Devolucion> listar() {
        return devoluciones;
    }

    @Override
    public int contar() {
        return devoluciones.size();
    }
}
    

