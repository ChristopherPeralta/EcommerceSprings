package ecommerce.service;

import ecommerce.dto.producto.ProductoRequestDTO;
import ecommerce.dto.producto.ProductoResponseDTO;

import java.util.List;

public interface ProductoService {

    List<ProductoResponseDTO> findAll();
    ProductoResponseDTO findById(Long id);
    ProductoResponseDTO save(ProductoRequestDTO productoRequestDTO);
    ProductoResponseDTO update(Long id, ProductoResponseDTO productoRequestDTO);
    void delete(Long id);
}
