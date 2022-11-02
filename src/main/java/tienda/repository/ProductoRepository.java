package tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tienda.entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
