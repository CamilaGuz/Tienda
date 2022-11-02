package tienda.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;
    private String userName;
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;
    private String password;

    @OneToMany(mappedBy = "usuario")
    private List<Producto> productos;

    @OneToMany(mappedBy = "usuario")
    private  List<Orden> ordenes;



}
