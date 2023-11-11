package br.com.cotiinformatica.repositories;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cotiinformatica.domain.entities.Fornecedor;
public interface FornecedorRepository extends JpaRepository<Fornecedor, UUID> {
}


