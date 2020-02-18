package br.unipe.rest.estudospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.rest.estudospring.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
