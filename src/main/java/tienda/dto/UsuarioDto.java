package tienda.dto;

import lombok.Getter;
import lombok.Setter;
import tienda.entities.Orden;
import tienda.entities.Producto;


import java.util.List;

@Getter
@Setter
public class UsuarioDto {

    private Integer id;
    private String nombre;
    private String userName;
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;
    private String password;

    private List<ProductoDto> productos;

    private  List<OrdenDto> ordenes;
}
