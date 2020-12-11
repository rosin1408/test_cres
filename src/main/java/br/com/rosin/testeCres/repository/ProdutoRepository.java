package br.com.rosin.testeCres.repository;

import br.com.rosin.testeCres.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
