package tienda.service;

import tienda.dto.ProductoDto;
import tienda.entities.Producto;

import java.util.Optional;

public interface ProductoService {

    ProductoDto save (ProductoDto productoDto);
    public Optional<Producto> get(Integer id);
    public void update (Producto producto);
    public void delete(Integer id);

}
