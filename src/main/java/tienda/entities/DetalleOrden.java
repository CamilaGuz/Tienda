package tienda.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "detalles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetalleOrden {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;

    @OneToOne
    private Orden orden;

    @ManyToOne
    private Producto producto;


}
