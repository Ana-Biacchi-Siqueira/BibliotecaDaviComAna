package br.com.aceleragep.biblioteca.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aceleragep.biblioteca.entities.AutorEntity;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity, Long> {

	Page<AutorEntity> findAll(Pageable paginacao);

}