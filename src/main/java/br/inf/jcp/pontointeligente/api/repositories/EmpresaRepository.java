/**
 * 
 */
package br.inf.jcp.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.inf.jcp.pontointeligente.api.entities.Empresa;

/**
 * @author joaocesar
 *
 */
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);

}
