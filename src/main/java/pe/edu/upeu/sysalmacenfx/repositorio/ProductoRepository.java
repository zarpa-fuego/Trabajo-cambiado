package pe.edu.upeu.sysalmacenfx.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysalmacenfx.modelo.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
