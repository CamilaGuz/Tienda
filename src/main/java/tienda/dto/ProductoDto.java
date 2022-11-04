package tienda.dto;

import lombok.Getter;
import lombok.Setter;
import tienda.entities.Usuario;

import javax.persistence.ManyToOne;

@Getter
@Setter
public class ProductoDto {


    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private double precio;
    private int cantidad;
    private Usuario usuario;
}
