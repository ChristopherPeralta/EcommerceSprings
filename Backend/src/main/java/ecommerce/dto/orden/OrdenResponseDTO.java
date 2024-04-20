package ecommerce.dto.orden;

import ecommerce.dto.detail.OrdenDetailRequestDTO;
import ecommerce.dto.detail.OrdenDetailResponseDTO;

import java.util.List;

public record OrdenResponseDTO(
        Long id,
        String nombre,
        String descripcion,
        Double total,
        Long usuarioId,
        List<OrdenDetailResponseDTO> ordenDetailRequestDTOList

) {
}
