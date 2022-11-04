package tienda.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import tienda.dto.ProductoDto;
import tienda.entities.Producto;
import tienda.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<ProductoDto> save(@RequestBody ProductoDto productoDto){
        ProductoDto productoSaved = productoService.save(productoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoSaved);
    }





}
