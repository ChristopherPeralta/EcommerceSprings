package ecommerce.repository;

import ecommerce.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioEntityRepository extends JpaRepository<UsuarioEntity,Long> {
}
