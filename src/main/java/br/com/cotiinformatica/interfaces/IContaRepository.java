package br.com.cotiinformatica.interfaces;

import org.springframework.data.repository.CrudRepository;

import br.com.cotiinformatica.entities.Conta;

public interface IContaRepository extends CrudRepository<Conta, Integer> {

	
}
