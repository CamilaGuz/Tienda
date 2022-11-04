package tienda.mapper;

import org.springframework.stereotype.Component;
import tienda.dto.DetalleOrdenDto;
import tienda.dto.OrdenDto;
import tienda.dto.ProductoDto;
import tienda.dto.UsuarioDto;
import tienda.entities.DetalleOrden;
import tienda.entities.Orden;
import tienda.entities.Producto;
import tienda.entities.Usuario;

import java.util.stream.Collectors;
@Component
public class Mapper {

    //PRODUCTO

    public static Producto productoDtoToEntity(ProductoDto dto, Producto producto){
        producto.setNombre(dto.getNombre());
        producto.setImagen(dto.getImagen());
        producto.setCantidad(dto.getCantidad());
        producto.setDescripcion(dto.getDescripcion());
        producto.setPrecio(dto.getPrecio());
        producto.setUsuario(dto.getUsuario());

        return producto;
    }

    public static ProductoDto productoEntityToDto(Producto producto, ProductoDto dto){
        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setImagen(producto.getImagen());
        dto.setCantidad(producto.getCantidad());
        dto.setDescripcion(producto.getDescripcion());
        dto.setPrecio(producto.getPrecio());
        dto.setUsuario(producto.getUsuario());

        return dto;
    }

    //USUARIO

    public static Usuario usuarioDtoToEntity(UsuarioDto dto, Usuario usuario){
        usuario.setNombre(dto.getNombre());
        usuario.setUserName(dto.getUserName());
        usuario.setPassword(dto.getPassword());
        usuario.setDireccion(dto.getDireccion());
        usuario.setEmail(dto.getEmail());
        usuario.setTelefono(dto.getTelefono());
        usuario.setTipo(dto.getTipo());

        usuario.setProductos(dto.getProductos().stream()
                                               .map(ProductoDto -> Mapper.productoDtoToEntity(ProductoDto, new Producto()))
                                               .collect(Collectors.toList()));
        usuario.setOrdenes(dto.getOrdenes().stream()
                                            .map(OrdenDto -> Mapper.ordenDtoToEntity(OrdenDto, new Orden()))
                                            .collect(Collectors.toList()));



        return usuario;
    }

    public static UsuarioDto usuarioEntityToDto(Usuario usuario, UsuarioDto dto){
        dto.setId(usuario.getId());
        dto.setNombre(usuario.getNombre());
        dto.setUserName(usuario.getUserName());
        dto.setPassword(usuario.getPassword());
        dto.setDireccion(usuario.getDireccion());
        dto.setEmail(usuario.getEmail());
        dto.setTelefono(usuario.getTelefono());
        dto.setTipo(usuario.getTipo());

        dto.setProductos(usuario.getProductos().stream()
                                           .map(Producto -> Mapper.productoEntityToDto(Producto, new ProductoDto()))
                                            .collect(Collectors.toList()));
        dto.setOrdenes(usuario.getOrdenes().stream()
                                            .map(Orden -> Mapper.ordenEntityToDto(Orden, new OrdenDto()))
                                          .collect(Collectors.toList()));

        return dto;
    }

    //ORDEN

    public static Orden ordenDtoToEntity( OrdenDto dto, Orden orden){
        orden.setDetalle(dto.getDetalle());
        orden.setNumero(dto.getNumero());
        orden.setFechaCreacion(dto.getFechaCreacion());
        orden.setFechaRecibida(dto.getFechaRecibida());
        orden.setUsuario(dto.getUsuario());
        orden.setTotal(dto.getTotal());

        return orden;
    }

    public static OrdenDto ordenEntityToDto(Orden orden, OrdenDto dto){
        dto.setId(orden.getId());
        dto.setDetalle(orden.getDetalle());
        dto.setNumero(orden.getNumero());
        dto.setFechaCreacion(orden.getFechaCreacion());
        dto.setFechaRecibida(orden.getFechaRecibida());
        dto.setUsuario(orden.getUsuario());
        dto.setTotal(orden.getTotal());

        return dto;

    }

    //DETALLE ORDEN

    public static DetalleOrden detalleOrdenDtoToEntity(DetalleOrdenDto dto, DetalleOrden detalleOrden){
        detalleOrden.setNombre(dto.getNombre());
        detalleOrden.setCantidad(dto.getCantidad());
        detalleOrden.setPrecio(dto.getPrecio());
        detalleOrden.setTotal(dto.getTotal());
        detalleOrden.setOrden(dto.getOrden());
        detalleOrden.setProducto(dto.getProducto());

        return detalleOrden;

    }

    public static DetalleOrdenDto detalleOrdenEntityToDto(DetalleOrden detalleOrden, DetalleOrdenDto dto){
        dto.setId(detalleOrden.getId());
        dto.setNombre(detalleOrden.getNombre());
        dto.setCantidad(detalleOrden.getCantidad());
        dto.setPrecio(detalleOrden.getPrecio());
        dto.setTotal(detalleOrden.getTotal());
        dto.setOrden(detalleOrden.getOrden());
        dto.setProducto(detalleOrden.getProducto());

        return dto;
    }



}
