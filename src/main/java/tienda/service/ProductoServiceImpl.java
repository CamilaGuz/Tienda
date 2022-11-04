package tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tienda.dto.ProductoDto;
import tienda.entities.Producto;
import tienda.mapper.Mapper;
import tienda.repository.ProductoRepository;

import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private Mapper mapper;


    @Override
    public ProductoDto save(ProductoDto productoDto) {
        Producto productoEntity = Mapper.productoDtoToEntity(productoDto, new Producto());
        Producto productoSaved = productoRepository.save(productoEntity);
        ProductoDto productoDtoResult = Mapper.productoEntityToDto(productoSaved, new ProductoDto());

        return productoDtoResult;

    }

    @Override
    public Optional<Producto> get(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }
}
