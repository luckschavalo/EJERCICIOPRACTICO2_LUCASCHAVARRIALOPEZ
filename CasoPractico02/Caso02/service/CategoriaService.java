/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CasoPractico02.Caso02.service;

/**
 *
 * @author lucas
 */
import CasoPractico02.Caso02.Categoria;
import java.util.List;

public interface CategoriaService {
 
    public List<Categoria> getCategorias(boolean activos);
 
    public Categoria getCategoria(Categoria categoria);

    public void save(Categoria categoria);
  
    public void delete(Categoria categoria);
}
