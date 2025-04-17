/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CasoPractico02.Caso02.domain;

/**
 *
 * @author lucas
 */
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="Funcion")
public class Funcion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Funcion")
    private Long idFuncion;
    private String titulo;
    private float precio;
    private String editorial;
    private String idioma;
    private int existencias;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;
    
    public Funcion(){
        
    }
    
    public Funcion(String titulo, boolean activo){
        this.titulo = titulo;
        this.activo = activo;
    }
    
}
