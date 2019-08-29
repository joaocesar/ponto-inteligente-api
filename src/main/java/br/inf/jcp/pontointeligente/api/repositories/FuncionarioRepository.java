/**
 * 
 */
package br.inf.jcp.pontointeligente.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.inf.jcp.pontointeligente.api.entities.Funcionario;

/**
 * @author joaocesar
 *
 */
@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	Optional<Funcionario> findOne(Long id);

	Funcionario findByCpf(String cpf);
	
	Funcionario findByEmail(String email);
	
	Funcionario findByCpfOrEmail(String cpf, String email);
}
