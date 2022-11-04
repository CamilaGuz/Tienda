package tienda.dto;

import lombok.Getter;
import lombok.Setter;
import tienda.entities.Orden;
import tienda.entities.Producto;


@Getter
@Setter
public class DetalleOrdenDto {

    private Integer id;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;

    private Orden orden;
    private Producto producto;




}
