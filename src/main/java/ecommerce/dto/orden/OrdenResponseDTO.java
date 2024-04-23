package ecommerce.dto.orden;

import ecommerce.dto.detail.OrdenDetailRequestDTO;
import ecommerce.dto.detail.OrdenDetailResponseDTO;
import ecommerce.model.Orden;
import ecommerce.model.OrdenDetail;
import ecommerce.model.Producto;

import java.util.List;

public record OrdenResponseDTO(
        Long id,
        Double total,
        String usuario,
        List<OrdenDetail> ordenDetailResponseDTOList
) {

    public OrdenResponseDTO(Orden orden) {
        this(orden.getId(), orden.getTotal(),
                orden.getUsuarioEntity().getUsername(),orden.getOrdenDetailList());
    }


}
