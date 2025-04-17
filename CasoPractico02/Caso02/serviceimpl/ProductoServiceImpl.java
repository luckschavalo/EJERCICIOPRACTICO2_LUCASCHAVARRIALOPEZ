/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CasoPractico02.Caso02.serviceimpl;

/**
 *
 * @author lucas
 */
import CasoPractico02.Caso02.dao.ProductoDao;
import CasoPractico02.Caso02.domain.Producto;
import CasoPractico02.Caso02.service.FuncionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FuncionImpl implements LibroService {
      @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Libro> getLibros(boolean activos) {
        var lista=libroDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Libro getLibro(Libro libro){
        return libroDao.findById(libro.getIdLibro()).orElse(null);
    }
    @Override
    @Transactional
    public void save(Libro libro) {
        libroDao.save(libro);
    }
    
    @Override
    @Transactional
    public void delete(Libro libro){
        libroDao.delete(libro);
    }
}
