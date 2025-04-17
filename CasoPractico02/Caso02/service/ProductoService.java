/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package CasoPractico02.Caso02.service;

/**
 *
 * @author lucas
 */
import CasoPractico02.Caso02.domain.Funcion;
import java.util.List;


public interface FuncionService {  
    public List<Funcion> getLibros(boolean activos);
 
    public Funcion getFuncion(Funcion funcion);

    public void save(Funcion funcion);
  
    public void delete(Funcion funcion);
}