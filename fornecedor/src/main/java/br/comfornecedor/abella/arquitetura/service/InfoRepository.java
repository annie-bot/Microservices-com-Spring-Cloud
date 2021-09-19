package br.comfornecedor.abella.arquitetura.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.comfornecedor.abella.arquitetura.model.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {
	
	InfoFornecedor findByEstado (String estado);
	

}
