package tienda.dto;

import lombok.Getter;
import lombok.Setter;
import tienda.entities.DetalleOrden;
import tienda.entities.Usuario;

import java.util.Date;

@Getter
@Setter
public class OrdenDto {

    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double total;

    private Usuario usuario;

    private DetalleOrden detalle;
}
