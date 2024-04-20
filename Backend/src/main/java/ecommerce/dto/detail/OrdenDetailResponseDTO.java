package ecommerce.dto.detail;

import jakarta.validation.constraints.NotNull;

public record OrdenDetailResponseDTO(
        @NotNull
        String nombre,

        @NotNull
        Integer cantidad,

        @NotNull
        Double precio,

        @NotNull
        Double subtotal,

        @NotNull
        Long productoId
) {

}
