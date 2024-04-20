package ecommerce.service.impl;

import ecommerce.dto.producto.ProductoRequestDTO;
import ecommerce.dto.producto.ProductoResponseDTO;
import ecommerce.model.Producto;
import ecommerce.repository.ProductoRepository;
import ecommerce.service.ProductoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    /*@Autowired
    private CategoriaServiceImpl categoriaService;
*/
    @Override
    public List<ProductoResponseDTO> findAll() {
        return productoRepository.findAll()
                .stream()
                .map(ProductoResponseDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public ProductoResponseDTO findById(Long id) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Producto con id " + id + " no encontrado"));
        return new ProductoResponseDTO(producto);
    }

    @Override
    public ProductoResponseDTO save(ProductoRequestDTO productoRequestDTO) {
        return null;
    }

    /*
        @Override
        public ProductoResponseDTO save(ProductoResponseDTO productoRequestDTO) {
            Categoria categoria = categoriaService.findById(productoRequestDTO.categoria().id())
                    .orElseThrow(() -> new EntityNotFoundException("Categoria con id " + productoRequestDTO.categoria().id() + " no encontrado"));
            try {
                Producto producto = Producto.builder()
                        .nombre(productoRequestDTO.nombre())
                        .descripcion(productoRequestDTO.descripcion())
                        .precio(productoRequestDTO.precio())
                        .precioCompra(productoRequestDTO.precioCompra())
                        .stock(productoRequestDTO.stock())
                        .imagen(productoRequestDTO.imagen())
                        .categoria(productoRequestDTO.categoria())
                        .build();
                Producto entitySaved = productoRepository.save(producto);
                return new ProductoResponseDTO(entitySaved);
            } catch (Exception e) {
                throw new ServiceException("Error occurred while saving Producto", e);
            }
        }
    */
    @Override
    public ProductoResponseDTO update(Long id, ProductoResponseDTO productoRequestDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
