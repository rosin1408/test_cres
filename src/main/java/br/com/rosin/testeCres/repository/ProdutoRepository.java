package br.com.rosin.testeCres.repository;

import br.com.rosin.testeCres.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query("select p from Produto p where ?1 between p.idadeMinima and p.idadeMaxima")
    Produto findProdutoByIdade(int idade);
}
