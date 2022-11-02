package tienda.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ordenes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double total;

    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;

}
